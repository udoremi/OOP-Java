/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz_ex01;

/**
 *
 * @author doremi
 */
public class MatrizCTR {
    MatrizDAO matrizDAO = new MatrizDAO();
    
    public String mostrarMatriz(MatrizDTO matrizDTO){
        return matrizDAO.mostrarMatriz(matrizDTO);
    }
}
