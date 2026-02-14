import java.util.Scanner;

public class GCContentDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a DNA sequence: ");
        String dna = sc.next().toUpperCase();
        sc.close();

        int gcCount = 0;
        for (char base : dna.toCharArray()) {
            if (base == 'G' || base == 'C') gcCount++;
        }

        double gcPercentage = ((double) gcCount / dna.length()) * 100;
        System.out.printf("GC Content: %.2f%%\n", gcPercentage);

        if (gcPercentage > 60)
            System.out.println("High GC Content");
        else if (gcPercentage >= 40)
            System.out.println("Moderate GC Content");
        else
            System.out.println("Low GC Content");
    }
}
