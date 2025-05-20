package com.projeto.salao.controller;

import com.projeto.salao.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/cep")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/{cep}")
    public Map buscarPorCep(@PathVariable String cep) {
        return enderecoService.buscarEnderecoPorCep(cep);
    }
}