package com.swcamp.section02.subsection02.qualifier;

import com.swcamp.section02.annotation.subsection01.primary.PokemonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application1 {
    ApplicationContext context =
            new AnnotationConfigApplicationContext("com.swcamp.section02");

    Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    com.swcamp.section02.annotation.subsection02.primary.PokemonService pokemonService =
            context.getBean("pokemonServicePrimary", PokemonService.class);
    pokemonService.pokemonAttack();
}
