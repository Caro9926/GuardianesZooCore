package com.codingdojo;

public class Gorila extends Mamifero {
	public Gorila(int nivelDeEnergia) {
		super(nivelDeEnergia); 
	}
	
	
	public void lanzarAlgo(){
		int energy = this.mostrarEnergia();
		int reduccion = 5;
		this.setNivelDeEnergia(energy - reduccion);
		System.out.println("El gorila arroj� algo y su energ�a se reduce en:" + reduccion );
     }
	
	
	public void comerBananas(){
		int energy = this.mostrarEnergia();
		int aumento = 10;
		this.setNivelDeEnergia(energy + aumento);
		System.out.println("El gorila se siente feliz de comer bananas y su energ�a aumenta a:" + aumento);
       
    }
	
	
	public void escalar(){
		int energy = this.mostrarEnergia();
		int reduccion = 10;
		this.setNivelDeEnergia(energy - reduccion);
        System.out.println("El gorila ha trepado un �rbol y su energ�a se reduce a:" + reduccion);
       
    }

}
