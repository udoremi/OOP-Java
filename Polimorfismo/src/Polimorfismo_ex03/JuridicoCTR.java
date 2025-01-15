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
public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    
    public String mostraDadosCli(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostraDadosCli(juridicoDTO);
    }
}
