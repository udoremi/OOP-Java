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
public class QuadradaDAO {
    String resp = "";
    String diag = "";
    public String mostrarMatriz(QuadradaDTO quadradaDTO){
        
        int n[][] = quadradaDTO.getN();
        
        for(int linha=0;linha<20;linha++){
            for(int coluna=0;coluna<20;coluna++){
                this.resp += n[linha][coluna] + " ";
            }
            this.resp += "\n";
        }
        return this.resp;
    }
    
    public String mostrarDiagonal(QuadradaDTO quadradaDTO){
        
        int n[][] = quadradaDTO.getN();
        
        for(int linha=0;linha<20;linha++){
            for(int coluna=0;coluna<20;coluna++){
                if(linha==coluna){
                    this.diag += n[linha][coluna] + "";
                }else{
                    this.diag+="   ";
                }
            } 
            this.diag += "\n";
        }
    
    return this.diag;
}

}
