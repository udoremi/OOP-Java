/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex02;

/**
 *
 * @author miiii
 */
public class FuncionarioDAO {
    
    public String imprimir (FuncionarioDTO funcionarioDTO){
        return "O código informado foi: "+ funcionarioDTO.getCod()+
               " e o telefone informdo foi: "+ funcionarioDTO.getTel();
    }
    
}
