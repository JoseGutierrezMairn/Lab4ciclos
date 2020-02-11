package hangman.model;
public class ExcepcionCuentasInvalidas extends Exception {
	
	public static final String  VALORES_INVALIDOS= "Alguno de los valores ingresados son invalidos";
	public ExcepcionCuentasInvalidas(String message) {
		super(message);
	}
	
}
