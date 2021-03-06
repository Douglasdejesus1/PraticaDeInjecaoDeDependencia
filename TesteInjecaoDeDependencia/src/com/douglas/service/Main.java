package com.douglas.service;

import java.math.BigDecimal;

import com.douglas.model.Animal;
import com.douglas.model.Atendimento;
import com.douglas.model.Tutor;
import com.douglas.notifica.Envio;
import com.douglas.notifica.EnvioEmail;
import com.douglas.notifica.EnvioSMS;

public class Main {

	public static void main(String[] args) {

		Tutor flavia = new Tutor("Flavia", "354.999.988-20", "119999-9999", "flavia@email.com");
		
		Envio notificaEmail = new  EnvioEmail();
		Envio notificaSMS = new  EnvioSMS();
		AtivacaoClienteService ativaTutor = new AtivacaoClienteService(notificaEmail);
		AtivacaoClienteService ativaTutor2 = new AtivacaoClienteService(notificaSMS);
		
		ativaTutor.ativar(flavia);
		//ativaTutor2.ativar(flavia);
		
		Animal Hanna = new Animal(2, "Hanna", "viralata");
		Atendimento atendimentoHanna = new Atendimento("Vacina??o", new BigDecimal(200.00), "30/09/2022");
				
		EmisaoNotaDeServico emite1 =  new EmisaoNotaDeServico(notificaSMS);
		emite1.emitir(flavia, atendimentoHanna, Hanna);
		
		
		
	}

}
