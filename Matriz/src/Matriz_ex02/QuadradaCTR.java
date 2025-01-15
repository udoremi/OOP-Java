/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz_ex02;

/**
 *
 * @author doremi
 */
public class QuadradaCTR {
    QuadradaDAO quadradaDAO = new QuadradaDAO();
    
    public String mostrarMatriz(QuadradaDTO quadradaDTO){
        return quadradaDAO.mostrarMatriz(quadradaDTO);
    }
    
    public String mostrarDiagonal(QuadradaDTO quadradaDTO){
        return quadradaDAO.mostrarDiagonal(quadradaDTO);
    }
}


