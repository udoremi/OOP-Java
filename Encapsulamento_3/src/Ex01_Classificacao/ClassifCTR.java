/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01_Classificacao;

/**
 *
 * @author doremi
 */
public class ClassifCTR {
    ClassifDAO classifDAO = new ClassifDAO();
    
    public String mostraClassif(ClassifDTO classifDTO){
        return classifDAO.mostraClassif(classifDTO);
    }
}
