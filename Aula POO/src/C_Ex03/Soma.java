/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_Ex03;

/**
 *
 * @author Aluno
 */
public class Soma {
    private int num, soma;
    
    public void somar_Numeros(int num){
        this.num = num;
            this.soma += this.num;
        }
 
    
    public int mostrar_Soma(){
        return this.soma;
    }
}
