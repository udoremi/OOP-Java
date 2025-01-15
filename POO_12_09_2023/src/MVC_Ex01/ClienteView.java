/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author miiii
 */
public class ClienteView {
    public static void main (String args[]){
      try{  
        ClienteDTO clienteDTO = new ClienteDTO();
        ClienteCTR clienteCTR = new ClienteCTR();
        
        clienteDTO.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
        clienteDTO.setRg(JOptionPane.showInputDialog("Informe seu RG: "));
        clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));
        
        JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRg(clienteDTO));
        JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, "ERRO!" + e.getMessage());
      }//fecha tratamento
    }//fecha main
}
