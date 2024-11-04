package com.Gerenciador.Gerenciador.de.Projetos.model;

import jakarta.persistence.*;

public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Projeto projeto;
    private String nomeTarefa;
    private String descricaoTarefa;
    private Enum<Status> status;

    //construtor default
    public Tarefa(){}

    //construtor
    public Tarefa(Projeto projeto, String nomeTarefa, String descricaoTarefa, Enum<Status> status) {
        this.projeto = projeto;
        this.nomeTarefa = nomeTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.status = status;
    }

    //getters
    public Long getId() {
        return id;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public Enum<Status> getStatus() {
        return status;
    }
}
