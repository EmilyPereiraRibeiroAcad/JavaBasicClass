package aplicacao;

import java.util.Scanner;

public class PlanilhaNotasVetor {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        double nota1[] = new double[4];
        double nota2[] = new double[4];
        double media [] = new double[4];
        for (int aluno = 1; aluno<= 4; aluno++){
        System.out.println("Aluno"+ (aluno+ 1));
        System.out.print("Nota1:");
        nota1 [aluno] = le.nextDouble();
        System.out.print("Nota2:");
        nota2 [aluno] = le.nextDouble();
        }

        media_com_pesos(nota1, nota2, media);
        for (int i = 0; i<4; i++){
            System.out.println("Media do aluno"+media[i]);
            System.out.println("O conceito com essa media =" +conceito(media[i]));
              
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
        
        public static void media_com_pesos(double nota1[], double nota2[], double media[]) {
        
        for (int i=0; i<4; i++){
        media[i] = (0.4*nota1[i] + 0.6*nota2[i]);
        }
        }}
        
