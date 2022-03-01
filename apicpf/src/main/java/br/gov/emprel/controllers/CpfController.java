package br.gov.emprel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.emprel.models.CpfUsuario;

@RestController
@RequestMapping("/emprel")
public class CpfController {
	
	@Autowired
	private CpfUsuario usuario;
	
	@GetMapping
	public String validarCpf() {
		return (usuario.getResultado());
	}
	

}
