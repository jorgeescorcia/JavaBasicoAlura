public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean inlcuidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 +6.0 +9.0) / 3;
        System.out.println(media);

        String sinopsis = "Matrix es una paradoja \n" +
                "la mejor pelicula del fin del milenio\n" +
                "fue lanzada en: " + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasifiacion = (int) (media /2);
        System.out.println(clasifiacion);

    }
}