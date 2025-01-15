/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor_ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class InteiroVIEW {
    public static void main(String[] args){
        InteiroDTO inteiroDTO = new InteiroDTO();
        InteiroCTR inteiroCTR = new InteiroCTR();
        
        int num[] = new int[20];
        
        for(int i=0; i<20; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a posição " + i));
        }
        inteiroDTO.setN(num);
        JOptionPane.showMessageDialog(null, inteiroCTR.mostraDecres(inteiroDTO));
    }
}
