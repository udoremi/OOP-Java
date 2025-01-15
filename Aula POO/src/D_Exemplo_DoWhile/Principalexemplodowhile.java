/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Exemplo_DoWhile;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Principalexemplodowhile {
    public static void main(String[] args){
        int numero;
        Exemplodowhile exemplodowhile = new Exemplodowhile();
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
            exemplodowhile.somar(numero);
        }while (numero != 0);
        
        JOptionPane.showMessageDialog(null, exemplodowhile.mostra());
    }
}
