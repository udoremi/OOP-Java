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
public class OrdemCTR {
    OrdemDAO ordemDAO = new OrdemDAO();
    
    public String verifOrdem(OrdemDTO ordemDTO){
        return ordemDAO.verifNum(ordemDTO);
    }
}
