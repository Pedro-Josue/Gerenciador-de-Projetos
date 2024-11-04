package com.Gerenciador.Gerenciador.de.Projetos.DTO;

import com.Gerenciador.Gerenciador.de.Projetos.model.Projeto;
import com.Gerenciador.Gerenciador.de.Projetos.model.Status;

public record TarefaDTO(String nomeTarefa,
                        String descricaoTarefa,
                        Enum<Status> statusTarefa,
                        Projeto projeto) {
}
