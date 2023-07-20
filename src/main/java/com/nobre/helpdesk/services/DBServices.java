package com.nobre.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nobre.helpdesk.domain.Chamado;
import com.nobre.helpdesk.domain.Cliente;
import com.nobre.helpdesk.domain.Tecnico;
import com.nobre.helpdesk.domain.enums.Perfil;
import com.nobre.helpdesk.domain.enums.Prioridade;
import com.nobre.helpdesk.domain.enums.Status;
import com.nobre.helpdesk.repositories.ChamadoRepository;
import com.nobre.helpdesk.repositories.ClienteRepository;
import com.nobre.helpdesk.repositories.TecnicoRepository;

@Service
public class DBServices {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "63653230268", "valdir@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@email.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
