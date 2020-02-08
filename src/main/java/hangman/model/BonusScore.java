package hangman.model;

public class BonusScore implements GameScore{
	
	public BonusScore() {
		
	}
	
	/*
	 * Es uno de los esquemas de puntuación determinados
	 * Calcula el puntaje según el esquema de BonusScore
	 * @pre Sólo son válidos los valores enteros
	 * @pos el juego inicia en cero
	 * @pos Cada letra correcta se bonifica con 10 puntos 
	 * @pos Cada letra incorrecta se penaliza con 5 puntos
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
