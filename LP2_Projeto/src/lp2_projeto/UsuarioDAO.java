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
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class UsuarioDAO {
    private Fabrica<Usuario> fabrica;

    public UsuarioDAO(Fabrica<Usuario> fabrica) {
        this.fabrica = fabrica;
    }

    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT id, nome, email, telefone, data_nascimento FROM usuarios";

        try (Connection conn = ConexaoBanco.getInstancia().getConexao();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                LocalDate dataNascimento = rs.getDate("data_nascimento").toLocalDate();

                usuarios.add(fabrica.criar(id, nome, email, telefone, dataNascimento));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public void adicionarUsuario(String nome, String email, String telefone, LocalDate dataNascimento) {
        String query = "INSERT INTO usuarios (nome, email, telefone, data_nascimento) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoBanco.getInstancia().getConexao();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, telefone);
            stmt.setDate(4, Date.valueOf(dataNascimento));
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarUsuario(int id, String nome, String email, String telefone, LocalDate dataNascimento) {
        String query = "UPDATE usuarios SET nome = ?, email = ?, telefone = ?, data_nascimento = ? WHERE id = ?";

        try (Connection conn = ConexaoBanco.getInstancia().getConexao();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, telefone);
            stmt.setDate(4, Date.valueOf(dataNascimento));
            stmt.setInt(5, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerUsuario(int id) {
        String query = "DELETE FROM usuarios WHERE id = ?";

        try (Connection conn = ConexaoBanco.getInstancia().getConexao();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
