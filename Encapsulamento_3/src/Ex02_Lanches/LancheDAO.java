/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex02_Lanches;

/**
 *
 * @author doremi
 */
public class LancheDAO {
    
    public void calcPreco(LancheDTO lancheDTO){
        if(lancheDTO.getCod()==1){
            lancheDTO.setPreco(lancheDTO.getPreco() + 1.5);
            lancheDTO.setQtd(lancheDTO.getQtd() + 1);
            mostraPreco(lancheDTO);
        } else{
            if(lancheDTO.getCod()==2){
                lancheDTO.setPreco(lancheDTO.getPreco() + 1.8);
                lancheDTO.setQtd(lancheDTO.getQtd() + 1);
            } else{
                if(lancheDTO.getCod()==3){
                    lancheDTO.setPreco(lancheDTO.getPreco() + 1.2);
                    lancheDTO.setQtd(lancheDTO.getQtd() + 1);
                } else{
                    if(lancheDTO.getCod()==4){
                        lancheDTO.setPreco(lancheDTO.getPreco() + 2);
                        lancheDTO.setQtd(lancheDTO.getQtd() + 1);
                    } else{
                        if(lancheDTO.getCod()==5){
                            lancheDTO.setPreco(lancheDTO.getPreco() + 1);
                            lancheDTO.setQtd(lancheDTO.getQtd() + 1);
                        }
                    }
                }
            }
        }
    }


    public String mostraPreco(LancheDTO lancheDTO){
        return "Código          Quantidade           Preço"
             + "------------------------------------------"
             + lancheDTO.getCod() + lancheDTO.getQtd()
             + "O preço final é: " + lancheDTO.getPreco();
}
}