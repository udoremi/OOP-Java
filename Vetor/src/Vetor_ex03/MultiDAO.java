/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor_ex03;

/**
 *
 * @author doremi
 */
public class MultiDAO {
    private String resp = "";
    private int n3[];
    
    public void calcular(MultiDTO multiDTO){
        int n1[] = multiDTO.getVetor1();
        int n2[] = multiDTO.getVetor2();
        
        for(int i=0; i<n1.length; i++){
            n3[i] = n1[i] * n2[i];
        }
    }
    public String imprimir(){
        for(int i=0; i<20; i++){
            resp += n3[i] + " ";
        }
        return this.resp;
}
}
    