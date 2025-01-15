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
public class ClienteDAO {
    public String mostraDadosCli(ClienteDTO clienteDTO){
        return "O nome é: " + clienteDTO.getNome()
                + "\nO endereço é: " + clienteDTO.getEndereco()
                + "\nO número é: " + clienteDTO.getNumero()
                + "\nA cidade é: " + clienteDTO.getCidade()
                + "\nO estado é: " + clienteDTO.getEstado();
    }
}
