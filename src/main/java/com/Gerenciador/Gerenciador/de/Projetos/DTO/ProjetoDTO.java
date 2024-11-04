package com.Gerenciador.Gerenciador.de.Projetos.DTO;

import com.Gerenciador.Gerenciador.de.Projetos.model.Status;

import java.util.Date;

public record ProjetoDTO(String nomeProjeto,
                         String descricaoProjeto,
                         Date dataInicio,
                         Enum<Status> statusProjeto){
}
