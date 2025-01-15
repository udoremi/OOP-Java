/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02_Lanches;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class LancheVIEW {
    public static void main(String[] args){
        try{
            LancheDTO lancheDTO = new LancheDTO();
            LancheCTR lancheCTR = new LancheCTR();
            
            while(lancheDTO.getCod()!=0){
                lancheDTO.setCod(Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"
                + "\n1 - Hamburguer " + "\n2 - Cheeseburguer " + "\n3 - Misto Quente " + "\n4 - Americano "
                + "\n5 - Queijo Prato " + "\n0 - Encerrar ")));
                lancheCTR.calcPreco(lancheDTO);
            }
            JOptionPane.showMessageDialog(null, lancheCTR.mostraPreco(lancheDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
