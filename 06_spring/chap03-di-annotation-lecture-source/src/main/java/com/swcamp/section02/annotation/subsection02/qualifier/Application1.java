package com.swcamp.section02.annotation.subsection02.qualifier;

import com.swcamp.section02.annotation.subsection01.primary.PokemonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {


        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.swcamp.section02");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        com.swcamp.section02.annotation.subsection02.qualifier.PokemonService pokemonService =
                context.getBean("pokemonServiceQualifier", com.swcamp.section02.annotation.subsection02.qualifier.PokemonService.class);
        pokemonService.pokemonAttack();
    }
}
