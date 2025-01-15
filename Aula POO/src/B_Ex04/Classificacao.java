/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Ex04;

/**
 *
 * @author Aluno
 */
public class Classificacao {
    private double peso, alt;
    private String classif;
    
    public String tabela(double peso, double alt){
        this.peso = peso;
        this.alt = alt;
        
        if (this.alt<1.20){
            if(this.peso <= 60){
                this.classif = "A";
            }else{
                if((peso>60) && (peso<=90)){
                this.classif = "B";
            }else{
                    if(peso>90){
                        this.classif = "C";
                    }
                }
            }
        }//fecha if de altura
        
        else{
            if((this.alt>=1.20) && (this.alt<=1.70)){
            if(this.peso <= 60){
                this.classif = "D";
            }else{
                if((peso>60) && (peso<=90)){
                this.classif = "E";
            }else{
                    if(peso>90){
                        this.classif = "F";
                    }
                }
            }
        }
        
        else{
        if (this.alt>1.70){
            if(this.peso <= 60){
                this.classif = "G";
            }else{
                if((peso>60) && (peso<=90)){
                this.classif = "H";
            }else{
                    if(peso>90){
                        this.classif = "I";
                    }
                }
            }
        }
        }
        }
        return this.classif;
    }
}
