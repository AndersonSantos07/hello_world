package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {


    @GetMapping
    public String helloWorld(){
        return "Hello World!!";
    }

    @GetMapping("/bsms")
    public String listaBsm(){

        return """
                Lista de BSM's:
                \nPersistência;
                \nResponsabilidade Pessoal;
                \nOrientação ao Futuro;
                \nHabilidades Comportamentais e Mentalidades;
                \nComunicação;
                \nOrientação ao Detalhe;
                \nProatividade;
                \nTrabalho em Equipe;
                \nMentalidade de Crescimento.
                """;
    }

    @GetMapping("/objetivos")
    public String objetivosSemana(){

        return """
                Lista de objetivos semanais:
                \nEntender o Spring boot;
                \nFazer partes do blog pessoal;
                \nArrumar curriculo (Salvar em docx, algoritmo linkedin);
                \nArrumar linkedin;
                \nInscrever nas primeiras vagas;
                \nRevisar POO;
                \nRevisar CRUD;
                \nRevisar Padrão de projeto, camadas, separação de responsabilidades;
                \nRealizar tarefas pendentes;
                \nProjeto integrador.
                """;
    }





}
