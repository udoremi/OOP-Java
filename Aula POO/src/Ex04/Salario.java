/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04;

/**
 *
 * @author Aluno
 */
public class Salario {
    
    private double salbase, salfinal, comissao, vendas;
    
    String calcularSal(double salbase, double vendas){
        this.salbase = salbase;
        this.vendas = vendas;
        
        this.comissao = this.vendas * 0.04;
        this.salfinal = this.salbase + this.comissao;
        
        return "O valor da comissão é: " + this.comissao +
                "\nO salário final do funcionário é: " + this.salfinal;
    }
    
}
