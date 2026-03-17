package com.example.Ex4.Services;

import com.example.Ex4.Models.Autor;
import com.example.Ex4.Resositories.RepositorioAutor;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoAutor {

    @Autowired
    private RepositorioAutor repositorio;

    public Autor criar(Autor autor){
        return repositorio.save(autor);
    }

    public List<Autor> listar(){
        return repositorio.findAll();
    }

    public Autor buscarPorId(Long id){
        return repositorio.findById(id).orElse(null);
    }

    public void deletar(Autor autor){
        repositorio.delete(autor);
    }
}
