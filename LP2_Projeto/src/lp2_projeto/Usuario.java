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

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;

    public Usuario(int id, String nome, String email, String telefone, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " - " + email + " - " + telefone + " - " + dataNascimento;
    }
}
