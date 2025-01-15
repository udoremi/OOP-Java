/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_ex02;

/**
 *
 * @author Aluno
 */
public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    
    public String mostraDadosJuri(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostraDadosJuri(juridicoDTO);
    }
}
