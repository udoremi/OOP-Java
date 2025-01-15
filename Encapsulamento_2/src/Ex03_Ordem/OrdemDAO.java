/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03_Ordem;

/**
 *
 * @author doremi
 */
public class OrdemDAO {
    
    public String verifNum(OrdemDTO ordemDTO){
        if(ordemDTO.getN1() > ordemDTO.getN4()){
            return "Ordem decrescente: " + ordemDTO.getN3() + ", " + ordemDTO.getN2() + ", " + ordemDTO.getN1() + ", " + ordemDTO.getN4();
        } else{
            if(ordemDTO.getN2() > ordemDTO.getN4()){
                return "Ordem decrescente: " + ordemDTO.getN3() + ", " + ordemDTO.getN2() + ", " + ordemDTO.getN4() + ", " + ordemDTO.getN1(); 
            } else{
                if(ordemDTO.getN3() > ordemDTO.getN4()){
                    return "Ordem decrescente: " + ordemDTO.getN3() + ", " + ordemDTO.getN4() + ", " + ordemDTO.getN2() + ", " + ordemDTO.getN1();
                } else{
                    return "Ordem decrescente: " + ordemDTO.getN4() + ", " + ordemDTO.getN3() + ", " + ordemDTO.getN2() + ", " + ordemDTO.getN1();
                }
            }
        }
    }
}
