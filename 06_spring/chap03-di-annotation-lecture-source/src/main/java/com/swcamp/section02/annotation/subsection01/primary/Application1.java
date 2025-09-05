package com.swcamp.section02.annotation.subsection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application1 {
    ApplicationContext context =
            new AnnotationConfigApplicationContext("com.swcamp.section02");

    Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    PokemonService pokemonService =
            context.getBean("pokemonServicePrimary", PokemonService.class);
    pokemonService.pokemonAttack();


}
