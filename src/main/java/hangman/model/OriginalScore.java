package hangman.model;

public class OriginalScore implements GameScore{
	
	public OriginalScore() {
		
	}
	
	
	/*
	 * Es uno de los esquemas de puntuación determinados, este es el original
	 * Calcula el puntaje según el esquema de OriginalScore
	 * @pre Sólo son válidos los valores enteros
	 * @pos el juego inicia en cien puntos
	 * @pos Las letras correctas no se bonifican 
	 * @pos Cada letra incorrecta se penaliza con 10 puntos
	 * @pos El puntaje no puede ser menor a cero
	 * @param correctCount cuenta correcta para el puntaje
	 * @param incorrectCount cuenta incorrecta para el puntaje
	 * @throws ExcepcionCuentasInvalidas
	 */
	public int calculateScore(int correctCount, int incorrectCount)throws ExcepcionCuentasInvalidas {
		int resta = 10;
		resta*=incorrectCount;
		if(100 - resta < 0) {
			resta = 0;
		}else {
			resta= 100 - resta;
		}
		
		return resta;
	}

}
