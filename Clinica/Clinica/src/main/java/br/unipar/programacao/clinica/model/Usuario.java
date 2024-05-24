package br.unipar.programacao.clinica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;

@Entity
@Getter
@Setter

public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nIdUsu;

    private String stNomUsu;

    private String stLoginUsu;

    private String stSenhaUsu;

    private Boolean boAdminUsu;
}
