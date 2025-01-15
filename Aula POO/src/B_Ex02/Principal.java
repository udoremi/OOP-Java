/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Ex02;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Solo solo = new Solo();
        
        JOptionPane.showMessageDialog(null, "A amostra de solo é:  " +
                solo.classif(
                Double.parseDouble(JOptionPane.showInputDialog("Informe a pontuação da água"))));
    }
}
