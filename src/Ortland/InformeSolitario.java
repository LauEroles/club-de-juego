package Ortland;

//esta es la clase con sus dos atributos
public class InformeSolitario {
	private String nombreJugador;
	private int numMesa;
	
	//El constructor de la clase
	/*Un Constructor  es una función, método de las clases, la cual es llamada automáticamente cuando se crea un objeto de esa clase.
	Por ser métodos, los constructores también aceptan parámetros. 
	Cuando en una clase no especificamos ningún tipo de constructor, el compilador añade uno público por omisión sin parámetros,
	el cual NO hace nada.
		1.     Un constructor, tiene el mismo nombre de la clase a la cual pertenece.
		2.     No puede ser Heredado.
		3.     No retorna ningún valor (Ni void), por lo cual no debe especificarse ningún tipo de dato.
		4.     Debe declararse como public, sólo en casos realmente extraordinarios será de otro tipo.
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
