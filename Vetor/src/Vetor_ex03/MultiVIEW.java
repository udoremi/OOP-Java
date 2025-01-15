/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor_ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class MultiVIEW {
    public static void main(String[] args){
        MultiDTO multiDTO = new MultiDTO();
        MultiCTR multiCTR = new MultiCTR();
        
        int num1[] = new int[20];
        int num2[] = new int[20];
        
        for(int i=0; i<20; i++){
            num1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a posição " + i));
        }
        for(int i=0; i<20; i++){
            num2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a posição " + i));
        }
        
        multiDTO.setVetor1(num1);
        multiDTO.setVetor2(num2);
        multiCTR.calcular(multiDTO);
        
        JOptionPane.showMessageDialog(null, multiCTR.imprimir());
    }
    
}
