package pkgswitch;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;

        opc = entrada.nextInt();

        System.out.println("digite un numero"
                + "\n 1"
                + "\n 2"
                + "\n 3"
                + "\n 4"
                + "\n 5"
                + "\n 6 salir ");

        switch (opc) {
            case 1:
                System.out.println("hola 1");
                break;
            case 2:
                System.out.println("hola 2");
                break;
            case 3:
                System.out.println("hola 3");
                break;
            case 4:
                System.out.println("hola 4");
                break;
            case 5:
                System.out.println("hola 5");
                break;
        }
    }

}
