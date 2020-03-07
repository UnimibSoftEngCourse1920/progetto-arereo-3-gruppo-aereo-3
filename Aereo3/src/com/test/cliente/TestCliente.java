package com.test.cliente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataManagment.GestioneClienteDatabase;
import dominio.ClienteFedele;

class TestCliente {

	@Test
	public void testLogin() {
		

		String email="alecotta98@gmail.com";
		String pws="ale";
		ClienteFedele cF=GestioneClienteDatabase.login(email, pws);
		
		assertEquals(cF.getCodCliente(), 83);
		
	}
}
