/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Exemplo_While;

/**
 *
 * @author Aluno
 */
public class Exemplowhile {
    private int soma, numero;
    
    public void somar(int numero){
        this.numero = numero;
        this.soma += this.numero;
    }
    public int mostra(){
        return this.soma;
    }
}
