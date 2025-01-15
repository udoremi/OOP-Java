/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01_Solo;

/**
 *
 * @author doremi
 */
public class SoloCTR {
    SoloDAO soloDAO = new SoloDAO();
    
    public String verifAmostra(SoloDTO soloDTO){
        return soloDAO.verifAmostra(soloDTO);
    }
}
