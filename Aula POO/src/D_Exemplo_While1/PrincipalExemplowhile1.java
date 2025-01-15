/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Exemplo_While1;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalExemplowhile1 {
    public static void main(String[] args){
        String letra = "x";
        Exemplowhile1 exemplowhile1 = new Exemplowhile1();
        
        while(letra.equalsIgnoreCase("x")){
            letra = JOptionPane.showInputDialog("Informe a letra");
            exemplowhile1.verificar(letra);
        }
        JOptionPane.showMessageDialog(null, exemplowhile1.mostra());
    }
}
