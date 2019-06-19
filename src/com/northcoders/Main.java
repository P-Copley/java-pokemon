package com.northcoders;

import com.northcoders.pokedex.Pikachu;

public class Main {

    public static void main(String[] args) {
    	// Pokemon with types
    	Pokemon charmander = new Pokemon("charmander", new Type[]{ Type.Fire});
    	System.out.println(charmander.getTypes()[0].getStrengths()[0]);

		Pokemon pikachu = new Pokemon("Pikachu", new Type[] {Type.Electric});
		System.out.println( pikachu.getTypes()[0]); // --> Type[] {"electric"}


		Pokemon bulbasaur = new Pokemon("Bublasaur", new Type[] {Type.Grass});
		bulbasaur.setTypes(new Type[] {Type.Grass, Type.Poison});
		System.out.println(bulbasaur.getTypes()[0]); ;// --> Type[] Type.grass
		System.out.println(bulbasaur.getTypes()[1]); ;// --> Type[] Type.poison

		System.out.println(bulbasaur.getTypes()[0].getModifier(new Type[]{Type.Water}));

		// Moves

		Move scratch = new Move("scratch", 15, Type.Normal);


		// Inherited classes - could be updated to Pokemon as well
		Pikachu pika = new Pikachu("pika");
		System.out.println(pika.getMoves()[0].getName());
	}
}
