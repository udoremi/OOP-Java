/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor_ex04;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class OperacaoVIEW {
    public static void main(String[] args){
        OperacaoDTO operacaoDTO = new OperacaoDTO();
        OperacaoCTR operacaoCTR = new OperacaoCTR();
    
        int num1[] = new int[10];
        int num2[] = new int[10];
        
        operacaoDTO.setOpcao(JOptionPane.showInputDialog("Informe a Opção - A, S, M, D"));
        
        for(int i=0; i<10; i++){
            num1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a posição " + i + " - Vetor 1"));
        }
        for(int i=0; i<10; i++){
            num2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para a posição " + i + " - Vetor 2"));
        }
        
        operacaoDTO.setVetor1(num1);
        operacaoDTO.setVetor2(num2);
        operacaoCTR.escolha(operacaoDTO);
        
        JOptionPane.showMessageDialog(null, operacaoCTR.imprimir());
    }
}
