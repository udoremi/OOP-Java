/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo_ex03;

/**
 *
 * @author doremi
 */
public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    
    public String mostraDadosCli(FisicoDTO fisicoDTO){
        return fisicoDAO.mostraDadosCli(fisicoDTO);
    }
}
