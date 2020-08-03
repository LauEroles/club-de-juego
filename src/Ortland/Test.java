package Ortland;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		//instancio la clase ortland
		Ortland ortland= new Ortland();
		
		//
		Juego sagrada= new Juego ("Sagrada");
		int numMesa = 1;
		numMesa = instanciarMesas(numMesa, 4, sagrada, ortland);
		System.out.println("numMesa: " + numMesa);
		
		Juego ticketToRide = new Juego ("Ticket to ride");
		numMesa = instanciarMesas(numMesa, 2, ticketToRide, ortland);
		System.out.println("numMesa: " + numMesa);
		
		Juego indigo = new Juego("Indigo");
		numMesa = instanciarMesas(numMesa,1,indigo, ortland);
		System.out.println("numMesa: "+ numMesa);
		
		System.out.println(ortland.getMesas().size());
		
		/*
		
		Juego burako = new Juego ("Burako");
		
		Mesa mesa1= new Mesa(1,4);
		Mesa mesa2= new Mesa(1,4);
		Mesa mesa3= new Mesa(1,4);
		Mesa mesa4= new Mesa(1,4);
		
		Jugador diego=new Jugador("Diego",38);
		Jugador laura=new Jugador("Laura",33);
		
		
		//agrego jugador a la mesa
		mesa1.agregarJugador(diego);
		//mesa1.agregarJugador(laura);
		
		System.out.println("cantidad de juegos en Ortland: "+ ortland.getJuegos().size());
		ortland.agregarJuego(sagrada);
		System.out.println("cantidad de juegos en Ortland: "+ ortland.getJuegos().size());
		
		
		ArrayList<InformeSolitario> informe = sagrada.obtenerJugadorInformeSolitario();
		System.out.println("Cantidad de jugadores Solitarios: "+ informe.size());
		
		for (InformeSolitario informeSolitario: informe){
			System.out.println("Jugador Solitario: "+informeSolitario.getNombreJugador());
		}
		
		*/
		
	}
	
	private static int instanciarMesas(int numeroPrimeraMesa,int cantMesasInst, Juego unJuego, Ortland ortland) {
		int n = numeroPrimeraMesa;
		while (n < numeroPrimeraMesa + cantMesasInst){
			Mesa mesa = new Mesa(n,4);
			unJuego.agregarMesa(mesa);
			ortland.agregarMesa(mesa);
			n++;
		}
		return n;
	}
}

