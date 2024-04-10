import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvalucioes =0;

        while (nota != -1){
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            nota = lectura.nextDouble();
            if (nota != -1 ){


                mediaEvaluaciones = mediaEvaluaciones + nota;
                totalEvalucioes++;
            }
        }

        System.out.println(mediaEvaluaciones /totalEvalucioes);

    }
}
