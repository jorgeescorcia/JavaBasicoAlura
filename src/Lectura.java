import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escribe el nombre de tu pelicula favorita: ");
        String pelicula = lectura.nextLine();

        System.out.println("Escribe fecha de lanzamiento: ");
        int fechaLanazamiento = lectura.nextInt();

        System.out.println("Dinos que nota le das a la pelicula: ");
        double nota = lectura.nextDouble();


        System.out.println("Pelicula: "+pelicula +"\n"+ "Fecha Lanzamiento: "+fechaLanazamiento +"\n"+ "Nota: "+nota );



    }
}
