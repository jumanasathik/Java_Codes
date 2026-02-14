import java.sql.*;
import java.util.Scanner;

public class DNAJDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/bioinformatics";
        String user = "root";
        String password = "jmnsql17";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn =
                DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            String createTable =
                "CREATE TABLE IF NOT EXISTS dna_sequences (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "sequence VARCHAR(255) NOT NULL)";

            stmt.executeUpdate(createTable);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a DNA sequence: ");
            String dna = sc.next().toUpperCase();
            sc.close();

            String insertSQL =
                "INSERT INTO dna_sequences (sequence) VALUES (?)";

            PreparedStatement pstmt =
                conn.prepareStatement(insertSQL);

            pstmt.setString(1, dna);
            pstmt.executeUpdate();

            System.out.println("DNA sequence inserted successfully!");

            String query = "SELECT * FROM dna_sequences";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Stored DNA Sequences:");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + ": " +
                    rs.getString("sequence")
                );
            }

            rs.close();
            stmt.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}


