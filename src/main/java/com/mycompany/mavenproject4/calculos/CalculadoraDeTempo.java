package com.mycompany.mavenproject4.calculos;

import com.mycompany.mavenproject4.modelos.Filme;
import com.mycompany.mavenproject4.modelos.Serie;
import com.mycompany.mavenproject4.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulos) {
        System.out.println("Adicionando duração em minutos de " + titulos);
        this.tempoTotal += titulos.getDuracaoEmMinutos();
    }
}
