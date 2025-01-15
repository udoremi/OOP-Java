/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_Ex04;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalAltura {
    public static void main(String[] args){
        Altura altura = new Altura();
        
        for(int i=1; i<=20;i++){
            altura.verif_Altura(
            Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a "+i+"º altura:")));
        }
        JOptionPane.showMessageDialog(null, altura.mostra_Dados());
    }
}
