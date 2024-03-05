package tobbdimenziostomb;

import java.util.Random;

public class MelyikKockaval {
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        final int DSZAM = 500;
        final int KOCKA_OLDAL = 6;
        int[][] dobasok = new int[KOCKA_OLDAL+1][KOCKA_OLDAL+1];
        for (int sor = 0; sor < DSZAM; sor++) {
            int dobas1= rnd.nextInt(1,7);
            int dobas2= rnd.nextInt(1,7); 
            dobasok[dobas1][dobas2]++;
        }
        for (int i = 0; i < KOCKA_OLDAL; i++) {
            for (int j = 0; j < KOCKA_OLDAL+1; j++) {
                System.out.print(dobasok[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
