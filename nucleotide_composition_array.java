import java.util.Scanner;

public class NucleotideComposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a DNA sequence: ");
        String dna = sc.next().toUpperCase();
        sc.close();

        char[] seq = dna.toCharArray();
        int[] count = new int[4];

        for(char base : seq){
            switch(base){
                case 'A': count[0]++; break;
                case 'T': count[1]++; break;
                case 'G': count[2]++; break;
                case 'C': count[3]++; break;
            }
        }

        System.out.printf("A: %.2f%%\n",(count[0]/(double)seq.length)*100);
        System.out.printf("T: %.2f%%\n",(count[1]/(double)seq.length)*100);
        System.out.printf("G: %.2f%%\n",(count[2]/(double)seq.length)*100);
        System.out.printf("C: %.2f%%\n",(count[3]/(double)seq.length)*100);
    }
}
