/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex04;

/**
 *
 * @author miiii
 */
public class AlunoCTR {
    
    AlunoDAO alunoDAO = new AlunoDAO();
    
    public String calcularMedia(AlunoDTO alunoDTO){
        return alunoDAO.calcularMedia(alunoDTO);
    }
}
