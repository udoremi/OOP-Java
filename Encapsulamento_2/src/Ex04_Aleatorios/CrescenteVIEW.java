/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04_Aleatorios;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class CrescenteVIEW {
    public static void main(String[] args){
        try{
            CrescenteDTO crescenteDTO = new CrescenteDTO();
            CrescenteCTR crescenteCTR = new CrescenteCTR();
            
            crescenteDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")));
            crescenteDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: ")));
            crescenteDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: ")));

            JOptionPane.showMessageDialog(null, crescenteCTR.mostraOrdem(crescenteDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
