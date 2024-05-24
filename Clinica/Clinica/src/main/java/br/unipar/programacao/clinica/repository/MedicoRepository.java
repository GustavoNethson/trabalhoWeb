package br.unipar.programacao.clinica.repository;

import br.unipar.programacao.clinica.model.Medico;
import br.unipar.programacao.clinica.repository.MedicoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {



}
