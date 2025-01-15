/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo_ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class MediaVIEW {
    public static void main(String[] args){
        MediaDTO mediaDTO = new MediaDTO();
        MediaCTR mediaCTR = new MediaCTR();
        
        mediaDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota")));
        mediaDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota")));
        mediaDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota")));
        mediaDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota")));
        mediaDTO.setTipo(Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de cálculo: 1 - 2 - 3")));
        
        JOptionPane.showMessageDialog(null, mediaCTR.imprimir(mediaDTO));
    }
}
