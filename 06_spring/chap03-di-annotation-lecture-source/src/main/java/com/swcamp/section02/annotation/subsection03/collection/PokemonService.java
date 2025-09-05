package com.swcamp.section02.annotation.subsection03.collection;

import com.swcamp.section02.annotation.common.Pokemon;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceCollection")
public class PokemonService {


    /* 설명. 같은 타입의 bean을 list 형태로 주입주입*/
//
//    private final List<Pokemon> pokemonList;
//
//    public PokemonService(List<Pokemon> pokemonList) {
//        this.pokemonList = pokemonList;
//    }
//
//    public void pokemonAttack() {
//        pokemonList.stream().forEach(pokemon -> pokemon.attack());
//    }

    /* 설명. 2.같은 타입의 bean을 map형태로 주입*/
    private final Map<String, Pokemon> pokemonMap;

        public PokemonService(Map<String, Pokemon> pokemonMap) {
            this.pokemonMap = pokemonMap;
        }
        public void pokemonAttack(){
            pokemonMap.forEach((key,pokemon)->{
                System.out.println("key = " +key);
                System.out.println("pokemon = " +pokemon);
                pokemon.attack();
                System.out.println();
            });
            }

}
