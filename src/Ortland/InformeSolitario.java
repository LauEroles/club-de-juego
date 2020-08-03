package Ortland;

//esta es la clase con sus dos atributos
public class InformeSolitario {
	private String nombreJugador;
	private int numMesa;
	
	//El constructor de la clase
	/*Un Constructor  es una funci�n, m�todo de las clases, la cual es llamada autom�ticamente cuando se crea un objeto de esa clase.
	Por ser m�todos, los constructores tambi�n aceptan par�metros. 
	Cuando en una clase no especificamos ning�n tipo de constructor, el compilador a�ade uno p�blico por omisi�n sin par�metros,
	el cual NO hace nada.
		1.     Un constructor, tiene el mismo nombre de la clase a la cual pertenece.
		2.     No puede ser Heredado.
		3.     No retorna ning�n valor (Ni void), por lo cual no debe especificarse ning�n tipo de dato.
		4.     Debe declararse como public, s�lo en casos realmente extraordinarios ser� de otro tipo.
	 */
	
	public InformeSolitario(String nombreJugador,int numMesa){
		this.nombreJugador=nombreJugador;
		this.numMesa=numMesa;
		
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public int getNumMesa() {
		return numMesa;
	}
	
	
	

}
