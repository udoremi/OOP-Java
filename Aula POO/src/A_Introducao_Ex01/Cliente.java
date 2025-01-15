/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Introducao_Ex1;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    private String nome,rg;
    
    public void mostrar(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome +
                                            "\nO RG informado foi: " + this.rg);
        //System.out.println("O nome informado foi: " + this.nome +
        //                   "O RG informado foi: " + this.rg);
        
    }//fecha o método mostrar
    
    public void mostrarNome(String nome){
        this.nome = nome;
        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome);
        //System.out.println("O nome informado foi: " + this.nome);
        
    }//fecha o método mostrarNome
}//fecha a classe
