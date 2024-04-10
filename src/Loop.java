import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i =0; i < 3; i++){
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            nota = lectura.nextDouble();

            mediaEvaluaciones = mediaEvaluaciones + nota;

        }

        System.out.println(mediaEvaluaciones /3);
    }
}
