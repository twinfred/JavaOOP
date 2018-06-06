package com.timwinfred.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		System.out.println(name + " was added to the Pokedex.");
		return new Pokemon(name, health, type);
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
		System.out.println(pokemon.getName() + "'s health was reduced by 10.");
	}
}
