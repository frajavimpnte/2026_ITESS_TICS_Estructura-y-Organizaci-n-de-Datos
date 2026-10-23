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


public class Main {
    // FastReader class for efficient input
    FastReader reader = new FastReader();

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
    }

    public void mostrarDatos(){
        System.out.println(N);
    }

    public  void resuelve() {
       for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= i; j++) {
                System.out.print("hello world ");
            }
            System.out.println();
       }
    }

    public static void main(String[] args) {

        Main  p = new Main();
        p.leerDatos();
        //p.mostrarDatos();
        p.resuelve();
    }   
}
