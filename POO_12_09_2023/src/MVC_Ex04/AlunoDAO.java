/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_Ex04;

/**
 *
 * @author miiii
 */
public class AlunoDAO {
    
    public String calcularMedia(AlunoDTO alunoDTO){
        double media = (alunoDTO.getNota2()+alunoDTO.getNota1())/2;
        
        if(media >=7){
            return "Aluno aprovado!";
        }else{
            if(media <7 && media>=4){
                return "Aluno de recuperação";
            }else{
                return "Aluno reprovado";
            }
        }
    }
}
