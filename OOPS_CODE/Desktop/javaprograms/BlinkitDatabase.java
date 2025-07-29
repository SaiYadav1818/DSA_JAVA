import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BlinkitDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourdatabase";
        String user = "root";
        String password = "yourpassword";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();

            // Creating the table
            String createTableSQL = """
                CREATE TABLE IF NOT EXISTS vegetables (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(50),
                    quantity INT,
                    price DECIMAL(10, 2),
                    discount DECIMAL(5, 2)
                );
                """;
            stmt.execute(createTableSQL);

            // Inserting data into the table
            String insertDataSQL = """
                INSERT INTO vegetables (name, quantity, price, discount) VALUES 
                ('Tomato', 50, 30.00, 5.00),
                ('Potato', 100, 20.00, 2.50),
                ('Onion', 80, 25.00, 3.00),
                ('Carrot', 60, 35.00, 4.00),
                ('Spinach', 40, 15.00, 1.50);
                """;
            stmt.executeUpdate(insertDataSQL);

            System.out.println("Table created and data inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
