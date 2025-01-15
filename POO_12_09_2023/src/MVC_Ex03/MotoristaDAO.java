/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex03;

/**
 *
 * @author miiii
 */
public class MotoristaDAO {
    
    public String verificar (MotoristaDTO motoristaDTO){
        
        if(motoristaDTO.getIdade()>=18){
            return "Motorista pode possuir CNH";
        }else{
            return "Motorista não pode possuir CNH";
        }
    }
}
