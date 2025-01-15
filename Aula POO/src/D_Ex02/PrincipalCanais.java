/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalCanais {
    public static void main(String[] args){
        int canal=1;
        Canais canais = new Canais();
        
        JOptionPane.showMessageDialog(null, "Canais: 9 - 12 - 23 - 40 - outros");
        while(canal!=0){
            canal = Integer.parseInt(JOptionPane.showInputDialog("Informe o canal"));
            canais.verificar(canal);
        }
        JOptionPane.showMessageDialog(null, canais.mostrar());
    }
}
