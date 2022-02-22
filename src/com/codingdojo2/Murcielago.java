package com.codingdojo2;
import com.codingdojo.Mamifero; 

public class Murcielago extends Mamifero {
	public Murcielago(int nivelDeEnergia) {
		super(nivelDeEnergia); 
	}
	
	public void volar(){
		int energy = this.mostrarEnergia();
		int reduccion = 50;
		this.setNivelDeEnergia(energy - reduccion);
		System.out.println("El murciélago está volando y su energía se reduce en:" + reduccion );
     }
	
	public void comerHumanos(){
		int energy = this.mostrarEnergia();
		int aumento = 25;
		this.setNivelDeEnergia(energy + aumento);
		System.out.println("El murciélago está volando y su energía aumenta en:" + aumento);
     }
	
	public void atacarPueblo(){
		int energy = this.mostrarEnergia();
		int reduccion = 100;
		this.setNivelDeEnergia(energy - reduccion);
		System.out.println("El murciélago está atacando el pueblo haciendo que se incendie y su energía se reduce en:" + reduccion);
     }
	
}
