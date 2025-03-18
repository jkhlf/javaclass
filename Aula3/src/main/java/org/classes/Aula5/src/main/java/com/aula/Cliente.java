package com.aula;

public class Cliente {

    private final String nome;
    private final Endereco endereco;

    public Cliente(Endereco endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }

    public void mostrarCliente(){
        System.out.println("Nome: " + nome);
        endereco.mostrarEndereco(); //Reuso de codigo
    }

}
