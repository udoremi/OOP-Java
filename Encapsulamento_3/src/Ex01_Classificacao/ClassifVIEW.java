/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01_Classificacao;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class ClassifVIEW {
    public static void main(String[] args){
        try{
            ClassifDTO classifDTO = new ClassifDTO();
            ClassifCTR classifCTR = new ClassifCTR();
            
            classifDTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura")));
            classifDTO.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso")));
            
            JOptionPane.showMessageDialog(null, classifCTR.mostraClassif(classifDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
