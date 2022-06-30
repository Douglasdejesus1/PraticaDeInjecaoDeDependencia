package com.douglas.notifica;

import com.douglas.model.Tutor;

public class EnvioSMS implements Envio {
	

	@Override
	public void notifica(Tutor tutor, String mensagem) {
		
		System.out.printf("Sr.(a) %s, telefone: %s sua nota de servico foi emitida. \n%s\n", tutor.getNome(),tutor.getTelefone(), mensagem);
		
	}

}
