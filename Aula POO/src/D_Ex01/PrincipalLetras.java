/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalLetras {
    public static void main(String[] args){
        String letra = "";
        Letras letras = new Letras();
        
        while(!letra.equalsIgnoreCase("0")){
            letra = JOptionPane.showInputDialog("Informe a letra");
        letras.verificar(letra);
 
        }
        JOptionPane.showMessageDialog(null, letras.mostrar());

    }
}
