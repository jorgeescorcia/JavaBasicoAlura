import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 150000;

        int opcion =0;
        double montoARetirar;
        double montoADepositar;
        int totalIntentos =0;

        System.out.println("**************************************");
        System.out.println(" Nombre Cliente: "+ nombreCliente);
        System.out.println(" Tipo Cuenta: "+ tipoCuenta);
        System.out.println(" Saldo Disponible $"+ saldoDisponible);
        System.out.println("**************************************");


        System.out.println("******************************************");
        System.out.println("* ESCRIBA EL NUMERO DE LA OPCION DESEADA *");
        System.out.println("******************************************");

        String menu = " 1- Consultar Saldo"+"\n"+
                      " 2- Retirar saldo"+"\n"+
                      " 3- Depositar"+"\n"+
                      " 9- Salir";

        System.out.println(menu);

        System.out.println("*****************");
        //System.out.println("Escoja una opción: ");


    while (opcion !=9)   {
        System.out.println(menu);
        System.out.println("Escoja una opción: ");
        opcion = teclado.nextInt();



        switch (opcion){
            case 1:
                System.out.println("Su saldo actual es: "+ saldoDisponible);
                break;
            case  2:
                System.out.println("Ingrese la cantidad a retirar: ");
                montoARetirar = teclado.nextDouble();
                if (montoARetirar == saldoDisponible){
                    System.out.println("Ha retirado el total de su dinero: Saldo actual $0 Pesos");
                }else if (montoARetirar < saldoDisponible){
                    System.out.println("Retiró: "+montoARetirar +" Disponible: "+(saldoDisponible = saldoDisponible - montoARetirar));

                }else if (montoARetirar > saldoDisponible) {
                    System.out.println("No cuenta con suficiente dinero en la cuenta:'El monto que intenta retirar es mayor que el disponible'");
                }

                break;
            case 3:
                System.out.println("Ingrese el valor a depositar");
                montoADepositar = teclado.nextDouble();

                System.out.println("Ha depositado : "+ montoADepositar);
                System.out.println("Su saldo actual es: "+ (saldoDisponible = saldoDisponible + montoADepositar));
                break;

            case 9:
                System.out.println("Gracias por utilizar su banco, regrese pronto");
                break;
            default:
                System.out.println("Opcion no valida");


        }

    }

    }
}
