/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalSalario {
    
    public static void main(String[] args){
        Salario salario = new Salario();
        
        JOptionPane.showMessageDialog(null, "O salário é: " +
                salario.calcularSal(
                Double.parseDouble(JOptionPane.showInputDialog("Informe o salário base: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de aumento: "))
                ));
    }
    
}
