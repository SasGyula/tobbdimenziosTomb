//Sas Gyula
package dobasokcsillag;

import java.util.Random;
import java.util.Scanner;

public class DobasokCsillag {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Hányat szeretne dobni?");
        int DSZ = sc.nextInt();
        int[] dobas = new int[12];
        int maxCsillag = 40;
        while(DSZ < 0){
            System.out.print("Nem lehet 0-át vagy kisebbet dobni!");
            DSZ = sc.nextInt();
        }
        int[] elofordul = new int[12];
        for (int i = 0; i < dobas.length; i++) {
            for (int j = 0; j < DSZ; j++) {
                int dobasok = rnd.nextInt(1,13);
                if(i == dobasok){
                    dobas[i]++;
                }
                elofordul[i] = dobas[i];
            }
        }
        int maxEloford = 0;
        for (int i = 0; i < elofordul.length; i++) {
            if(maxEloford<elofordul[i]){
                maxEloford = elofordul[i];
            }
           
        }
        for (int i = 0; i <dobas.length; i++) {
            double cs = (double) elofordul[i]*maxEloford / maxCsillag;
            if(elofordul[i] == maxEloford){
                System.out.print(i+1+" ");
                for (int j = 0; j < maxCsillag; j++) {
                    System.out.print("*");
                }
                System.out.println(" "+ elofordul[i]);
            }else if(elofordul[i]<maxEloford){
                 System.out.print(i+1+" ");
                for (int j = 0; j < cs; j++) {
                    System.out.print("*");
                }
                System.out.println(" "+ elofordul[i]); 
            }

        }
    }
    
}
