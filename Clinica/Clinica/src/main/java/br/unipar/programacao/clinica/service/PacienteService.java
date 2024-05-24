package br.unipar.programacao.clinica.service;

import br.unipar.programacao.clinica.model.Paciente;
import br.unipar.programacao.clinica.model.Usuario;
import br.unipar.programacao.clinica.repository.PacienteRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;
    private JpaRepository<Object, Object> usuarioRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> getAll(){
        return this.pacienteRepository.findAll();
    }

    public Paciente save(Paciente paciente){
        return this.pacienteRepository.save(paciente);
    }

    public Paciente findById(Integer id) {
        return this.pacienteRepository.findAllById(Integer id);
    }
}
