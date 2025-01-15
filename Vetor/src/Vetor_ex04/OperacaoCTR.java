/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor_ex04;

/**
 *
 * @author doremi
 */
public class OperacaoCTR {
    OperacaoDAO operacaoDAO = new OperacaoDAO();
    
    public void escolha(OperacaoDTO operacaoDTO){
        operacaoDAO.escolha(operacaoDTO);
    }
    
    public String imprimir(){
        return operacaoDAO.imprimir();
    }
}
