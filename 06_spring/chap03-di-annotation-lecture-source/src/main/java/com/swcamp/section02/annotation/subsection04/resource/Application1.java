package com.swcamp.section02.annotation.subsection04.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.swcamp.section02");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        com.swcamp.section02.annotation.subsection04.resource.PokemonService pokemonService =
                context.getBean("pokemonServiceResource", PokemonService.class);
        pokemonService.pokemonAttack();
    }
}
