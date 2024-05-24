package br.unipar.programacao.clinica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.security.Timestamp;

@Entity
@Getter
@Setter

public class Atendimento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nIdAtendimento;

    private Timestamp dDataHora;

    private String stAnalise;

}
