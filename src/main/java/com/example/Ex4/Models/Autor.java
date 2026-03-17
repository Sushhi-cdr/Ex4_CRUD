package com.example.Ex4.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_autor")
public class Autor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeAutor")
    private String nomeAutor;

    @Column(name = "nacionalidadeAutor")
    private String nacionalidadeAutor;

    private LocalDate dataNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getNacionalidadeAutor() {
        return nacionalidadeAutor;
    }

    public void setNacionalidadeAutor(String nacionalidadeAutor) {
        this.nacionalidadeAutor = nacionalidadeAutor;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
