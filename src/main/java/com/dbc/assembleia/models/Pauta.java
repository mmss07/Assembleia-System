package com.dbc.assembleia.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Pauta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPauta;
    private String nome;
    private String descricao;
    private LocalDate dataPauta;

    @JsonIgnore
    @OneToMany(mappedBy = "pauta", fetch = FetchType.LAZY)
    private List<SessaoVotacao> listSessao;

}
