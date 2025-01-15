/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor_ex01;

/**
 *
 * @author doremi
 */
public class NumeroDAO {
    private String resposta="";
    
    public String verificarPosicao(NumeroDTO numeroDTO){
        int n[] = numeroDTO.getN();
        
        for(int cont=0; cont<n.length; cont++){
            if(cont % 2 == 0){
                this.resposta += n[cont] + "\n";
            }
        }
        return this.resposta;
    }
}
