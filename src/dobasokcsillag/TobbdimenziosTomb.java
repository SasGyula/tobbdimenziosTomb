package tobbdimenziostomb;
public class TobbdimenziosTomb {
    public static void main(String[] args) {
        final int SOR_MAX = 3;
        final int OSZL_MAX = 5;
        int[][] negyzetes = new int[SOR_MAX][OSZL_MAX];
        
        negyzetes[1][2] = 1; 
        
        for (int sor = 0; sor < SOR_MAX; sor++) {
            /*az adott sorban lévő tömb címét írja ki*/
            //System.out.println(negyzetes[sor]);
            /*bejárjuk az adott sorban lévő tömböt:*/
            for (int oszlop = 0; oszlop < OSZL_MAX; oszlop++) {
                System.out.print(negyzetes[sor][oszlop]+" ");
            }
            System.out.println("");
        }
         System.out.println("");
        
         System.out.println("fürészes:");
         int [][] fureszes = new int[5][];
         for (int sor = 0; sor < 5; sor++) {
             //fureszes[sor] = new int [3];
            int oszlopDB = (int) (Math.random()*5);
            fureszes[sor] = new int[oszlopDB];
        }
         //fureszes[2][1] = 1;
         int sorDB = fureszes.length;
         for (int sor = 0; sor < sorDB; sor++) {
             int oszlopDb = fureszes[sorDB].length;
             for (int oszl = 0; oszl < oszlopDb; oszl++) {
                 System.out.print(fureszes[sor][oszl] + " ");
             }
             System.out.println("");
        }
         System.out.println("");
    }
    
}
