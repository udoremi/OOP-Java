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
public class InteiroCTR {
    InteiroDAO inteiroDAO = new InteiroDAO();
    
    public String mostraDecres(InteiroDTO inteiroDTO){
        return inteiroDAO.mostraDecres(inteiroDTO);
    }
}
