/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Exemplo_DoWhile;

/**
 *
 * @author Aluno
 */
public class Exemplodowhile {
    private int soma, numero;
    
    public void somar(int numero){
        this.numero = numero;
        this.soma += numero;
    }
    
    public int mostra(){
        return this.soma;
    }
}
