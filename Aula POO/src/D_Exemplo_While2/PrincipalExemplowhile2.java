/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Exemplo_While2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalExemplowhile2 {
    public static void main(String[] args){
        int cont = 1;
        int numero;
        Exemplowhile2 exemplowhile2 = new Exemplowhile2();
        
        while(cont <= 10){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
            exemplowhile2.somar(numero);
            cont++;
        }
        JOptionPane.showMessageDialog(null, exemplowhile2.mostra());
    }
}
