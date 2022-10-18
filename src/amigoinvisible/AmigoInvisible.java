/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amigoinvisible;

import java.util.Scanner;

/**
 *
 * @author edume
 */
public class AmigoInvisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fallo = 0;
        int num;
        int i = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Deme el numero de componentes ");
        num = teclado.nextInt();

        String amigos[] = new String[num];
        int aleatorio[] = new int[num];

        for (i = 0; i < amigos.length; i++) {
            Scanner tec = new Scanner(System.in);
            System.out.println("Deme el nombre del amigo numero " + (i + 1) + " ");
            amigos[i] = tec.nextLine();

        }

        do {

            fallo = 0;
            for (i = 0; i < aleatorio.length; i++) {
                int elnum = (int) (Math.random() * num);
                aleatorio[i] = elnum;
                for (int j = 0; j < i; j++) {
                    if (aleatorio[i] == aleatorio[j]) {
                        i--;
                    }
                }
            }
            for (i = 0; i < aleatorio.length; i++) {
                if (aleatorio[i] == i) {
                    fallo++;

                }

            }
        } while (fallo > 0);

        for (i = 0; i < amigos.length; i++) {

            /* System.out.println("A "+amigos[i]+" le toca "+ aleatorio[i]);*/
            System.out.println(amigos[i] + " le toca " + amigos[aleatorio[i]]);
        }

    }

}
