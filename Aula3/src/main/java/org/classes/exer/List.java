package org.classes.exer;

public class List {

//    Exercício 1 – Classes Pessoa e Churrasco
//
//    Classe Pessoa:
//
//    Atributos:
//    String nome
//    String sexo
//    int idade
//    boolean vegetariana
//
//    Classe Churrasco:
//
//    Atributos:
//    double qtdCarne
//    Metodo:
//    verificarConsumo(Pessoa p)
//    Define a quantidade média de carne consumida de acordo com os critérios:
//            0 a 3 anos: Não consomem carne.
//            Vegetarianos: Não consomem carne.
//                4 a 12 anos: Consomem 1 kg de carne.
//                13 anos ou mais: Consomem 2 kg de carne.
//
//            Exercício 2 – Classe Lâmpada
//
//    Atributos:
//
//    estado (Enum; por exemplo: ACESA e APAGADA)
//
//    Métodos:
//
//    click():
//    Alterna o estado da lâmpada:
//    Se estiver acesa, muda para apagada.
//    Se estiver apagada, muda para acesa.
//    Deve incrementar a contagem de acendimentos sempre que a lâmpada for acesa (chamar o método qtdAcendimentos() dentro do click()).
//    qtdAcendimentos():
//    Retorna o número de vezes que a lâmpada foi acesa.
//    checaEstado():
//    Retorna o estado atual da lâmpada.
//
//    Exercício 3 – Classe Complexo
//
//    Atributos:
//
//    double a – Parte real
//    double b – Parte imaginária
//
//    Métodos:
//
//    Construtor: Inicializa os atributos a e b.
//    soma(Complexo outro):
//    Soma outro número complexo (soma as partes reais e as partes imaginárias).
//    multiplica(Complexo outro):
//    Realiza a multiplicação usando a fórmula:
//            (a+bi)×(c+di)=(ac−bd)+(ad+bc)i(a+bi)×(c+di)=(ac−bd)+(ad+bc)i
//    toString():
//    Retorna uma string com a notação “a + bi”.
//    modulo():
//    Retorna o módulo do número complexo, calculado por a2+b2a2+b2
//
//        ​.
//    argumentoPrincipal():
//    Retorna o ângulo (θ) formado pelo número complexo no plano de Argand-Gauss, dado por:
//    θ=tan⁡−1(ba)θ=tan−1(ab​).
//
//    Exercício 4 – Classe Cliente
//
//    Atributos:
//
//    String nome
//    double saldo
//    double limite
//
//    Métodos:
//
//    sacar(double valor):
//    Permite o saque somente se saldo + limite for igual ou superior ao valor solicitado.
//    depositar(double valor):
//    Realiza o depósito de um determinado valor.
//            checarSaldo():
//    Retorna a soma de saldo e limite.
//            obterNome():
//    Retorna o nome do cliente.
//
//            Exercício 5 – Triângulo Equilátero
//
//    Atributos:
//
//    double lado
//    double perimetro
//    double area
//
//    Métodos:
//
//    Construtor: Inicializa o atributo lado.
//    calcArea():
//    Calcula a área usando a fórmula:
//    Aˊrea=lado×32Aˊrea=2lado×3
//
//            ​​
//    calcPerimetro():
//    Calcula o perímetro:
//    Perıˊmetro=3×ladoPerıˊmetro=3×lado
//    Métodos get para os atributos area e perimetro.
//
//    Exercício 6 – Jogo de Adivinhação de Números
//
//    Atributos:
//
//    int numeroSorteado
//
//    Métodos:
//
//    sortear():
//    Utiliza a classe Random para sortear um número entre 0 e 99 (utilizando o método nextInt(100)).
//    advinhar(int palpite):
//    Permite que o usuário tente adivinhar o número sorteado.
//
//            Exercício 7 – Equação do 2º Grau (Eq2Grau)
//
//    Atributos:
//
//    double a
//    double b
//    double c
//
//    Métodos:
//
//    delta():
//    Retorna o valor de Δ da equação.
//            raiz1():
//    Retorna a primeira raiz se Δ ≥ 0; caso contrário, retorna NaN.
//            raiz2():
//    Retorna a segunda raiz se Δ ≥ 0; caso contrário, retorna NaN.
//
//            Exercício 8 – Classe Porta
//
//    Atributos:
//
//    boolean isOpen
//    int numAberturas
//    Observação: Esse atributo deve contar o total de aberturas de todas as instâncias de porta.
//
//    Métodos:
//
//    abrir():
//    Abre a porta e incrementa o contador de aberturas.
//            fechar():
//    Fecha a porta.
//
//            Exercício 9 – Classe Transferencia
//
//    Utilizando a Classe Cliente do Exercício 4:
//
//    Método:
//
//    transferir(Cliente c1, Cliente c2, double quantia):
//    Verifica se c2 possui saldo (considerando o limite) suficiente para a transferência.
//    Realiza a dedução da quantia na conta de c2 e adiciona na conta de c1.
//    Exibe uma mensagem de conclusão da transferência, informando os nomes dos clientes envolvidos.
//
//    Exercício 10 – Classe Casa
//
//    Utilizando a Classe Porta do Exercício 8:
//
//    Atributos:
//
//    String cor
//    Uma porta de entrada.
//    Até três portas internas (cada uma pode ser aberta ou fechada independentemente).
//
//    Métodos:
//
//    Métodos para abrir e fechar cada porta.
//    Método que retorna quantas portas estão abertas.
//
//            Exercício 11 – Classe Edifício e Apartamento
//
//    Classe Apartamento:
//
//    Atributos:
//    int identificador – Número identificador do apartamento.
//
//    Classe Edificio:
//
//    Considera que cada edifício possui 3 apartamentos.
//            Métodos:
//    Adicionar apartamentos.
//    Listar todos os apartamentos.
//    Buscar um apartamento pelo seu identificador.
//
//    Exercício 12 – Classes Cliente e Telefone (Versão 2)
//
//    Classe Cliente:
//
//    Atributos:
//    String nome
//    String cpf
//    Telefone telefone (associação com a classe Telefone)
//
//    Métodos:
//    mostrarDados():
//    Exibe todos os dados do cliente, incluindo os dados do telefone.
//            adicionarTelefone(Telefone novoTelefone):
//    Associa um novo telefone ao cliente.
//
//    Classe Telefone:
//
//    Atributos:
//    String ddd
//    String numero
//
//    Métodos:
//    obterNumero()
//    obterDDD()
}
