package com.swcamp.section02.annotation.subsection01.primary;

import com.swcamp.section02.annotation.common.Pokemon;
import org.springframework.stereotype.Service;

@Service("pokemonServicePrimary")

public class PokemonService {

    private final Pokemon pokemon;

    public void pokemonAttack(){
        pokemon.attack();
    }
    public PokemonService(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
