import java.util.Scanner;

public class NucleotideCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a DNA sequence: ");
        String dna = sc.next().toUpperCase();
        sc.close();

        int countA=0,countT=0,countG=0,countC=0;

        for(char base : dna.toCharArray()){
            switch(base){
                case 'A': countA++; break;
                case 'T': countT++; break;
                case 'G': countG++; break;
                case 'C': countC++; break;
            }
        }

        System.out.println("A: "+countA);
        System.out.println("T: "+countT);
        System.out.println("G: "+countG);
        System.out.println("C: "+countC);
    }
}
