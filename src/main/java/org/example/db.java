package org.example;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    public static DSLContext getDSLContext() {
        // Konfigurasi koneksi database
        String url = "jdbc:postgresql://localhost:5432/jooq";
        String username = "postgres";
        String password = "postgres";

        // Mengatur driver JDBC (gantilah dengan driver yang sesuai)
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Menggunakan jOOQ untuk membuat DSLContext
            DSLContext dslContext = DSL.using(connection, SQLDialect.POSTGRES);
            return dslContext;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
