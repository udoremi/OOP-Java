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
public class MatrizDAO {
    String resposta="";
    public String mostrarMatriz(MatrizDTO matrizDTO){
        int n[][] = matrizDTO.getN();
        
        for(int linha=0; linha<2; linha++){
            for(int coluna=0; coluna<3; coluna++){
                this.resposta += n[linha][coluna] + " "; 
            }
            this.resposta += "\n";
        }
        return this.resposta;
    }
    
}
