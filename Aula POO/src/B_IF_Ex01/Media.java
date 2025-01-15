/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex01;

/**
 *
 * @author Aluno
 */
public class Media {
    private double n1,n2,mediaf;
    private String resp;
    
    public String calcular(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
        this.mediaf = (this.n1+this.n2) / 2;
        
        if(this.mediaf >= 6){
            this.resp = "Aprovado";
        }
        else{
            if((this.mediaf >= 4)&&(this.mediaf < 6)){
                this.resp = "Recuperação";
            }
            else{
                this.resp = "Reprovado";
            }
        }
        return this.resp;
    }    
}
