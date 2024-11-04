package com.Gerenciador.Gerenciador.de.Projetos.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "projetos")
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Tarefa> tarefas;
    private String nomeProjeto;
    private String descricaoProjeto;
    private Date dataInicio;
    private Enum<Status> status;

    //construtor default
    public Projeto(){}
    //construtor
    public Projeto(String nomeProjeto, String descricaoProjeto, Date dataInicio, Enum<Status> status) {
        this.nomeProjeto = nomeProjeto;
        this.descricaoProjeto = descricaoProjeto;
        this.dataInicio = dataInicio;
        this.status = status;
    }

    //getters
    public long getId() {
        return id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public String getDescricaoProjeto() {
        return descricaoProjeto;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Enum<Status> getStatus() {
        return status;
    }
}
