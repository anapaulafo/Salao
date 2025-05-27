package com.projeto.salao.repository;


import com.projeto.salao.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    @Query("SELECT a FROM Agendamento a ORDER BY a.dataHora ASC")
    List<Agendamento> listarTodosOrdenadosPorData();
}
