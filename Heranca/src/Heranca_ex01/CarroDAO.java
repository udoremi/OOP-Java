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
public class CarroDAO extends VeiculoDAO {
    public String imprimiDadosCarro(CarroDTO carroDTO){
        return imprimiDadosVeiculo(carroDTO) +
                "\nA potência é: " + carroDTO.getPotencia() +
                "\nA quantidade de portas é: " + carroDTO.getQtd_portas();
    }
}
