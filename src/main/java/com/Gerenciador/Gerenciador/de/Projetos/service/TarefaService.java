package com.Gerenciador.Gerenciador.de.Projetos.service;

import com.Gerenciador.Gerenciador.de.Projetos.repositoryes.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {
    @Autowired
    TarefaRepository repositorio;
}
