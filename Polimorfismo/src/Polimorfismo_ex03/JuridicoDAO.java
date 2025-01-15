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
public class JuridicoDAO extends ClienteDAO{
    public String mostraDadosCli(JuridicoDTO juridicoDTO){
        return super.mostraDadosCli(juridicoDTO) +
                "\nO CNPJ é: " + juridicoDTO.getCnpj() + 
               "\nA inscrição estadual é: " + juridicoDTO.getIe();
    }
}
