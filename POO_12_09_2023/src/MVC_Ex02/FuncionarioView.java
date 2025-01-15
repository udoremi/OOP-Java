/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author miiii
 */
public class FuncionarioView {
    public static void main(String args[]){
      try{  
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        funcionarioDTO.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do funcionário: ")));
        funcionarioDTO.setTel(JOptionPane.showInputDialog("Informe o telefone do funcionário: "));
        
        JOptionPane.showMessageDialog(null, funcionarioDAO.imprimir(funcionarioDTO));
        
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, "ERRO!"+ e.getMessage());
      }
    }
    
}
