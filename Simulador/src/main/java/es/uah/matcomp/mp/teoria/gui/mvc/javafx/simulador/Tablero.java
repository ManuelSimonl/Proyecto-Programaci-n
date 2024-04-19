package es.uah.matcomp.mp.teoria.gui.mvc.javafx.simulador;
import java.util.Scanner;
public class Tablero {
    private int filas;
    private int columnas;
    private char [][]matriz;
    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new char[filas][columnas];
    }
    public void setFilas(int filas) {
        this.filas = filas;}
    public void setColumnas(int columnas) {
        this.columnas = columnas;}
    public void mostrarTablero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número de filas que desea: ");
        int fil = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca el número de columnas que desea: ");
        int col = Integer.parseInt(scanner.nextLine());
        char[][] nuevo = new char[fil][col];
        scanner.close();
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                nuevo[i][j] = '-';
            }
        }
        System.out.println(nuevo);
    }
}