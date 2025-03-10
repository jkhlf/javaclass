package org.Teste;

public class Aluno {
    private String nome;
    private double PR;

    public Aluno (String nome, double PR) throws Exception{
        
        if(nome == null || nome.equals("")){
            throw  new Exception("Nome invalido");
        }
        if(PR < 0 || PR > 10) {
            throw new Exception("PR invaldio");
        }
        this.nome = nome;
        this.PR = PR;
    }

        public void mostrarInfo() {
            System.out.println(nome);
            System.out.println(PR);
        }

        public void verificarPR() {
            if( PR >= 6){
                System.out.println("Tamo bem");
            } else {
                System.out.println("tamo mal");
            }

        }

}   
