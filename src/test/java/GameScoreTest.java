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
		calculator = new OriginalScore();
		try {
			answ = calculator.calculateScore(0,12);
			Assert.assertTrue(answ == 0);
		}
		catch(ExcepcionCuentasInvalidas e) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void puntajeMayorACeroOrginalScore() {
		calculator = new OriginalScore();
		try {
			answ = calculator.calculateScore(0,0);
			Assert.assertTrue(answ ==100);
		}
		catch(ExcepcionCuentasInvalidas e) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void puntajeIgualACeroOrginalScore() {
		calculator = new OriginalScore();
		try {
			answ = calculator.calculateScore(0,10);
			Assert.assertTrue(answ ==0);
		}
		catch(ExcepcionCuentasInvalidas e) {
			Assert.assertTrue(false);
		}
	}
	
	
	@Test
	public void puntajeMayorACeroBonusScore() {
		calculator = new BonusScore();
		try {
			answ = calculator.calculateScore(2,1);
			Assert.assertTrue((int)answ==15);
		}
		catch(ExcepcionCuentasInvalidas e) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void puntajeMenorACeroBonusScore() {
		calculator = new BonusScore();
		try {
			answ = calculator.calculateScore(0,1);
			Assert.assertTrue(answ == 0);
		}
		catch(ExcepcionCuentasInvalidas e) {
			Assert.assertTrue(false);
		}
	}
	
	
	@Test
	public void puntajeEsCeroBonusScore() {
		calculator = new BonusScore();
		try {
			answ = calculator.calculateScore(1,2);
			Assert.assertTrue(answ == 0);
		}
		catch(ExcepcionCuentasInvalidas e) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void entradaMenorACeroBonusScore() {
		calculator = new BonusScore();
		try {
			answ = calculator.calculateScore(-20,-2);
			Assert.assertTrue(false);
		}catch (Exception e) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void entradaMenorACeroPowerScore() {
		calculator = new PowerScore();
		try {
			answ = calculator.calculateScore(-20,-2);
			Assert.assertTrue(false);
		}catch (Exception e) {
			Assert.assertTrue(true);
		}
	}
		
	@Test
	public void puntajeIgualACeroPowerScore() {
		calculator = new PowerScore();
		try {
			answ = calculator.calculateScore(0,0);
			Assert.assertTrue(answ == 0);
		}
		catch(ExcepcionCuentasInvalidas e) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void puntajeMenorACeroPowerScore() {
		calculator = new PowerScore();
		try {
			answ = calculator.calculateScore(0,1);
			Assert.assertTrue(answ == 0);
		}
		catch(ExcepcionCuentasInvalidas e) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void puntajeIgualQuinientosPowerScore() {
		calculator = new PowerScore();
		try {
			answ = calculator.calculateScore(3,3);
			Assert.assertTrue(true);
		}
		catch(ExcepcionCuentasInvalidas e) {
			Assert.assertTrue(true);
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
