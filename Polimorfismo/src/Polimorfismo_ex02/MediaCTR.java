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
public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    
    public String imprimir(MediaDTO mediaDTO){
        return mediaDAO.imprimir(mediaDTO);
    }
}
