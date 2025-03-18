package com.aula;

public class Endereco {

    //final ("const"): Deixa o atributo constante. Ou seja, imutavel.
    //Imune aos setters.
    private final String logradouro, cep, cidade;
    private final Estado estado;

    public Endereco(String cep, 
                    String cidade, 
                    Estado estado, 
                    String logradouro) {
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.logradouro = logradouro;
    }

    public void mostrarEndereco(){
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Estado: " + estado);
    }

}
