package Ortland;

import java.util.ArrayList;

public class Ortland {
	
	private ArrayList<Juego> juegos;
	private ArrayList<Mesa> mesas;
	
	public Ortland(){
		this.juegos= new ArrayList<Juego>();
		this.mesas =new ArrayList <Mesa>();
	}
	
	public ArrayList<Mesa> getMesas() {
		return mesas;
	}

	public void agregarJuego(Juego unJuego){
		this.juegos.add(unJuego);
		
	}

	public ArrayList<Juego> getJuegos() {
		return juegos;
	}
	
	public Resultado acomodarJuador(String nombreJugador, int edad, String nombreJuego){
		Resultado resultado;
		Juego juego;
		
		juego= this.buscarJuego(nombreJuego);
		if( juego!= null){
			
			if (juego.acomodarJugador(nombreJugador,edad)){
				resultado= Resultado.ASIGNACION_OK;
			}
			else{
				resultado=Resultado.SIN_DISPONIBILIDAD;
			}	
		}
		else{
			resultado = Resultado.JUEGO_NO_ENCONTRADO; 
		}
		return resultado;
	}
	
	public Juego buscarJuego(String nombreJuego){
		Juego juegoEncontrado=null;
		int i=0;
		Juego juego;
		while(i< this.juegos.size() && juegoEncontrado == null){
			juego= this.juegos.get(i);
			juego.getNombreJuego().equalsIgnoreCase(nombreJuego);
			juego= juegoEncontrado;
			i++;
		}
		return juegoEncontrado;
		
	}
	//hago el mismo metodo pero en la clase Mesa quien será la responsable de eliminar el jugador
	public Jugador sacarJugadorDeMesa(String nombreJugador){
		Jugador jugadorEliminado= null;
		int i=0;
		Mesa mesa;
		//hago un while porque tengo que buscar el jugador en las mesas
		while (i<this.mesas.size () && jugadorEliminado==null){
			//le asigno a la variable mesa la instancia de la mesa que está en la posición i del ArrayList
			mesa =this.mesas.get(i);
			
			//mesa.sacarJugadorDeMesa(nombreJugador); Tengo que revisar este metodo
		}
		
		return jugadorEliminado ;
	}
	public void agregarMesa(Mesa mesa){
		if(this.buscarMesa(mesa.getNumeroMesa())== null){
			this.mesas.add(mesa);

		}
	}
	private Mesa buscarMesa(int numMesa){
		 int i= 0;
		 Mesa mesa;
		 Mesa mesaEncontrada= null;
		 
		 while(i<this.mesas.size() && mesaEncontrada== null){
			 mesa=this.mesas.get(i);
			 if(mesa.getNumeroMesa()==numMesa){
				 mesaEncontrada=mesa;
			 }
			  i++;
		 	}
		 return mesaEncontrada;
	}
}
	
	
	

