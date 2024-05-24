package br.unipar.programacao.clinica.service;

import br.unipar.programacao.clinica.model.Atendimento;
import br.unipar.programacao.clinica.repository.AtendimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoService {

    private AtendimentoRepository atendimentoRepository;

    public AtendimentoService(AtendimentoRepository atendimentoRepository) {
        this.atendimentoRepository = atendimentoRepository;
    }

    public List<Atendimento> getAll() {
        return atendimentoRepository.findAll();
    }

    public Atendimento save(Atendimento atendimento) {
        return atendimentoRepository.save(atendimento);
    }

    public Atendimento findById(int id) {
        return atendimentoRepository.findById(id).get();
    }
}
