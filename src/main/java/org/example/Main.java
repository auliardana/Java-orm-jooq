package org.example;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;

import static generated_sources.Tables.MAHASISWA;
import static org.jooq.impl.DSL.using;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String userName = "postgres";
        String password = "postgres";
        String url = "jdbc:postgresql://localhost:5432/jooq";

        // Load the PostgreSQL JDBC driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext dslContext = DSL.using(conn);

//            // Insert Data using Jooq
//            String nama = "John Doe";
//            int umur = 25;
//
//            // Create data menggunakan jOOQ
//            dslContext.insertInto(generated_sources.tables.Mahasiswa.MAHASISWA)
//                    .set(generated_sources.tables.Mahasiswa.MAHASISWA.NAMA, nama)
//                    .set(generated_sources.tables.Mahasiswa.MAHASISWA.UMUR, umur)
//                    .execute();
//            System.out.println("Data berhasil disisipkan!");

//            // Retrieve data using jOOQ
//            Result<org.jooq.Record> result = dslContext.select()
//                    .from(MAHASISWA)
//                    .fetch();
//
//            // Print the retrieved data
//            for (org.jooq.Record record : result) {
//                String nama = record.get(MAHASISWA.NAMA);
//                int umur = record.get(MAHASISWA.UMUR);
//                System.out.println("Nama: " + nama + ", Umur: " + umur);
//            }

//            // Update data using jOOQ
//            dslContext.update(MAHASISWA)
//                    .set(MAHASISWA.NAMA, "John Doe baru")
//                    .set(MAHASISWA.UMUR, 30)
//                    .where(MAHASISWA.ID.eq(1)) // Assuming you have an ID column
//                    .execute();
//
//            System.out.println("Data berhasil diupdate!");

            // Delete data using jOOQ
            dslContext.delete(MAHASISWA)
                    .where(MAHASISWA.ID.eq(1)) // Assuming you have an ID column
                    .execute();

            System.out.println("Data berhasil dihapus!");




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}