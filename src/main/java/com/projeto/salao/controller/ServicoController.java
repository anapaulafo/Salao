package com.projeto.salao.controller;


import com.projeto.salao.model.Servico;
import com.projeto.salao.service.ServicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoService servicoService;

    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @PostMapping
    public Servico cadastrar(@RequestBody Servico servico) {
        return servicoService.salvar(servico);
    }

    @GetMapping
    public List<Servico> listar() {
        return servicoService.listarTodos();
    }
}

