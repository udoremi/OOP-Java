/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PessoaVIEW {
    public static void main(String[] args){
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
    
        funcionarioDTO.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        funcionarioDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço:"));
        funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe o telefone:"));
        funcionarioDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade")));
        funcionarioDTO.setSiape(JOptionPane.showInputDialog("Informe o siape:"));
        funcionarioDTO.setFuncao(JOptionPane.showInputDialog("Informe a função:"));
        
        JOptionPane.showMessageDialog(null, funcionarioCTR.mostraDadosFunc(funcionarioDTO));
        
        AlunoDTO alunoDTO = new AlunoDTO();
        AlunoCTR alunoCTR = new AlunoCTR();
        
        alunoDTO.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        alunoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço:"));
        alunoDTO.setTelefone(JOptionPane.showInputDialog("Informe o telefone:"));
        alunoDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade")));
        alunoDTO.setProntuario(JOptionPane.showInputDialog("Informe o prontuário"));
        alunoDTO.setCurso(JOptionPane.showInputDialog("Informe o curso"));
        
        JOptionPane.showMessageDialog(null, alunoCTR.mostraDadosAluno(alunoDTO));
    }
}
