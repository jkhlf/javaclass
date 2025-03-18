package com.aula;

public class Aula5 {

    public static void main(String[] args) {
        Endereco end = new Endereco("11015503", 
                                    "Santos", 
                                    Estado.SP, 
                                    "Rua Senador Feijoh, 350");
        Cliente cli = new Cliente(end, "Aluno da Fatec qualquer");
        cli.mostrarCliente();

        Bateria bat = new Bateria(40);
        Celular cel = new Celular(bat,"Teste","46525645");
        cel.ligar();
        cel.mostrar();
    }
}
