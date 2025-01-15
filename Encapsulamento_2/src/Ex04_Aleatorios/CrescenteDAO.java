/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04_Aleatorios;

/**
 *
 * @author doremi
 */
public class CrescenteDAO {
    
    public String mostraOrdem(CrescenteDTO crescenteDTO){
        if((crescenteDTO.getN3() > crescenteDTO.getN2())
                && (crescenteDTO.getN2() > crescenteDTO.getN1())){
            return "Ordem crescente: " + crescenteDTO.getN3() + ", " +
                    crescenteDTO.getN2() + ", " + crescenteDTO.getN1();
        } else{
            if((crescenteDTO.getN3() > crescenteDTO.getN2())
                && (crescenteDTO.getN1() > crescenteDTO.getN2())){
            return "Ordem crescente: " + crescenteDTO.getN3() + ", " +
                    crescenteDTO.getN1() + ", " + crescenteDTO.getN2();
            }else{
                if((crescenteDTO.getN2() > crescenteDTO.getN3())
                && (crescenteDTO.getN3() > crescenteDTO.getN1())){
            return "Ordem crescente: " + crescenteDTO.getN2() + ", " +
                    crescenteDTO.getN3() + ", " + crescenteDTO.getN1();
            }else{
                    if((crescenteDTO.getN2() > crescenteDTO.getN1())
                    && (crescenteDTO.getN1() > crescenteDTO.getN3())){
            return "Ordem crescente: " + crescenteDTO.getN2() + ", " +
                    crescenteDTO.getN1() + ", " + crescenteDTO.getN3();
                } else{
                        if((crescenteDTO.getN1() > crescenteDTO.getN2())
                        && (crescenteDTO.getN2() > crescenteDTO.getN3())){
            return "Ordem crescente: " + crescenteDTO.getN1() + ", " +
                    crescenteDTO.getN2() + ", " + crescenteDTO.getN3();
                    } else{
                    return "Ordem crescente: " + crescenteDTO.getN1() + ", " +
                    crescenteDTO.getN3() + ", " + crescenteDTO.getN2();
                        }
        }
    }
}
        }
    }
}