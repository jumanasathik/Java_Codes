import java.io.*;
import java.util.Scanner;

public class DNAFileHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String filename = "dna.txt";

        try {

            System.out.print("Enter a DNA sequence: ");
            String dna = sc.next().toUpperCase();

            FileWriter writer = new FileWriter(filename);
            writer.write(dna);
            writer.close();

            System.out.println("DNA sequence written to " + filename);

            BufferedReader reader =
                new BufferedReader(new FileReader(filename));

            String readDNA = reader.readLine();
            reader.close();

            System.out.println("DNA sequence read from file: " + readDNA);

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }

        sc.close();
    }
}
