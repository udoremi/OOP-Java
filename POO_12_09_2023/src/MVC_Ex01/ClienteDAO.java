/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex01;

/**
 *
 * @author miiii
 */
public class ClienteDAO {
    
    public String mostrarNomeRg(ClienteDTO clienteDTO){
        return "O nome informado é : "+ clienteDTO.getNome()+
               " e o RG informardo foi: "+ clienteDTO.getRg();
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return "O nome informado é : "+ clienteDTO.getNome()+
               " e a idade informarda foi: "+ clienteDTO.getIdade();
    }
    
}
