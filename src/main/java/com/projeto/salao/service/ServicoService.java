package com.projeto.salao.service;

import com.projeto.salao.model.Servico;
import com.projeto.salao.repository.ServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private final ServicoRepository servicoRepository;

    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public Servico salvar(Servico servico) {
        return servicoRepository.save(servico);
    }

    public List<Servico> listarTodos() {
        return servicoRepository.findAll();
    }

    public Servico buscarPorId(Long id) {
        return servicoRepository.findById(id).orElse(null);
    }

    public Servico atualizar(Long id, Servico novoServico) {
        return servicoRepository.findById(id).map(servico -> {
            servico.setNome(novoServico.getNome());
            servico.setPreco(novoServico.getPreco());
            servico.setHorarioDisponivel(novoServico.getHorarioDisponivel());
            return servicoRepository.save(servico);
        }).orElse(null);
    }

    public boolean deletar(Long id) {
        if (servicoRepository.existsById(id)) {
            servicoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
