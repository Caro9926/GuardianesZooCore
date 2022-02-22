package com.codingdojo2;


public class TestMurcielago {
	public static void main(String[] args) {
	       Murcielago m = new Murcielago(300);
	            
	       m.atacarPueblo();
	       m.atacarPueblo();
	       m.atacarPueblo();
	       m.comerHumanos();
	       m.comerHumanos();
	       m.volar();
	       
	       System.out.println( "El murciélago tiene: "  + m.mostrarEnergia());
	     
	    }
}
