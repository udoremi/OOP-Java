/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2_projeto;

import java.time.LocalDate;

/**
 *
 * @author mathe
 */
public interface Fabrica<T> {
    T criar(int id, String nome, String email, String telefone, LocalDate dataNascimento);
}
