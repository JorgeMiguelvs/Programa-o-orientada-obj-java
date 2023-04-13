package meteoros;

import java.util.Scanner;


public class Meteoros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x1, x2, y1, y2, x, y, j = 1, qtd, nMet = 0;

        do {
            qtd = 0;
            System.out.println("Canto superior esquerdo==> x:");
            x1 = entrada.nextInt();
            System.out.println("Canto superior esquerdo==> y:");
            y1 = entrada.nextInt();

            System.out.println("Canto inferior direito==> x:");
            x2 = entrada.nextInt();
            System.out.println("Canto inferior direito==> y:");
            y2 = entrada.nextInt();

            if (x1 != 0 && x2 != 0 && y1 != 0 && y2 != 0) {
                if (x1 >= 0 && x1 <= x2) {
                    if (y2 >= 0 && y2 <= y1) {

                        System.out.println("NÃºmero de meteoritos:");
                        nMet = entrada.nextInt();

                        for (int i = 0; i < nMet; i++) {

                            System.out.println("Digite as coordenadas (x,y) do meteorito: ");
                            x = entrada.nextInt();
                            y = entrada.nextInt();

                            if (x >= x1 && x <= x2) {
                                if (y >= y2 && y <= y1) {
                                    qtd++;
                                }
                            }
                        }
                        System.out.println("\nTeste " + j + "\nquantidade: " + qtd);
                        j++;
                    }
                }
            }
        } while (x1 != 0 && x2 != 0 && y1 != 0 && y2 != 0);

    }
}