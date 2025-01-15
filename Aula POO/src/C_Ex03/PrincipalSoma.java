/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_Ex03;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalSoma {
    public static void main(String[] args){
        Soma soma = new Soma();
        
        for(int i=1; i<=10;i++){
            soma.somar_Numeros(
            Integer.parseInt(JOptionPane.showInputDialog("Informe o número"))
            );
            
        }
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma.mostrar_Soma());
    }
}
