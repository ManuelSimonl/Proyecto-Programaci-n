package com.example.simulador.individuos.identificacion;
import com.example.simulador.individuos.identificacion.Individuo;
public class ListaSimple {
        private Individuo[] dato;
        private int maximo;
        private int num_elementos;

    public ListaSimple() {
    }

    public ListaSimple(int maximo){
            this.maximo=maximo;
            this.dato=new Individuo[maximo];
            this.num_elementos=0;}
        public boolean isVacia(){
            if (num_elementos==0){
                return true;}else{
                return false;}}
        public void vaciar(){
            dato=new Individuo[maximo];
            num_elementos=0;}
        private int add(Individuo elemento) {
            if (num_elementos < maximo) {
                dato[num_elementos] = elemento;
                num_elementos += 1;
                return num_elementos;
            } else {
                return -1;}}
        public void add(String s){
            Individuo Ele=new Individuo(s);
            add(Ele);}
        public void add(Object o){
            Individuo Ele=new Individuo(o);
            add(Ele);}
        public void insert(String s, int posicion){
            Individuo ele=new Individuo(s);
            this.dato[posicion]=ele;}
        public void insert(Object o, int posicion){
            Individuo ele=new Individuo(o);
            this.dato[posicion]=ele;}
        public int del(int posicion){
            if(posicion>=0 && posicion<num_elementos) {
                for(int i=posicion; i<num_elementos-1; i++){
                    dato[i]=dato[i+1];}
                num_elementos--;
            }else{
                return -1;}
            return posicion;}
        public int getNum_elementos() {return num_elementos;}
        public int getPosicion(Individuo el){
            for(int i=0; i<num_elementos;i++){
                if(dato[i]==el){
                    return i;}}
            return -1;}
        public Individuo getPrimero(){
            if (num_elementos>0){
                return dato[0];}
            return null;}
        public Individuo getUltimo(){
            if (num_elementos>0){
                return dato[num_elementos-1];}
            return null;}
        private Individuo getSiguiente(Individuo el){
            if (num_elementos>0 && getPosicion(el)<num_elementos-1){
                return dato[getPosicion(el)+1];}
            return null;
        }
        public Individuo getElemento(int posicion){
            if (posicion>=0 && posicion<= num_elementos-1 ){
                return dato[posicion];}
            return null;}
    }