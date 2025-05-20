package com.projeto.salao.controller;

import com.projeto.salao.model.Servico;
import com.projeto.salao.service.ServicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoService servicoService;

    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @PostMapping
    public Servico cadastrar(@RequestBody @Valid Servico servico) {
        return servicoService.salvar(servico);
    }

    @GetMapping
    public List<Servico> listar() {
        return servicoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> buscarPorId(@PathVariable Long id) {
        Servico servico = servicoService.buscarPorId(id);
        return servico != null ? ResponseEntity.ok(servico) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Servico> atualizar(@PathVariable Long id, @RequestBody Servico novoServico) {
        Servico atualizado = servicoService.atualizar(id, novoServico);
        return atualizado != null ? ResponseEntity.ok(atualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean removido = servicoService.deletar(id);
        return removido ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
