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
public class NotaCTR {
    NotaDAO notaDAO = new NotaDAO();
    
    public void calcularMedia(NotaDTO notaDTO){
        notaDAO.calcularMedia(notaDTO);
    }
    
    public String imprimir(){
        return notaDAO.imprimir();
    }
}
