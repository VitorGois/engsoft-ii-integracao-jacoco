package integracao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CandidatoTest {
	
	Candidato candidato;
	
	@Test
	public void testeReprovado_IdadeMenorQue16() {
		candidato = new Candidato();
		candidato.setIdade(15);
		
		candidato.contratar();
		
		Boolean contratado = candidato.isContratado();
		assertFalse(contratado);
	}
	
	@Test
	public void testeReprovado_IdadeMaiorQue55() {
		candidato = new Candidato();
		candidato.setIdade(56);
		
		candidato.contratar();
		
		Boolean contratado = candidato.isContratado();
		assertFalse(contratado);
	}
	
	@Test
	public void testeAprovadoParcial_IdadeEntre16e18() {
		candidato = new Candidato();
		candidato.setIdade(17);
		
		candidato.contratar();
		
		Boolean contratado = candidato.isContratado();
		assertTrue(contratado);
		
		FuncionarioCargaHoraria cargaHoraria = candidato.getCargaHoraria();
		assertEquals(cargaHoraria, FuncionarioCargaHoraria.PARCIAL);
	}
	
	@Test
	public void testeAprovadoIntegral_IdadeEntre18e55() {
		candidato = new Candidato();
		candidato.setIdade(30);
		
		candidato.contratar();
		
		Boolean contratado = candidato.isContratado();
		assertTrue(contratado);
		
		FuncionarioCargaHoraria cargaHoraria = candidato.getCargaHoraria();
		assertEquals(cargaHoraria, FuncionarioCargaHoraria.INTEGRAL);
	}
	
	@Test
	public void testeGetIdade() {
		candidato = new Candidato();
		candidato.setIdade(30);
		
		int idade = candidato.getIdade();
	
		assertEquals(idade, 30);
	}

}
