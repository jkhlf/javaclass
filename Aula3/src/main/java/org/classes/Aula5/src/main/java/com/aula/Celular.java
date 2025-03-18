
package com.aula;

public class Celular {

    private Bateria bat;
    private String nome, numero;
    private Status status;

    public Celular(Bateria bat, String nome, String numero) {
        this.bat = bat;
        this.nome = nome;
        this.numero = numero;
        this.status = Status.OFF;
    }

    public void ligar(){
        //Bateria nao vazia e status OFF
        if(!bat.isVazio() && !status.isStatus()){
            System.out.println("Ola, " + nome);
            bat.gastar();
            status = Status.ON;
        }
    }

    public void desligar(){
        if(status.isStatus()){
            status = Status.OFF;
        }
    }

    public void mostrar(){
        //Bateria nao vazia e status ON
        if(!bat.isVazio() && status.isStatus()){
            System.out.println("Nome: " + nome);
            System.out.println("Numero: " + numero);
            bat.gastar();
        }
    }

}
