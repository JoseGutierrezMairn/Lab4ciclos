package hangman.model;

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
	public int calculateScore(int correctCount, int incorrectCount)throws ExcepcionCuentasInvalidas {
		int answ = 0;
		
		return answ;
	}
	
}
