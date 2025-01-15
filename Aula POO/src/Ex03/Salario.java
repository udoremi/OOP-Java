/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03;
/**
 *
 * @author Aluno
 */
public class Salario {
    
    private double sal, aum, salfinal;
    
    double calcularSal(double sal, double aum){
        this.sal = sal;
        this.aum = aum;
        
        this.salfinal = this.sal + (this.sal*this.aum/100);
        
        return salfinal;
    }
    
}
