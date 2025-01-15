/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02_Triangulo;

/**
 *
 * @author doremi
 */
public class TriCTR {
    TriDAO triDAO = new TriDAO();
    
    public String verifTri(TriDTO triDTO){
        return triDAO.verifTri(triDTO);
    }
    
    public String calcTri(TriDTO triDTO){
        return triDAO.verifTri(triDTO);
    }
}
