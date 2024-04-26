package com.example.simulador.individuos.identificacion;
public class Individuo {
    private Object data;
    public Individuo() {}
    public Individuo(Object data){
            this.data=data;}
    public Object getData(){
            return data;}
    public Object setData(Object o){
            this.data=o;
            return o;}}