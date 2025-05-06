package com.projeto.salao.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ServicoDTO {
    private String nome;
    private BigDecimal preco;
    private LocalDateTime horarioDisponivel;

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDateTime getHorarioDisponivel() {
        return horarioDisponivel;
    }

    public void setHorarioDisponivel(LocalDateTime horarioDisponivel) {
        this.horarioDisponivel = horarioDisponivel;
    }
}

