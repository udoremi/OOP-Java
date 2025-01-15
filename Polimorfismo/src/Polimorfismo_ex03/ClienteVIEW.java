/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo_ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author doremi
 */
public class ClienteVIEW {
    public static void main(String[] args){
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        
        juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o Nome:"));
        juridicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço"));
        juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número:")));
        juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade"));
        juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado"));
        juridicoDTO.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ"));
        juridicoDTO.setIe(JOptionPane.showInputDialog("Informe a inscrição estadual"));
        
        JOptionPane.showMessageDialog(null, juridicoCTR.mostraDadosCli(juridicoDTO));
        
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoCTR fisicoCTR = new FisicoCTR();
        
        fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o Nome:"));
        fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço"));
        fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número:")));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade"));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado"));
        fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o CPF"));
        fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG"));
        
        JOptionPane.showMessageDialog(null, fisicoCTR.mostraDadosCli(fisicoDTO));
    }
}
