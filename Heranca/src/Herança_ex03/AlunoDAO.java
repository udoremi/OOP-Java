/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_ex03;

/**
 *
 * @author Aluno
 */
public class AlunoDAO extends PessoaDAO{
    public String mostraDadosAluno(AlunoDTO alunoDTO){
        return mostraDadosPes(alunoDTO) +
                "\nProntuário: " + alunoDTO.getProntuario() +
                "\nCurso: " + alunoDTO.getCurso();
    }
}
