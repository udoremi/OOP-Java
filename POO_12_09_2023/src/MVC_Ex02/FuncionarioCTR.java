/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex02;

/**
 *
 * @author miiii
 */
public class FuncionarioCTR {
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String imprimir(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.imprimir(funcionarioDTO);
    }
}
