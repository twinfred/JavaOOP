package com.timwinfred.pokemon;

public class PokemonTest {
	public static void main(String[] args) {
		Pokedex myPokedex = new Pokedex();
		Pokemon bulbasaur = myPokedex.createPokemon("Bulbasaur", 30, "Grass");
		Pokemon charmander = myPokedex.createPokemon("Charmander", 30, "Fire");
		Pokemon squirtle = myPokedex.createPokemon("Squirtle", 30, "Water");
		
		myPokedex.attackPokemon(bulbasaur);
		myPokedex.attackPokemon(charmander);
		myPokedex.attackPokemon(squirtle);
		myPokedex.attackPokemon(bulbasaur);
		
		System.out.println(myPokedex.pokemonInfo(bulbasaur));
		System.out.println(myPokedex.pokemonInfo(charmander));
		System.out.println(myPokedex.pokemonInfo(squirtle));
	}
}
