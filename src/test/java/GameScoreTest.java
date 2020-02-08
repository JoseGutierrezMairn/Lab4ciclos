import org.junit.Test;

import hangman.model.*;
import hangman.model.OriginalScore;

import org.junit.Assert;






/*
 * Clases de equivalencia OrginalScore
 * 
 * Puntaje menor a cero
 * Entrada menor a cero
 * Puntaje mayor a cero
 * 
 *  Fronteras OriginalScore
 *   puntaje = 100
 *   puntaje = 0
 *   puntaje = -20
 *   correctCount = -1, incorrectCount = -1
 */


/*
 * Clases de equivalencia BonusScore
 * 
 * Puntaje menor cero
 * Puntaje mayor a cero
 * Entrada menor a cero
 * 
 * Fronteras BonusScore
 * Puntaje = 0
 * Puntaje = -5
 * Puntaje = 15
 * Puntaje = 200
 * correctCount = -15, incorrectCount = -15
 * 
 */

/*
 * Clases de equivalencia PowerScore
 * Puntaje menor a cero
 * Puntaje mayor a cero y menor o igual a 500
 * Puntaje mayor a 500
 * Entrada negativa
 * 
 * Fronteras PowerScore
 * 
 * puntaje  = 0
 * puntaje = -8
 * puntaje = 3125
 * correctCount = -10, incorrectCount = -10
 *
 */
public class GameScoreTest   {
	
	private GameScore calculator;
	private int answ;
	private boolean valor;
	
	
	@Test
	public void entradaMenorACeroOrginalScore() {
		valor = false;
		calculator = new OriginalScore();
		try {
			answ = calculator.calculateScore(-1, -1);

		}catch (Exception e){
			valor = true;
			Assert.assertTrue(valor);
		}
	}
	
	
	@Test
	public void puntajeMenorACeroOrginalScore() {
		answ = calculator.calculateScore(0,12);
		Assert.assertTrue(answ == 0);
	}
	
	@Test
	public void puntajeMayorACeroOrginalScore() {
		answ = calculator.calculateScore(0,0);
		Assert.assertTrue(answ ==100);
	}
	
	@Test
	public void puntajeIgualACeroOrginalScore() {
		answ = calculator.calculateScore(0,10);
		Assert.assertTrue(answ ==0);
	}
	
	
	@Test
	public void puntajeMayorACeroBonusScore() {
		calculator = new BonusScore();
		
		answ = calculator.calculateScore(2,1);
		Assert.assertTrue(answ ==15);
	}
	
	@Test
	public void puntajeMenorACeroBonusScore() {
		answ = calculator.calculateScore(0,1);
		Assert.assertTrue(answ == 0);
	}
	
	
	@Test
	public void puntajeEsCeroBonusScore() {
		answ = calculator.calculateScore(1,2);
		Assert.assertTrue(answ == 0);
	}
	
	@Test
	public void entradaMenorACeroBonusScore() {
		valor = false;
		try {
			answ = calculator.calculateScore(-20,-2);
		}catch (Exception e) {
			Assert.assertTrue(valor);
		}
	}
	
	@Test
	public void entradaMenorACeroPowerScore() {
		valor = false;
		calculator = new PowerScore();
		try {
			answ = calculator.calculateScore(-20,-2);
		}catch (Exception e) {
			Assert.assertTrue(valor);
		}
		
	@Test
	public void puntajeIgualACeroPowerScore() {
		answ = calculator.calculateScore(0,0);
		Assert.assertTrue(answ == 0);
	}
	
	@Test
	public void puntajeMenorACeroPowerScore() {
		answ = calculator.calculateScore(0,1);
		Assert.assertTrue(answ == 0);
	}
	
	@Test
	public void puntajeIgualQuinientosPowerScore() {
		answ = calculator.calculateScore(5,0);
		Assert.assertTrue(answ == 500);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
