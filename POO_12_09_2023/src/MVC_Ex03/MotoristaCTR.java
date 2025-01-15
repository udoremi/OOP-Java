/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex03;

/**
 *
 * @author miiii
 */
public class MotoristaCTR {
    
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String verificar(MotoristaDTO MotoristaDTO){
        return motoristaDAO.verificar(MotoristaDTO);
    }
}
