public class Decisiones {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean inlcuidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "Plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Péliculas más populares");
        }else {
            System.out.println("Péliculas retros que aun vale la pena ver");
        }


        if (inlcuidoEnElPlan || tipoPlan.equals("Plus")  ){
            System.out.println("Disfrute de su pelicula");
        }else {
            System.out.println("Pelicula no disponible para su plan actual");
        }

    }
}
