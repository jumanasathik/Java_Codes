import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DNAUtilExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> dnaList = new ArrayList<>();

        System.out.print("Enter number of DNA sequences: ");
        int n = sc.nextInt();

        System.out.println("Enter DNA sequences:");

        for (int i = 0; i < n; i++) {
            dnaList.add(sc.next().toUpperCase());
        }

        sc.close();

        Collections.sort(dnaList);

        System.out.println("Sorted DNA Sequences:");

        for (String dna : dnaList) {
            System.out.println(dna);
        }
    }
}
