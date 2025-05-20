package com.projeto.salao.service;

import com.projeto.salao.model.Agendamento;
import com.projeto.salao.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoService(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    public Agendamento salvar(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    public List<Agendamento> listarTodos() {
        return agendamentoRepository.findAll();
    }

    public Agendamento buscarPorId(Long id) {
        return agendamentoRepository.findById(id).orElse(null);
    }

    public Agendamento atualizar(Long id, Agendamento novoAgendamento) {
        return agendamentoRepository.findById(id).map(agendamento -> {
            agendamento.setUsuario(novoAgendamento.getUsuario());
            agendamento.setServico(novoAgendamento.getServico());
            agendamento.setDataHora(novoAgendamento.getDataHora());
            return agendamentoRepository.save(agendamento);
        }).orElse(null);
    }

    public boolean deletar(Long id) {
        if (agendamentoRepository.existsById(id)) {
            agendamentoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
