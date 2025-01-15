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
public class CarroCTR {
    CarroDAO carroDAO = new CarroDAO();
    
    public String imprimiDadosCarro(CarroDTO carroDTO){
        return carroDAO.imprimiDadosCarro(carroDTO);
    }
}
