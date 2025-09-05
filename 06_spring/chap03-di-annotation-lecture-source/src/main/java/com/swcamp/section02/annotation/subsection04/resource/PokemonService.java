package com.swcamp.section02.annotation.subsection04.resource;

import com.swcamp.section02.annotation.common.Pokemon;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pokemonServiceResource")
public class PokemonService {

    /* 설명. @Resource를 활용한 DI*/
    //필드주입, bean을 1개만 주입받고 싶을때
//    @Resource(name="pikachu") //autowired같은거
//    private Pokemon pokemon;
//
//    public void pokemonAttack(){
//        pokemon.attack();
//    }


    /*bean 여러 개 주입받고 싶을 때*/
    @Resource
    private List<Pokemon> pokemonList;

    public void pokemonAttack(){
        pokemonList.forEach(pokemon -> pokemon.attack());
    }
}
