/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Ex04;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args){
        Classificacao classificacao = new Classificacao();
        
        JOptionPane.showMessageDialog(null, "A classificação é:  "+
                classificacao.tabela(
                Double.parseDouble(JOptionPane.showInputDialog("Informe o peso")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"))
                ));
    }
}
