/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_ex02;

/**
 *
 * @author Aluno
 */
public class FisicoDAO extends ClienteDAO{
    public String mostraDadosFisi(FisicoDTO fisicoDTO){
        return mostraDadosCli(fisicoDTO) +
                "O CPF é: " + fisicoDTO.getCpf() +
                "\nO RG é: " + fisicoDTO.getRg();
    }
}
