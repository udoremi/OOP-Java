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
public class JuridicoDAO extends ClienteDAO{
    public String mostraDadosJuri(JuridicoDTO juridicoDTO){
        return mostraDadosCli(juridicoDTO) +
                "\nO CNPJ é: " + juridicoDTO.getCnpj() + 
               "\nA inscrição estadual é: " + juridicoDTO.getIe();
    }
}
