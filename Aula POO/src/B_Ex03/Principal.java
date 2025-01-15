/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Ex03;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String [] args){
        Numero numero = new Numero();
        
        JOptionPane.showMessageDialog(null, "Informe os 3 primeiros números em ordem crescente.");
        
        JOptionPane.showMessageDialog(null, "A ordem decrescente é:  " +
                numero.decres(
                Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º número")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º número")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o 3º número")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o 4º número"))
                ));
    }
}
