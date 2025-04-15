package aplicacao;

import java.util.Scanner;

public class mediaComPesos {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        double nota1, nota2;
        for (int aluno = 1; aluno<= 4; aluno++){
        System.out.println("Aluno"+aluno);
        System.out.print("Nota1:");
        nota1 = le.nextDouble();
        System.out.print("Nota2:");
        nota2 = le.nextDouble();
        double media = media_com_pesos(nota1,nota2);
        System.out.println("Media do aluno"+media);
        System.out.println("O conceito com essa media =" +conceito(media));
            
    }   
        le.close();
        }
        public static char conceito(double media){
            if (media >=8.5){
                return 'E';
            }else if (media >= 5) {
                return 'B';
            }else{
                return 'R';
            }
        }
        
        public static double media_com_pesos(double nota1, double nota2) {
        
        return (0.4*nota1 + 0.6*nota2);
        }
        }
        
