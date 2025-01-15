/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca_ex01;

/**
 *
 * @author doremi
 */
public class VeiculoDAO {
    public String imprimiDadosVeiculo(VeiculoDTO veiculoDTO){
        return "A placa é: " + veiculoDTO.getPlaca() +
                "\nA cor é: " + veiculoDTO.getCor();
    }
}
