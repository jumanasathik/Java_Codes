class DNASequence {

    String sequence;

    DNASequence(String seq) {
        sequence = seq.toUpperCase();
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

class Protein extends Gene {

    Protein(String seq) {
        super(seq);
    }

    int getProteinLength() {
        return sequence.length() / 3;
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Protein protein = new Protein("ATGCGATCGTAA");

        System.out.println("DNA Sequence: " + protein.getSequence());
        System.out.println("Gene Length: " + protein.getLength());
        System.out.println("Estimated Protein Length: " + protein.getProteinLength());
    }
}
