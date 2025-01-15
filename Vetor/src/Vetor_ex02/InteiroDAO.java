/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor_ex02;

/**
 *
 * @author doremi
 */
public class InteiroDAO {
    private String resp = "";
    
    public String mostraDecres(InteiroDTO inteiroDTO){
        int n[] = inteiroDTO.getN();
        
        for(int i=19; i>=0; i--){
            this.resp += n[i] + " ";
        }
        return this.resp;
    }
}
