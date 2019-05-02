package alfa.br.com.gilmario.modelo.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import alfa.br.com.gilmario.modelo.Avaliacao;
import alfa.br.com.gilmario.modelo.ValoresInvalidosException;
import junit.framework.Assert;

public class AvaliacaoTeste {
	
	
private Avaliacao avaliacao;
	
	@Before
	public void setup() {
		
		avaliacao = new Avaliacao();
	}
	
	
	//CT01
//	public void testaQuatidadeParametrosMenorQuatro() {
//		
//		String resultado = avaliacao.avalia(7.0, 6.0,  5);
//	}

	
	//CT02
//	public void testaQuatidadeParametrosMaiorQuatro() {
//		
//		String resultado = avaliacao.avalia(7.0, 6.0,  5, 96, 48);
//	}

	//CT03
	@Test
	public void testaNotaMenorZero() {
		
		try {
			
			String resultado = avaliacao.avalia(-7.0, 6.0, 5, 96);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT04
	@Test
	public void testaNotaMaoirDez() {
		
		try {
			
			String resultado = avaliacao.avalia(11.0, 6.0, 5, 96);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT05
	@Test
	public void testarNotaMenorQueZero() {
		
		try {
			
			String resultado = avaliacao.avalia(-8.0, 10.0, 5, 96);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT06
	@Test
	public void testarNotaMaiorQueDez() {
		
		try {
			
			String resultado = avaliacao.avalia(11.0, 8.0, 5, 96);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT07
	@Test
	public void testarNota02MenorQueZero() {
		
		try {
			
			String resultado = avaliacao.avalia(8.0, -8.0, 5, 96);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT08
	@Test
	public void testarFata02MenorQueZeroouMaiorQue96() {
		
		try {
			
			String resultado = avaliacao.avalia(8.0, -8.0, 97, 96);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT09
	@Test
	public void testarNota02MaiorQueDez() {
		
		try {
			
			String resultado = avaliacao.avalia(8.0, 12.0, 97, 96);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT10
	@Test
	public void testarCargaHorarioMaiorQueZero() {
		
		try {
			
			String resultado = avaliacao.avalia(8.0, 5.0, 97, 96);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT11
	@Test
	public void testarCargaHorarioMenorQueZero() {
		
		try {
			
			String resultado = avaliacao.avalia(8.0, 5.0, 97, -1);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT12
	@Test
	public void testarCargaHorarioMaiorQue96() {
		
		try {
			
			String resultado = avaliacao.avalia(8.0, 5.0, 97, 100);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT13
	@Test
	public void testarFaltaMaiorQueZero() {
		
		try {
			
			String resultado = avaliacao.avalia(8.0, 5.0, 97, 100);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT14
	@Test
	public void testarFaltaMenorQueZero() {
		
		try {
			
			String resultado = avaliacao.avalia(8.0, 5.0, 15, 100);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT15
	@Test
	public void testarFaltaMenorQueVinteCincoPorCento() {
		
		try {
			
			String resultado = avaliacao.avalia(8.0, 5.0, 15, 100);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	//CT16
	@Test
	public void testarFaltaMaiorQueCargahoraria() {
		
		try {
			
			String resultado = avaliacao.avalia(8.0, 5.0, 98, 96);
			
		} catch (Exception e) {
			
			Assert.assertTrue(e instanceof  ValoresInvalidosException);
		}
	}
	
	

}
