/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02_Triangulo;

/**
 *
 * @author doremi
 */
public class TriDAO {
    public String verifTri(TriDTO triDTO){
        if((triDTO.getLa() + triDTO.getLc() > triDTO.getLb()) && 
                (triDTO.getLa() + triDTO.getLb() > triDTO.getLc()) && 
                (triDTO.getLb() + triDTO.getLc() > triDTO.getLa())){
            return this.calcTri(triDTO);
        } else{
            return "Os números informados não formam um triângulo";
            }
    }
    
    public String calcTri(TriDTO triDTO){
        if((triDTO.getLa()==triDTO.getLb()) && (triDTO.getLb()==triDTO.getLc())){
            return "Triângulo equilátero";
        } else{
            if((triDTO.getLa()==triDTO.getLb()) || 
                    (triDTO.getLb()==triDTO.getLc()) || 
                    (triDTO.getLa()==triDTO.getLc())){
                return "Triângulo isósceles";
            } else{
                return "Triângulo escaleno";
            }
        }
    }
    
}
