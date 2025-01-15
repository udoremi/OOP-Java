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
public class PessoaDAO {
    public String mostraDadosPes(PessoaDTO pessoaDTO){
        return "Nome: " + pessoaDTO.getNome() +
                "\nEndereço: " + pessoaDTO.getEndereco() +
                "\nTelefone: " + pessoaDTO.getTelefone() +
                "\nIdade: " + pessoaDTO.getIdade();
    }
}
