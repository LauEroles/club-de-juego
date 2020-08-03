package Ortland;

import java.util.ArrayList;

public class Juego {
	
	private ArrayList<Mesa> mesas;
	private String nombreJuego;
	
	public Juego(String nombreJuego){
		this.mesas = new ArrayList<Mesa>();
		this.nombreJuego= nombreJuego;
	}
	
	public String getNombreJuego() {
		return nombreJuego;
	}

	public ArrayList<InformeSolitario> obtenerJugadorInformeSolitario(){
		//instancio o creo un objeto de tipo ArrayList
		ArrayList<InformeSolitario> informe = new ArrayList<InformeSolitario>();
		String nombreJugador = "";
		final int PRIMERA_POSICION=1;
		InformeSolitario informeSolitario;	
		
		//recorro toda la lista de mesas 
		for (Mesa mesa: this.mesas){
			//con esta condicion identifico donde estan las mesas con un solo jugador
			if(mesa.obtenerCantidadJugadores() == 1){
				// le asigno a la variable nombreJugador el valor del resultado del metodo de la clase Mesa
				//por parametro paso la posicion del jugador que en este caso le puse uno porque el metodo resta pos-1
				nombreJugador= mesa.obtenerNombreJugadorEnPos(PRIMERA_POSICION);
				//le asigno a la variable informeSolitario el objeto instanciado (palabra clave para detectar esto new)
				informeSolitario = new InformeSolitario(nombreJugador,mesa.getNumeroMesa());
				// le agrego a la lista de informe el informeSolitario que por parametro recibe en nombre y la mesa?
				informe.add(informeSolitario);
			}
		}
		//devuelve la lista de informe
		return informe;
		
	}

	public void agregarMesa(Mesa mesa){
		this.mesas.add(mesa);
	}
	public boolean acomodarJugador(String nombreJugador, int edad){
		Mesa mesa;
		boolean resultado = false;
		
		mesa= this.obtenerMayorMesaConDisponibilidad();
		if (mesa!=null){
			mesa.agregarJugador(nombreJugador,edad);
			resultado= true;
		}
		return resultado;
	}

	public Mesa obtenerMayorMesaConDisponibilidad(){
		int max=0;
		Mesa mesaMax= null;
		
		for (Mesa mesa: this.mesas){
			if(mesa.obtenerCantidadJugadores()> max && mesa.tieneDisponibilidad()){
				mesaMax = mesa;
				max = mesa.obtenerCantidadJugadores();
			}
		}
		return mesaMax;

	}

}
