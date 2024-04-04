import java.sql.*;

public class DBConnect {
    public static final String DB_URL = "jdbc:postgresql:jdbc-test";
    public static final String DB_USERNAME = "postgres";
    public static final String DB_PASSWORD = "1723";

    public static void DBConnection() {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            st = conn.createStatement();

            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet tables = metaData.getTables(null, null, "employees", null);
            if (!tables.next()) {
                // Table does not exist, so create it
                String createTableQuery = "CREATE TABLE employees (id SERIAL PRIMARY KEY, name VARCHAR(100) NOT NULL, position VARCHAR(100) NOT NULL, salary INT NOT NULL)";
                st.execute(createTableQuery);
                System.out.println("Table 'employees' has been created!");
            } else {
                System.out.println("Table 'employees' already exists!\nForwarding next step...");
            }

            String[] employeeNames = {"Eren", "Göktuğ", "Sinem", "Kardelen", "Atilla"};
            String[] employeePosition = {"SRE", "QA", "QA", "Backend Developer", "Data Analyst"};
            int[] employeeSalaries = {10000, 15000, 20000, 15000, 10000};

            for (int i = 0; i < employeeNames.length; i++) {
                PreparedStatement pr = conn.prepareStatement("INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)");
                pr.setString(1, employeeNames[i]);
                pr.setString(2, employeePosition[i]);
                pr.setInt(3, employeeSalaries[i]);

                int affectedRow = pr.executeUpdate();
                if (affectedRow > 0) {
                    System.out.println("Employee " + (i+1) + " added to the table");
                } else {
                    System.out.println("Something went wrong.");
                }
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}
