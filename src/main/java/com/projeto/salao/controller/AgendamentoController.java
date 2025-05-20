package com.projeto.salao.controller;

import com.projeto.salao.model.Agendamento;
import com.projeto.salao.service.AgendamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    public AgendamentoController(AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }

    @PostMapping
    public Agendamento agendar(@RequestBody Agendamento agendamento) {
        return agendamentoService.salvar(agendamento);
    }

    @GetMapping
    public List<Agendamento> listar() {
        return agendamentoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agendamento> buscarPorId(@PathVariable Long id) {
        Agendamento agendamento = agendamentoService.buscarPorId(id);
        return agendamento != null ? ResponseEntity.ok(agendamento) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Agendamento> atualizar(@PathVariable Long id, @RequestBody Agendamento novoAgendamento) {
        Agendamento atualizado = agendamentoService.atualizar(id, novoAgendamento);
        return atualizado != null ? ResponseEntity.ok(atualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean removido = agendamentoService.deletar(id);
        return removido ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
