package com.swcamp.section02.annotation.subsection02.qualifier;

import com.swcamp.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

//    @Autowired
//    @Qualifier("squirtle")
//    private Pokemon pokemon;
private Pokemon pokemon;


@Autowired
    public PokemonService(@Qualifier("squirtle") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack(){
        pokemon.attack();
    }

}
