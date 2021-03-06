package com.douglas.service;

import com.douglas.model.Animal;
import com.douglas.model.Atendimento;
import com.douglas.model.Tutor;
import com.douglas.notifica.Envio;

public class EmisaoNotaDeServico {
	
	private Envio envio;

	public EmisaoNotaDeServico(Envio envio) {
		super();
		this.envio = envio;
	}

	public Envio getEnvio() {
		return envio;
	}
	
	public void emitir(Tutor tutor, Atendimento atendimento, Animal animal ) {
		
		this.envio.notifica(tutor, "Referente ao atendimento de: "+animal.getNome()+"; Ra?a: "
		+animal.getRaca()+"; Idade:"+animal.getIdade()+".\nFoi realizado em: "+atendimento.data
		+" o procedimento: "+atendimento.getDescricaoConsulta()+", no valor de: R$"+atendimento.getPreco() );
	}
	
	
	
	

}
