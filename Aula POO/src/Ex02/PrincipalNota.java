/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalNota {
    
    public static void main(String[] args){
        Nota nota = new Nota();
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3: "));
        int p1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 1: "));
        int p2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 2: "));
        int p3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 3: "));
        JOptionPane.showMessageDialog(null, nota.calculoMedia(n1,n2,n3,p1,p2,p3));
        
       /* ou:
        JOptionPane.showMessageDialog(null,
                nota.calculoMedia(
                    Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
                    Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
                    Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3: "));
                    Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 1: "));
                    Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 2: "));
                    Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 3: "));
*/
    }
    
}
