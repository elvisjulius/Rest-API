package com.algaworks.osworks.api.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Elvis Julius");
		cliente1.setEmail("elvisjulius@hotmail.com");
		cliente1.setTelefone("974449609");
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Evelin");
		cliente2.setEmail("evelin@hotmail.com");
		cliente2.setTelefone("3222215469");
		return Arrays.asList (cliente1, cliente2);
	}

}
