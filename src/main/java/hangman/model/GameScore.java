package hangman.model;

public interface GameScore  {
	
	/*
	 * Calcula la puntuación
	 * 
	 */
	
	public int calculateScore(int correctCount, int incorrectCount)throws ExcepcionCuentasInvalidas;
}
