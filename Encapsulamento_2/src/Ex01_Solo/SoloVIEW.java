/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01_Solo;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class SoloVIEW {
    public static void main(String[] args){
        try{
            SoloDTO soloDTO = new SoloDTO();
            SoloCTR soloCTR = new SoloCTR();
            
            soloDTO.setAgua(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pontos de água")));
            
            JOptionPane.showMessageDialog(null, soloCTR.verifAmostra(soloDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
