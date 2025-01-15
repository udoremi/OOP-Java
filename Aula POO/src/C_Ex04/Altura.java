/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_Ex04;

/**
 *
 * @author Aluno
 */
public class Altura {
    private int contalt;
    private double alt,soma;
    
    public void verif_Altura(double alt){
        this.alt = alt;
        
        this.soma += alt;
        
        if(this.alt>=2){
            this.contalt += 1;
        }
    }
    private double calc_Med(){
        return this.soma / 20;
    }
    public String mostra_Dados(){
        return "A média das alturas é: " + this.calc_Med() +
                "\nA quantidade de pessoas com mais de 2m é: " + this.contalt;
    }
}
