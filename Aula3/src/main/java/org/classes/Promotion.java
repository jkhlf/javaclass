

package org.classes;


public enum Promotion {

    QU("queima de estoque", 0.5), 
    SZ("sazonal", 0.9), 
    BF("black friday", 0.8),
    NP("sem promoção", 1);

    String descricao;
    double descontoPer;

    Promotion(String descricao, double descontoPer) {
        this.descricao = descricao;
        this.descontoPer = descontoPer;
    }

    String getDesconto() {
        return this.descricao;
    }

    double getDescontoPer() {
        return this.descontoPer;
    }
}
