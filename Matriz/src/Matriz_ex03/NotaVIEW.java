/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz_ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class NotaVIEW {
    public static void main(String [] args){
        NotaDTO notaDTO = new NotaDTO();
        NotaCTR notaCTR = new NotaCTR();
        
        int linha;
        double notas[][] = new double[6][20];
        
        for(int i=0;i<3;i++){
            notas[i][0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno " +i));
            notas[i][1] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1 do aluno " +i));
            notas[i][2] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2 do aluno " +i));
            notas[i][3] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 3 do aluno " +i));
            notas[i][4] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 4 do aluno " +i));
        }
        notaDTO.setNotas(notas);
        notaCTR.calcularMedia(notaDTO);
        
        JOptionPane.showMessageDialog(null, notaCTR.imprimir());
    }
}
