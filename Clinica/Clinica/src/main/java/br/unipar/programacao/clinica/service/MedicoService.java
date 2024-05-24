package br.unipar.programacao.clinica.service;

import br.unipar.programacao.clinica.model.Medico;
import br.unipar.programacao.clinica.repository.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    private MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public List<Medico> getAll() {
        return this.medicoRepository.findAll();
    }

    public Medico saveMedico(Medico medico) {
        return this.medicoRepository.save(medico);
    }

    public Medico getMedicoById(int id) {
        return this.medicoRepository.findById(id).get();
    }
}
