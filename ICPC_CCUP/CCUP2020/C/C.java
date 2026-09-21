//   ITESS-TICS 2026
//   Periodo Agosto-Diciembre
//   Estrucutra y Organización de Datos
//   Tema 1. Fundamentos de Estructura de datos
//   1.3 Estructrua linral y no lineal   
//   1.4 Estructura estatica y dinamica

// compilar:   javac C.java
// test:  java Main  < caso1.txt

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class C {
    // FastReader class for efficient input
    FastReader reader = new FastReader();

    // datos
    int N;    // numero de regalos
    int P[];  // guardar el peso del regalo
    int D[];  // guardar la distancia del regalo

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

        P = new int[N];
        D = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = reader.nextInt();
            D[i] = reader.nextInt();
        }
    }

    public void mostrarDatos() {
        System.out.println(N);

        for (int i = 0; i < N; i++) {
            System.out.println(P[i] + " " + D[i]);
        }
    }

    public  void resuelve() {
       long suma = 0; 
       for (int i = 0; i < N; i++) {
            suma += P[i] * D[i];
       }

       System.out.println (suma/400.0);
    }

    public static void main(String[] args) {

        C  c = new C();
        c.leerDatos();
        //c.mostrarDatos();
        c.resuelve();
    }   
}
