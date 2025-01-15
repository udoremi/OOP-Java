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
public class FuncionarioDAO extends PessoaDAO{
    public String mostraDadosFunc(FuncionarioDTO funcionarioDTO){
        return mostraDadosPes(funcionarioDTO) +
                "\nSiape: " + funcionarioDTO.getSiape() +
                "\nFunção: " + funcionarioDTO.getFuncao() +
                this.calcAposentadoria(funcionarioDTO);
        
        
    }
    
    private String calcAposentadoria(FuncionarioDTO funcionarioDTO){
        int calc;
        
        if(funcionarioDTO.getIdade() < 60){
            calc = 60 - funcionarioDTO.getIdade();
            return "\nFaltam " + calc + " anos para se aposentar.";
        } else{
            return "\nJá é possível se aposentar.";
        }
    }
    
}
