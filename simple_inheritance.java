class DNASequence {

    String sequence;

    DNASequence(String seq) {
        this.sequence = seq.toUpperCase();
    }

    String getSequence() {
        return sequence;
    }
}

class Gene extends DNASequence {

    Gene(String seq) {
        super(seq);
    }

    int getLength() {
        return sequence.length();
    }
}

public class SimpleInheritance {

    public static void main(String[] args) {

        Gene gene = new Gene("ATGCGA");

        System.out.println("Gene Sequence: " + gene.getSequence());
        System.out.println("Sequence Length: " + gene.getLength());
    }
}
