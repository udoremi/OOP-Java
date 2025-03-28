/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2_projeto;

/**
 *
 * @author mathe
 */
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class TelaPrincipal extends JFrame {
    private DefaultListModel<String> listaUsuariosModel;
    private UsuarioDAO usuarioDAO;

    public TelaPrincipal() {
        setTitle("Gerenciamento de Usuários");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        FabricaUsuario fabrica = new FabricaUsuario();
        usuarioDAO = new UsuarioDAO(fabrica);

        listaUsuariosModel = new DefaultListModel<>();
        JList<String> listaUsuarios = new JList<>(listaUsuariosModel);

        JPanel botoesPanel = new JPanel();
        JButton botaoAdicionar = new JButton("Adicionar");
        JButton botaoAtualizar = new JButton("Atualizar");
        JButton botaoRemover = new JButton("Remover");
        JButton botaoAtualizarLista = new JButton("Atualizar Lista");

        botaoAdicionar.addActionListener(e -> abrirFormulario(null));
        botaoAtualizar.addActionListener(e -> atualizarUsuario(listaUsuarios.getSelectedValue()));
        botaoRemover.addActionListener(e -> removerUsuario(listaUsuarios.getSelectedValue()));
        botaoAtualizarLista.addActionListener(e -> carregarUsuarios());

        botoesPanel.add(botaoAdicionar);
        botoesPanel.add(botaoAtualizar);
        botoesPanel.add(botaoRemover);
        botoesPanel.add(botaoAtualizarLista);

        add(new JScrollPane(listaUsuarios), BorderLayout.CENTER);
        add(botoesPanel, BorderLayout.SOUTH);

        carregarUsuarios();
    }

    private void carregarUsuarios() {
        listaUsuariosModel.clear();
        ArrayList<Usuario> usuarios = usuarioDAO.listarUsuarios();
        for (Usuario usuario : usuarios) {
            listaUsuariosModel.addElement(usuario.toString());
        }
    }

    private void abrirFormulario(Usuario usuario) {
        FormularioUsuario formulario = new FormularioUsuario(usuario);
        if (formulario.mostrar()) {
            if (usuario == null) {
                usuarioDAO.adicionarUsuario(formulario.getNome(), formulario.getEmail(), formulario.getTelefone(),
                        formulario.getDataNascimento());
            } else {
                usuarioDAO.atualizarUsuario(usuario.getId(), formulario.getNome(), formulario.getEmail(),
                        formulario.getTelefone(), formulario.getDataNascimento());
            }
            carregarUsuarios();
        }
    }

    private void atualizarUsuario(String usuarioSelecionado) {
    if (usuarioSelecionado == null) {
        JOptionPane.showMessageDialog(this, "Selecione um usuário para atualizar.");
        return;
    }

    // Extrai o ID do usuário selecionado (assumindo o formato "ID - Nome")
    int id = Integer.parseInt(usuarioSelecionado.split(" - ")[0]);

    // Busca o usuário na lista de usuários
    Usuario usuarioParaAtualizar = usuarioDAO.listarUsuarios().stream()
        .filter(u -> u.getId() == id)
        .findFirst()
        .orElse(null);

    if (usuarioParaAtualizar == null) {
        JOptionPane.showMessageDialog(this, "Usuário não encontrado.");
        return;
    }

    // Abre o formulário de atualização com os dados do usuário
    abrirFormulario(usuarioParaAtualizar);
}


    private void removerUsuario(String usuarioSelecionado) {
        if (usuarioSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Selecione um usuário para remover.");
            return;
        }
        int id = Integer.parseInt(usuarioSelecionado.split(" - ")[0]);
        usuarioDAO.removerUsuario(id);
        carregarUsuarios();
    }

    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

