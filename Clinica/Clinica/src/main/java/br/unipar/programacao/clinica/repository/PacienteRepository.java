package br.unipar.programacao.clinica.repository;

import br.unipar.programacao.clinica.model.Paciente;
import br.unipar.programacao.clinica.repository.PacienteRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {



}
