//   ITESS-TICS 2026
//   Periodo Agosto-Diciembre
//   Estrucutra y Organización de Datos
//   Tema2. Estructuras Lineales 
//   Problema: Containter with most water
// compilar:   javac Main.java
// test:  java Main  < caso1.txt

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;


public class ContainerWithMostWater_ICPC {
    // FastReader class for efficient input
    FastReader reader = new FastReader();

    // donde se guardan los datos
    List<Integer>  containerHeight = new ArrayList<>(); 
    // cantidad de numeros para el problema
    int N;                                  

    static class FastReader {
        // BufferedReader to read input
        BufferedReader b;
        // StringTokenizer to tokenize input
        StringTokenizer s; 

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace(); 
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() { 
                return Integer.parseInt(next()); 
        }

        // Method to read Char
        char nextChar() {
            return next().charAt(0);
        }

        // Method to read the next token as a long
        long nextLong() { 
            return Long.parseLong(next()); 
        }

        // Method to read the next token as a double
        double nextDouble() { 
            return Double.parseDouble(next()); 
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            return str;
        }
    }

    public  void leerDatos() {
        N = reader.nextInt();
        for (int i = 0; i < N; i++) {
            containerHeight.add(reader.nextInt());
        }
    }

    public void mostrarDatos(){
        System.out.println("N: " + N);
        System.out.print("Alturas: ");
        for (int i = 0; i < N; i++) {
            System.out.print(containerHeight.get(i) + " ");
        }
        System.out.println();
    }

    public void resolver() {
        if (N < 2) {
            System.out.println("Se necesitan al menos dos alturas para formar un contenedor.");
            return;
        }

        int izquierda = 0;
        int derecha = N - 1;
        int indiceIzquierdo = -1;
        int indiceDerecho = -1;
        long maxAgua = 0;

        while (izquierda < derecha) {
            int alturaMinima = Math.min(
                containerHeight.get(izquierda),
                containerHeight.get(derecha)
            );
            long area = (long) alturaMinima * (derecha - izquierda);

            if (area > maxAgua) {
                maxAgua = area;
                indiceIzquierdo = izquierda;
                indiceDerecho = derecha;
            }

            if (containerHeight.get(izquierda) <= containerHeight.get(derecha)) {
                izquierda++;
            } else {
                derecha--;
            }
        }

        System.out.println("Cantidad máxima de agua: " + maxAgua);
        System.out.println("Índices de las alturas: " + indiceIzquierdo + " y " + indiceDerecho);
    }

    public static void main(String[] args) {

        ContainerWithMostWater_ICPC  p = new ContainerWithMostWater_ICPC();
        p.leerDatos();
        p.mostrarDatos();
        p.resolver();
    }   
}
