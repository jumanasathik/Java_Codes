import java.util.Scanner;

class DNASequence {

    String sequence;

    DNASequence(String seq) {

        this.sequence = seq.toUpperCase(); }

    String getSequence() {

        return sequence; }

    int getLength() {

        return sequence.length();  }}

public class DNAClassExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a DNA sequence: ");

        String inputSeq = sc.next();

        sc.close();

        DNASequence dna = new DNASequence(inputSeq);

        System.out.println("DNA Sequence: " + dna.getSequence());

        System.out.println("Sequence Length: " + dna.getLength()); 
    }
  
}
