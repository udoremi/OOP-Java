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
public class MotoDAO extends VeiculoDAO {
    public String imprimiDadosMoto(MotoDTO motoDTO){
        return imprimiDadosVeiculo(motoDTO) +
                "\nA cilindrada é: " + motoDTO.getCilindrada() +
                "\nO tipo do motor é: " + motoDTO.getTipo_motor();
    }
}
