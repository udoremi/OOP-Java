/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo_ex02;

/**
 *
 * @author doremi
 */
public class MediaDAO {
    public String imprimir(MediaDTO mediaDTO){
        if(mediaDTO.getTipo() == 1){
            calcularMedia(mediaDTO.getN1(), mediaDTO.getN2());
            return "A média final é: " + media;
        } else{
            if(mediaDTO.getTipo() == 2){
                calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3());
                return "A média final é: " + media;
        } else{
                if(mediaDTO.getTipo() == 3){
                   calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3(), mediaDTO.getN4());
                   return "A média final é: " + media;
                } else{
                    return "Tipo inválido";
                }
            }
        }
    }
    
    double media;
    
    private void calcularMedia(double n1, double n2){
        media = (n1 + n2)/2;
    }
    private void calcularMedia(double n1, double n2, double n3){
        media = (n1 + n2 + n3)/3;
    }
    private void calcularMedia(double n1, double n2, double n3, double n4){
        media = (n1 + n2 + n3 + n4)/4;
    }
}
