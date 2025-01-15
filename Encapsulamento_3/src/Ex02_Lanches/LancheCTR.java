/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02_Lanches;

/**
 *
 * @author doremi
 */
public class LancheCTR {
    LancheDAO lancheDAO = new LancheDAO();
    
    public void calcPreco(LancheDTO lancheDTO){
        lancheDAO.calcPreco(lancheDTO);
    }
    public String mostraPreco(LancheDTO lancheDTO){
        return lancheDAO.mostraPreco(lancheDTO);
    }
}
