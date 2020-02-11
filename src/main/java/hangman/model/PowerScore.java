package hangman.model;

import java.lang.Math;

public class PowerScore implements GameScore{

	public PowerScore() {
		
	}
	
	/*
	 * Es uno de los esquemas de puntuación determinados
	 * Calcula el puntaje según el esquema de PowerScore
	 * @pre Sólo son válidos los valores enteros
	 * @pos el juego inicia en cero
	 * @pos La i-ésima letra correcta se bonifica con 5^i
	 * @pos Cada letra incorrecta se penaliza con 8 puntos
	 * @pos El puntaje no puede ser menor a cero
	 * @param correctCount cuenta correcta para el puntaje
	 * @param incorrectCount cuenta incorrecta para el puntaje
	 * @throws ExcepcionCuentasInvalidas
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws ExcepcionCuentasInvalidas {
		if (correctCount<0 || incorrectCount<0) throw new ExcepcionCuentasInvalidas(ExcepcionCuentasInvalidas.VALORES_INVALIDOS);
		int answ = 0;
		/*for(int contador=1;contador<correctCount+1;contador++) {
			answ+=(int)Math.pow(5,contador);
		}*/
		//answ-=(incorrectCount*8);
		return answ;
		/*if(answ<0) {
			return 0;
		}
		else if(answ>500) {
			return 500;
		}
		else {
			return answ;
		}*/
	}
	
}
