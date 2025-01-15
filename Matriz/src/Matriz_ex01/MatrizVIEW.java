/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz_ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class MatrizVIEW {
    public static void main (String[] args){
        MatrizDTO matrizDTO = new MatrizDTO();
        MatrizCTR matrizCTR = new MatrizCTR();
        
        int num[][] = new int[2][3];
        
        for(int linha=0; linha<2; linha++){
            for(int coluna=0; coluna<3; coluna++){
                num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da linha "
                + linha + " Coluna " + coluna));
            }
        }
        matrizDTO.setN(num);
        JOptionPane.showMessageDialog(null, matrizCTR.mostrarMatriz(matrizDTO));
    }
}
