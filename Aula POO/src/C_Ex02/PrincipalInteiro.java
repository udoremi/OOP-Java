 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_Ex02;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalInteiro {
    public static void main(String[] args){
        Inteiro inteiro = new Inteiro();
        
        JOptionPane.showMessageDialog(null, inteiro.receber_Numeros
        (Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º número")),
        (Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º número"))
                )));
    }
}
