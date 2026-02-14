import java.util.Scanner;

public class DNAExceptionHandling {

    static void validateDNA(String sequence) throws Exception {

        for (char base : sequence.toUpperCase().toCharArray()) {
            if (base != 'A' && base != 'T' && base != 'G' && base != 'C') {
                throw new Exception(
                    "Invalid DNA sequence: Contains non-DNA character '" + base + "'"
                );
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a DNA sequence: ");
        String dna = sc.next();
        sc.close();

        try {
            validateDNA(dna);
            System.out.println("Valid DNA Sequence: " + dna.toUpperCase());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
