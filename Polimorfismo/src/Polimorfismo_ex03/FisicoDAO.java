/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo_ex03;

/**
 *
 * @author doremi
 */
public class FisicoDAO extends ClienteDAO{
    public String mostraDadosCLi(FisicoDTO fisicoDTO){
        return super.mostraDadosCli(fisicoDTO) +
                "O CPF é: " + fisicoDTO.getCpf() +
                "\nO RG é: " + fisicoDTO.getRg();
    }
}
