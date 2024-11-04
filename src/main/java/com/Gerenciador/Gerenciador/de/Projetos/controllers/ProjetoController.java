package com.Gerenciador.Gerenciador.de.Projetos.controllers;

import com.Gerenciador.Gerenciador.de.Projetos.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    @Autowired
    ProjetoService service;
}
