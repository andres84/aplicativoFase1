package aplicativofase1;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        /*
        
        un banco tiene 3 clientes que pueden hacer depositos y retiros, tambien el banco requiere
        que al final del dia calcule la cantidad de dinero que hay depositado.
        
        hay dos entidades
        Persona
        Banco
        
         */
        Banco banco = new Banco();

        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------");
        System.out.println("BIENVENIDOS AL BANCO FRAGOZO, por favor digite su numero de cuenta");
        int cuenta = sc.nextInt();

        String operacion = "";

        switch (cuenta) {

            case 1:
                System.out.println("Bienvenido " + banco.getPer1().getNombre());
                System.out.println("----------------------------------");
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A-Depositar");
                System.out.println("B-Retirar");
                operacion = sc.next();
                switch (operacion) {

                    case "A":
                        System.out.println("---------------------------");
                        System.out.println("ingrese el monto a depositar");
                        double montoDeposito = sc.nextDouble();
                        double montoAnteriorDeposito = banco.getPer1().getMonto();
                        banco.getPer1().setMonto(montoAnteriorDeposito + montoDeposito);
                        System.out.println("el monto final es " + banco.getPer1().getMonto());
                        break;
                    case "B":
                        System.out.println("---------------------------");
                        System.out.println("ingrese el monto a retirar");
                        double montoRetiro = sc.nextDouble();
                        double montoAnteriorRetiro = banco.getPer1().getMonto();
                        banco.getPer1().setMonto(montoAnteriorRetiro - montoRetiro);
                        System.out.println("el monto final es " + banco.getPer1().getMonto());
                        break;
                }
                break;
            case 2:
                System.out.println("Bienvenido " + banco.getPer2().getNombre());
                System.out.println("----------------------------------");
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A-Depositar");
                System.out.println("B-Retirar");
                operacion = sc.next();
                switch (operacion) {

                    case "A":
                        System.out.println("---------------------------");
                        System.out.println("ingrese el monto a depositar");
                        double montoDeposito = sc.nextDouble();
                        double montoAnteriorDeposito = banco.getPer2().getMonto();
                        banco.getPer2().setMonto(montoAnteriorDeposito + montoDeposito);
                        System.out.println("el monto final es " + banco.getPer2().getMonto());
                        break;
                    case "B":
                        System.out.println("---------------------------");
                        System.out.println("ingrese el monto a retirar");
                        double montoRetiro = sc.nextDouble();
                        double montoAnteriorRetiro = banco.getPer2().getMonto();
                        banco.getPer2().setMonto(montoAnteriorRetiro - montoRetiro);
                        System.out.println("el monto final es " + banco.getPer2().getMonto());
                        break;
                }
                break;
            case 3:
                System.out.println("Bienvenido " + banco.getPer3().getNombre());
                System.out.println("----------------------------------");
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A-Depositar");
                System.out.println("B-Retirar");
                operacion = sc.next();
                switch (operacion) {

                    case "A":
                        System.out.println("---------------------------");
                        System.out.println("ingrese el monto a depositar");
                        double montoDeposito = sc.nextDouble();
                        double montoAnteriorDeposito = banco.getPer3().getMonto();
                        banco.getPer3().setMonto(montoAnteriorDeposito + montoDeposito);
                        System.out.println("el monto final es " + banco.getPer3().getMonto());
                        break;
                    case "B":
                        System.out.println("---------------------------");
                        System.out.println("ingrese el monto a retirar");
                        double montoRetiro = sc.nextDouble();
                        double montoAnteriorRetiro = banco.getPer3().getMonto();
                        banco.getPer3().setMonto(montoAnteriorRetiro - montoRetiro);
                        System.out.println("el monto final es " + banco.getPer3().getMonto());
                        break;
                }
                break;

            default:
                System.out.println("Cuenta no registrada :(");
                System.exit(0);
        }

        System.out.println(banco.getPer1().getMonto() + banco.getPer2().getMonto() + banco.getPer3().getMonto());

    }

}
