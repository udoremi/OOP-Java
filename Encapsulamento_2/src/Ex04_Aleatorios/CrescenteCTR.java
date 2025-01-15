/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04_Aleatorios;

/**
 *
 * @author doremi
 */
public class CrescenteCTR {
    CrescenteDAO crescenteDAO = new CrescenteDAO();
    
    public String mostraOrdem(CrescenteDTO crescenteDTO){
        return crescenteDAO.mostraOrdem(crescenteDTO);
    }
}
