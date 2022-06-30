package com.douglas.notifica;

import com.douglas.model.Animal;
import com.douglas.model.Atendimento;
import com.douglas.model.Tutor;

public class EnvioEmail implements Envio {

	@Override
	public void notifica(Tutor tutor,String mensagem) {
		
		System.out.printf("Sr.(a) tutor(a) %s, email: %s seu cadastro esta ativo \n",
				tutor.getNome(), tutor.getEmail() );
		
		
	}

}
