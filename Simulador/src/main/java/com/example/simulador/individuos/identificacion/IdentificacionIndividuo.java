package com.example.simulador.individuos.identificacion;

import java.util.Random;
public class IdentificacionIndividuo{
    private int individuos;
    private int turno;
    private int num_generacion;
    public IdentificacionIndividuo(int individuos){
        this.individuos=individuos;}
    private void asignarNum(int individuos){
        Random random = new Random();
        ListaSimple asignados=new ListaSimple();
            for (int i = 0; i < individuos; i++) {
                int valorAleatorio = random.nextInt(100);
                asignados.add(valorAleatorio);}
    }
    private ListaSimple GenerarIndividuo() {
        ListaSimple generacion = new ListaSimple();
        //num_generación= número de turno (programar cuando ya tengamos hecho que vaya pasando de turno a medida que la partida va avanzando

        return generacion;
    }}