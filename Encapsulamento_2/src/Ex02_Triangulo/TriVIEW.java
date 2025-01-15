/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02_Triangulo;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class TriVIEW {
    public static void main(String [] args){
        try{
            TriDTO triDTO = new TriDTO();
            TriCTR triCTR = new TriCTR();
    
            triDTO.setLa(Integer.parseInt(JOptionPane.showInputDialog("Informe o lado A")));
            triDTO.setLb(Integer.parseInt(JOptionPane.showInputDialog("Informe o lado B")));
            triDTO.setLc(Integer.parseInt(JOptionPane.showInputDialog("Informe o lado C")));
        
            JOptionPane.showMessageDialog(null, triCTR.verifTri(triDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
