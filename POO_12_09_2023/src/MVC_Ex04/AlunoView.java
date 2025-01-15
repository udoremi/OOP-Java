/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex04;
import javax.swing.JOptionPane;
/**
 *
 * @author miiii
 */
public class AlunoView {
    public static void main(String args[]){
      try{
        AlunoDTO alunoDTO = new AlunoDTO();
        AlunoCTR alunoCTR = new AlunoCTR();
        
        alunoDTO.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª nota: ")));
        alunoDTO.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Informe a 2ª nota: ")));
        
        JOptionPane.showMessageDialog(null, alunoCTR.calcularMedia(alunoDTO));
        
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"ERRO!"+ e.getMessage());
      }  
    }
}
