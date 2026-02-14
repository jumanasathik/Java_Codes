public class ScoringMatrix {
    public static void main(String[] args) {
           int[][] matrix = {
            { 1, -1, -1, -1 },             
            { -1, 1, -1, -1 },             
            { -1, -1, 1, -1 },             
            { -1, -1, -1, 1 } 
           };
        char[] bases = { 'A', 'T', 'G', 'C' };
    System.out.println("Nucleotide Scoring Matrix:");
        System.out.print("   ");
        for (char base : bases) 
        {
            System.out.print(base + "  ");  
        }
        System.out.println();
        for (int i = 0; i < 4; i++) 
        {
            System.out.print(bases[i] + "  ");
            for (int j = 0; j < 4; j++) {
                System.out.printf("%2d ", matrix[i][j]); }
            System.out.println();
        } 
    } 
}
