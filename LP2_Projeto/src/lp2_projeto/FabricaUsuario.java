/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2_projeto;

/**
 *
 * @author mathe
 */
import java.time.LocalDate;



public class FabricaUsuario implements Fabrica<Usuario> {
    @Override
    public Usuario criar(int id, String nome, String email, String telefone, LocalDate dataNascimento) {
        return new Usuario(id, nome, email, telefone, dataNascimento);
    }
}

