interface DNAProperties {
    double getGCContent();
}

interface GeneProperties {
    int getLength();
}

class Gene implements DNAProperties, GeneProperties {

    String sequence;

    Gene(String seq) {
        sequence = seq.toUpperCase();
    }

    public double getGCContent() {

        int gcCount = 0;

        for (char base : sequence.toCharArray()) {
            if (base == 'G' || base == 'C') {
                gcCount++;
            }
        }

        return ((double) gcCount / sequence.length()) * 100;
    }

    public int getLength() {
        return sequence.length();
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Gene gene = new Gene("ATGCGATCGTAA");

        System.out.println("Gene Length: " + gene.getLength());
        System.out.printf("GC Content: %.2f%%\n", gene.getGCContent());
    }
}
