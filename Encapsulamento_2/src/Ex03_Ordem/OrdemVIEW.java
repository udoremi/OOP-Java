/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03_Ordem;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class OrdemVIEW {
    public static void main(String [] args){
        try{
            OrdemDTO ordemDTO = new OrdemDTO();
            OrdemCTR ordemCTR = new OrdemCTR();
            
            ordemDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número")));
            ordemDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número")));
            ordemDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número")));
            ordemDTO.setN4(Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto número")));

            JOptionPane.showMessageDialog(null, ordemCTR.verifOrdem(ordemDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
