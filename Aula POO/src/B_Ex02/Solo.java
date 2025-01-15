/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Ex02;

/**
 *
 * @author Aluno
 */
public class Solo {
    private double agua;
    private String tipo;
    
    public String classif(double agua){
        this.agua = agua;
        
        if(this.agua <= 10){
            this.tipo = "Rochosa";
        }
        else{
        if((this.agua > 10) && (this.agua <= 40)){
            this.tipo = "Firme";
        }
        else{
            if((this.agua > 40) && (this.agua<=80)){
            this.tipo = "Pantanosa";
        }
        else{
            this.tipo = "Quantidade inválida";
        }
        }
        }
        return this.tipo;
    }
}
