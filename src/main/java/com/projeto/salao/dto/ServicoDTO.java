package com.projeto.salao.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.projeto.salao.validator.PrecoValido;

public class ServicoDTO {
    private String nome;
    @PrecoValido
    private BigDecimal preco;
    private LocalDateTime horarioDisponivel;


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

