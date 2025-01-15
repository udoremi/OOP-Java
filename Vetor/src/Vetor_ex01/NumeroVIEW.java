/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor_ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class NumeroVIEW {
    public static void main(String[] args){
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        
        int num[] = new int[5];
        
        for(int cont=0; cont<5; cont++){
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a posiçaõ " + cont));
        }
        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.verificarPosicao(numeroDTO));
    }
}
