package Ortland;

import java.util.ArrayList;

public class Mesa {
	private int numeroMesa;
	private int cantidadMaxParticipantes;
	private ArrayList<Jugador> jugadores;
	private ArrayList<Carta> mazo;
	
	//cdo doy un valor en el constructor por parametro es xq quiero inicializar ese objeto con ese valor  en ese atributo
	public Mesa (int numeroMesa,int cantidadMaxParticipantes){
		this.numeroMesa = numeroMesa;
		this.cantidadMaxParticipantes = cantidadMaxParticipantes;
		this.jugadores= new ArrayList<Jugador>();
		this.mazo= new ArrayList<Carta>();
	}
		
	public int obtenerCantidadJugadores(){
		return this.jugadores.size();
	}
	
	public String obtenerNombreJugadorEnPos(int pos){
		String nombre="";
		if( pos>=1 && pos <= this.jugadores.size()){
			nombre=this.jugadores.get(pos-1).getNombre();
		}
		return nombre;
	}
	
	public int getNumeroMesa(){
		return this.numeroMesa;
	}
	
	public void agregarJugador(Jugador unJugador){
		if(this.obtenerCantidadJugadores()< this.cantidadMaxParticipantes ){
			this.jugadores.add(unJugador);
		}
		
	}
	public void agregarJugador(String nombre, int edad){
		Jugador jugador = new Jugador(nombre,edad);
		this.jugadores.add(jugador);
	}
	public boolean tieneDisponibilidad(){
		{
	return this.cantidadMaxParticipantes > this.jugadores.size();
			}
	}
	public Resultado devolverCartasAlMazo(String nombre){
		Resultado resultado=Resultado.JUEGO_NO_ENCONTRADO;
		Jugador jugador;
		jugador= this.buscarJugador(nombre);
		if(jugador!=null){
			this.devolverCartasAlMazo(jugador);
			resultado=Resultado.DEVOLUCION_OK;
		}
		return resultado;	
	}

	private Jugador buscarJugador(String nombre){
	 int i= 0;
	 Jugador jugador;
	 Jugador jugadorEncontrado= null;
	 
	 while(i<this.jugadores.size() && jugadorEncontrado== null){
		 jugador=this.jugadores.get(i);
		 if(jugador.getNombre().equalsIgnoreCase(nombre)){
			 jugadorEncontrado=jugador;
		 }
		 i++;
	 	}
	 return jugadorEncontrado;
	 }
	private void devolverCartasAlMazo(Jugador jugador){
		ArrayList<Carta> cartas;
		
		cartas= jugador.devolverCartas();
		for(Carta carta: cartas){
		this.mazo.add(carta);
		
		}
	}
	//hago el pasamano que viene de la clase Ortland y le delego la responsabilidad de eliminar el jugador a la clase Mesa
	public Jugador sacarJugadorDeMesa(String nombreJugador){
		//asigno a la variable jugadorEncontrado el valor del metodo buscarJugador pasando por paramentro el mismo parametro del metodo SacarJugadorDeMesa
		Jugador jugadorEncontrado= this.buscarJugador(nombreJugador);	
		//Hago la validación de jugadorEncontrado diferente a null porque si es igual me estalla todo!
		if(jugadorEncontrado!=null){
			//tengo que eliminar el jugador encontrado de mi ArrayList de jugadores
			this.jugadores.remove(jugadorEncontrado);
		}
		return jugadorEncontrado;
	}
}
 



	

