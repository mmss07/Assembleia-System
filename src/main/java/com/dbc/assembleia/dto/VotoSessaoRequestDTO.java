package com.dbc.assembleia.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class VotoSessaoRequestDTO {

    @ApiModelProperty(notes = "Id da sessao de votação", example = "1")
    @JsonProperty("id_sessao_votacao")
    private long idSessaoVotacao;

    @ApiModelProperty(notes = "Id do voto", example = "xxxxxxxxxxx")
    @JsonProperty("cpf")
    private String cpf;

    @ApiModelProperty(notes = "Id do voto", example = "SIM  OU NAO")
    @JsonProperty("voto")
    private String voto;


}
