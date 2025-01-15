/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz_ex03;

/**
 *
 * @author doremi
 */
public class NotaDAO {
    private double notas[][] = new double[20][6];
    String resp="";
    public void calcularMedia(NotaDTO notaDTO){
        
        double notas[][] = notaDTO.getNotas();
        
        for(int i=0;i<20;i++){
                notas[i][5] = (notas[i][1] + notas[i][2] + notas[i][3] + notas[i][4]) / 4;
                
                this.resp += "RA: " + notas[i][0] + "  ";
                this.resp += "N1: " + notas[i][1] + "  ";
                this.resp += "N2: " + notas[i][2] + "  ";
                this.resp += "N3: " + notas[i][3] + "  ";
                this.resp += "N4: " + notas[i][4] + "  ";
                this.resp += "Media: " + notas[i][5] + "  \n";
        }
    }
    
    public String imprimir(){
        return this.resp;
    }
}
