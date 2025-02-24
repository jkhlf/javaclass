

package org.classes;

public enum Curso {

    SI("Sistemas para internt"),
    ADS("chato"),
    CD("mais chato ainda"),
    RH("só mulher"),
    GP("mar"), 
    LOG("mar e estrada"),
    GE("uber");


    String nome;

    Curso (String nome) {
        this.nome = nome;
    }

    String showName() {
        return  nome;
    }

}
