/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class MotoristaVIEW {
    public static void main(String[] args){
        try{
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();
        
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade")));
            JOptionPane.showMessageDialog(null, motoristaCTR.calcular(motoristaDTO));
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema" + e.getMessage());
        }
    }
}
