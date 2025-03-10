
package org.Aula3;

import org.Teste.Aluno;
import org.Teste.Foo;

public class ModificadorDeAcesso {

    // 1) Atributo:
    //     - Escrita: 
    //         obj.atributo = 7;
    //         é uso de um atributo em atribuição antes do =;

    //     - Leitura:
    //         int x = obj.atributo + 1;
    //         é o uso de um atributo em uma expressão depois do igual.



    // 2) Método 
    //     - Chamada
    //         obj.metodo();
    //         Niveis de acesso

    //         public: membro(atributo/metodo) pode ser por qualquer;
    //         private: membro pode ser acessado apenas por ela propria;
    //         default(modifier): membro pode ser acessado apenas pelas classe do mesmo pacote;
    //         protected: membro pode ser acessado por subclasses e pacotes;

    // 3) Metodos getters/setters 
    //      -Getter:
    //          libera acesso de leitura a um atributo
    
    //      public type(String,int, etc) getAtributo () {
    //      return atributo;
    //      }

            // - Setter: 
            //     libera acesso de escrita a um atributo

            // public void setAtributo (type) {
            //     this.atributo = atribuo
            // }

    // classes com regras de negocio não tevem ter setters, a menos que um framework como spring seja obrigatorio.


        public static void main(String[] args) throws Exception{
            Foo f = new Foo();

            f.y= "oi"; //acesso de escrita no atributo y de f.
            System.out.println(f.y);

            //f.x = 0; // erro pois x é privado.
            f.setX(20);
            System.out.println(f.getX());

            // f.z= 5.7 não pode ser acessado de fora do pacote, somente estando no mesmo pacote.

            Aluno a = new Aluno("Ze", 8);
            a.verificarPR();
            a.mostrarInfo();
            
        }

        //90% dos casos, atributos privados e metodos publicos.
        // Auto aclopamento = ruim.



}


