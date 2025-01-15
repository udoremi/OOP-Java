/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Exemplo_While1;

/**
 *
 * @author Aluno
 */

public class Exemplowhile1 {
    private String letra;
    private int qtd;
    
    public void verificar(String letra){
        this.letra = letra;
        if(this.letra.equalsIgnoreCase("x")){
            this.qtd++;
        }
    }
    public int mostra(){
        return this.qtd;
    }
}
