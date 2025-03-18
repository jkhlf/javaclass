package com.aula;

public class Bateria {

    private int carga;

    public Bateria(int carga) {
        this.carga = Math.max(0,Math.min(100, carga));
    }

    public void carregar(){
        if(carga < 100)
            carga++;
    }

    public void gastar(){
        if(carga > 0)
            carga--;
    }

    public boolean isVazio(){
        return carga == 0;
    }

}
