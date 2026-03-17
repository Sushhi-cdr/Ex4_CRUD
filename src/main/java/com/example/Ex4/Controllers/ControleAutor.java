package com.example.Ex4.Controllers;

import com.example.Ex4.Models.Autor;
import com.example.Ex4.Services.ServicoAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Autores")
public class ControleAutor {

    @Autowired
    private ServicoAutor servico;

    @PostMapping
    public Autor criar(@RequestBody Autor autor){
        return servico.criar(autor);
    }

    @GetMapping
    public List<Autor> listar(){
        return servico.listar();
    }

    @GetMapping("/{id}")
    public Autor buscar(@PathVariable Long id){
        return servico.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        servico.deletar(id);
    }
}
