package Ortland;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private int edad;
	private ArrayList <Carta> cartas;
	
	public Jugador(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public String getNombre(){
		return this.nombre;
	}

	public int getEdad() {
		return edad;
	}

	public ArrayList<Carta> devolverCartas(){
		ArrayList<Carta> cartas;
		cartas = this.cartas;
		this.devolverCartas().clear();
		return cartas;
	}
}
