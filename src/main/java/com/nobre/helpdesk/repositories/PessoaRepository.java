package com.nobre.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nobre.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
