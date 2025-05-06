package com.projeto.salao.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;



@Entity
public class Servico {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private BigDecimal preco;
    private LocalDateTime horarioDisponivel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

