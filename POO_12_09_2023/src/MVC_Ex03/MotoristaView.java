/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author miiii
 */
public class MotoristaView {
    public static void main(String args[]){
      
      try{  
        MotoristaDTO motoristaDTO = new MotoristaDTO();
        MotoristaCTR motoristaCTR = new MotoristaCTR();
        
        motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do motorista: ")));
        
        JOptionPane.showMessageDialog(null, motoristaCTR.verificar(motoristaDTO));
        
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"ERRO!"+ e.getMessage());
      }
    }
}
