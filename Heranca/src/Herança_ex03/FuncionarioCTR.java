/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_ex03;

/**
 *
 * @author Aluno
 */
public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String mostraDadosFunc(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.mostraDadosFunc(funcionarioDTO);
    }
}
