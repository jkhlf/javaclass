
package org.classes;

public class Aluno {

    String nome, ra;
    Curso curso;

    Aluno (String nome, String ra, Curso curso) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    void showInformation() {
        System.out.println("nome:" + nome);
        System.out.println("Ra:" +ra);
        System.out.println(curso.showName());

        switch(curso) {
            case SI:
                System.out.println("CURSO DE DESIGN");
            break;
              case ADS:
                System.out.println("CURSO DE COBOL");
            break;
             case CD:
                System.out.println("CURSO DE VETOR");
            break;
             case RH:
                System.out.println("");
            break;
             case GP:
                System.out.println("");
            break;
             case LOG:
                System.out.println("");
            break;
             case GE:
                System.out.println("");
            break;
            default:
                System.out.println("ngm liga");
        }

    }

}
