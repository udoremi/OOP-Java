/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Ex03;

/**
 *
 * @author Aluno
 */
public class Numero {
    private int n1,n2,n3,n4;
    private String ordem;
    
    public String decres(int n1, int n2, int n3, int n4){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        
       if((this.n4 > this.n3) && (this.n4 > this.n2) && (this.n4 > this.n1)){
               this.ordem = this.n4 + " - " + this.n3 + " - " + this.n2 + " - "+ this.n1;
       }else{
           if((n4<n3) && (n4>n2) && (n4>n1)){
               this.ordem  = this.n3 + " - " + this.n4 + " - " + this.n2 + " - "+ this.n1;
       }else{
            if((n4>n3) && (n4<n2) && (n4>n1)){
                this.ordem = this.n3 + " - " + this.n2 + " - " + this.n4 + " - "+ this.n1;
       }else{
            if((n4 > n3) && (n4 > n2) && (n4 < n1)){
                this.ordem = this.n3 + " - " + this.n2 + " - " + this.n1 + " - "+ this.n4;
                }
            }
           }
       }
       return this.ordem;
}
}
