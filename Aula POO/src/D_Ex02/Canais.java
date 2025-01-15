/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Ex02;

/**
 *
 * @author Aluno
 */
public class Canais {
    private String resp;
    private int canal,canal9,canal12,canal23,canal40,outrocanal;
    
    public void verificar(int canal){
        this.canal = canal;
        
        if(this.canal==9){
            this.canal9++;
        } else{
            if(this.canal==12){
                this.canal12++;
            } else{
                if(this.canal==23){
                    this.canal23++;
                } else{
                    if(this.canal==40){
                        this.canal40++;
                    } else{
                        if(this.canal !=0){
                        this.outrocanal++;
                    }
                }
            }
        }
    }
}
    
    public String mostrar(){
        this.resp = "Audiência do canal 9: "+this.canal9+
                    "\nAudiência do canal 12: "+this.canal12+
                    "\nAudiência do canal 23: "+this.canal23+
                    "\nAudiência do canal 40: "+this.canal40+
                    "\nAudiência de outros canais: "+this.outrocanal;
        return this.resp;
    }
    
}
