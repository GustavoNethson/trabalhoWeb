package br.unipar.programacao.clinica.repository;

import br.unipar.programacao.clinica.model.Atendimento;
import br.unipar.programacao.clinica.repository.AtendimentoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer> {



}
