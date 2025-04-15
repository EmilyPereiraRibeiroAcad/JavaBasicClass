package aplicacao;

import java.util.Scanner;

public class calculoDeltaExemplo {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int x,y,z,d;
        System.out.print("x: ");
        x = le.nextInt();
        System.out.print("y: ");
        y = le.nextInt();
        System.out.print("z: ");
        z = le.nextInt();
        d = delta(x,y,z);
        System.out.println(" Discriminante: " + d);
        le.close();
        }
        
        public static int delta(int a, int b, int c) {
        int d;
        d = b*b - 4*a*c;
        return d;
        }
        }
        
