/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz_ex02;
import javax.swing.JOptionPane;
//import java.util.Random;
/**
 *
 * @author doremi
 */
public class QuadradaVIEW {
    public static void main(String[] args){
        // Random random = new Random();
        
        QuadradaDTO quadradaDTO = new QuadradaDTO();
        QuadradaCTR quadradaCTR = new QuadradaCTR();
        
        int num[][] = new int[20][20];
        
        for(int linha=0;linha<20;linha++){
            for(int coluna=0;coluna<20;coluna++){
                num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da linha "
                + linha + " coluna " + coluna));
                //matriz[linha][coluna] = random.nextInt(9);
            }
        }
        quadradaDTO.setN(num);
        JOptionPane.showMessageDialog(null, quadradaCTR.mostrarMatriz(quadradaDTO) + quadradaCTR.mostrarDiagonal(quadradaDTO));
    }
}
