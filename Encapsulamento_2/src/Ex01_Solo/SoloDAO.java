/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01_Solo;

/**
 *
 * @author doremi
 */
public class SoloDAO {
    
    public String verifAmostra(SoloDTO soloDTO){
        if(soloDTO.getAgua()<=10){
            return "Solo Rochoso";
        } else{
            if((soloDTO.getAgua()>10) && (soloDTO.getAgua()<=40)){
            return "Solo Firme";
            } else{
                if((soloDTO.getAgua()>40) && (soloDTO.getAgua()<=80)){
                    return "Solo Pantanoso";
                } else{
                    return "Quantidade de água inválida";
                }
            }
        }
    }
}
