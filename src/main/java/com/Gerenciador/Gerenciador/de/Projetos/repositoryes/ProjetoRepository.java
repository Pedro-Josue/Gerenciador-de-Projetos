package com.Gerenciador.Gerenciador.de.Projetos.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<ProjetoRepository, Long> {
}
