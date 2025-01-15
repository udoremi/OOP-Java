/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca_ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author doremi
 */
public class VeiculoVIEW {
    public static void main(String[] args){
        CarroDTO carroDTO = new CarroDTO();
        CarroCTR carroCTR = new CarroCTR();
        
        carroDTO.setPlaca(JOptionPane.showInputDialog("Informe a placa"));
        carroDTO.setCor(JOptionPane.showInputDialog("Informe a cor"));
        carroDTO.setPotencia(Integer.parseInt((JOptionPane.showInputDialog("Informe a potência"))));
        carroDTO.setQtd_portas(Integer.parseInt((JOptionPane.showInputDialog("Informe as portas"))));
        
        JOptionPane.showMessageDialog(null, carroCTR.imprimiDadosCarro(carroDTO));
        
        MotoDTO motoDTO = new MotoDTO();
        MotoCTR motoCTR = new MotoCTR();
        
        motoDTO.setPlaca(JOptionPane.showInputDialog("Informe a placa"));
        motoDTO.setCor(JOptionPane.showInputDialog("Informe a cor"));
        motoDTO.setCilindrada(Integer.parseInt(JOptionPane.showInputDialog("Informe a cilindrada")));
        motoDTO.setTipo_motor(JOptionPane.showInputDialog("2T / 4T"));
        
        JOptionPane.showMessageDialog(null, motoCTR.imprimiDadosMoto(motoDTO));
    }
}
