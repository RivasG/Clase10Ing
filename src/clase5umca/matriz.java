package clase5umca;

public class matriz {

    public static void main(String[] args) {
        int i, j,suma;
        int[][] matriz = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 9);

            }
        }
        
       for (i = 0; i < 3; i++) {
           suma= matriz [i][0]+matriz [i][1]+matriz [i][2];
    System.out.println(matriz[i][0]+" "+matriz[i][1]+" "+matriz[i][2]+" ="+suma); 
                
                }
            System.out.println(" ");
            }
    
}
