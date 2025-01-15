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
public class MultiCTR {
    MultiDAO multiDAO = new MultiDAO();
    
    public void calcular(MultiDTO multiDTO){
        multiDAO.calcular(multiDTO);
    }
    public String imprimir(){
        return multiDAO.imprimir();
    }
}
