package com.douglas.service;

import com.douglas.model.Tutor;
import com.douglas.notifica.Envio;

public class AtivacaoClienteService {
	
	private Envio envio;

	public AtivacaoClienteService(Envio envio) {
		super();
		this.envio = envio;
	}

	public Envio getEnvio() {
		return envio;
	}
	
	public void ativar(Tutor tutor) {
		
		tutor.ativar();
		
		this.envio.notifica(tutor,"seu cadastro esta ativo!");
	}
	

}
