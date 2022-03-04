package br.gov.emprel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.emprel.models.CpfUsuario;


@RestController
@RequestMapping("/emprel")
public class CpfController {
	

	
	//Método validar cpf
	@GetMapping("{cpf}")
	public boolean validarCpf(@PathVariable String cpf) {
		
		CpfUsuario usuario = new CpfUsuario();
		
		return usuario.validarCpf(cpf);
		

	}

}
