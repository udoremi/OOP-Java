/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01_Classificacao;

/**
 *
 * @author doremi
 */
public class ClassifDAO {
    
    public String mostraClassif(ClassifDTO classifDTO){
        if((classifDTO.getAltura()<1.2) && (classifDTO.getPeso()<60)){
            return "Classificação A";
        } else{
            if((classifDTO.getAltura()>=1.2) && (classifDTO.getAltura()<=1.7) && (classifDTO.getPeso()<60)){
                return "Classificação B";
        } else{
                if((classifDTO.getAltura()>1.7) && (classifDTO.getPeso()<60)){
                    return "Classificação C";
        } else{
                    if((classifDTO.getAltura()<1.2) && (classifDTO.getPeso()>=60) && (classifDTO.getPeso()<=90)){
                        return "Classificação D";
        } else{
                        if((classifDTO.getAltura()>=1.2) && (classifDTO.getAltura()<=1.7) && (classifDTO.getPeso()>=60) && (classifDTO.getPeso()<=90)){
                            return "Classificação E";
        } else{
                            if((classifDTO.getAltura()>1.7) && (classifDTO.getPeso()>=60) && (classifDTO.getPeso()<=90)){
                                return "Classificação F";
        } else{
                                if((classifDTO.getAltura()<1.2) && (classifDTO.getPeso()>90)){
                                    return "Classificação G";
        } else{
                                    if((classifDTO.getAltura()>=1.2) && (classifDTO.getAltura()<=1.7) && (classifDTO.getPeso()>90)){
                                        return "Classificação H";
        } else{
                                        if((classifDTO.getAltura()>1.7) && (classifDTO.getPeso()>90)){
                                            return "Classificação I";
        } else{
                                            return "Classificação Inválida";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
