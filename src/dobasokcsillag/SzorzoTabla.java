package tobbdimenziostomb;
public class SzorzoTabla {
    public static void main(String[] args) {
        final int MERET = 10;
        int[][] tabla = new int [MERET+1][MERET+1];
        
        for (int sor = 0; sor <= MERET; sor++) {
            for (int oszl = 0; oszl <= MERET; oszl++) {
               tabla[sor][oszl] = sor * oszl; 
            }
            
        }
        for (int sor = 0; sor <= MERET; sor++) {
            for (int oszl = 0; oszl <= MERET; oszl++) {
                System.out.printf("%3d" ,tabla[sor][oszl]);
            }
            System.out.println(""); 
       }
        System.out.println("");
    }
}
