/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bp2projelogintasarim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class CompanyDB {

    //Database baglantisi icin user naem password ve url olusturdum. 
    private static final String userName = "root";
    private static final String password = "12345678";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/proje_company_db";

    private static Connection conn;

    public static boolean Test() {

        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();

            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Kullanici ekleme yapiyorum.
    public static boolean AddPerson(Person np1) {

        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO proje_company_db.tbl_personel_info VALUES(" + np1.id + ",'" + np1.name_surname + "','" + np1.email + "','" + np1.password + "','" + np1.address + "','" + np1.gender + "','" + np1.position + "' );";
            stmt.executeUpdate(query);

            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    //Calisan eklemeyi yapiyorum. 
    public static boolean AddStaff(Staff np1) {

        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO proje_company_db.tbl_personel_company_info (id, name_surname, email, password, address, gender, position, salary) VALUES ("
                    + np1.id + ", '" + np1.name_surname + "', '" + np1.email + "', '" + np1.password + "', '" + np1.address + "', '" + np1.gender + "', '" + np1.position + "', " + np1.salary + ")";
            stmt.executeUpdate(query);

            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    //Basvuranlar icin eklemeyi yapiyorum. 

    public static boolean AddCandidate(Candidate np1) {

        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO proje_company_db.tbl_personel_candidate VALUES(" + np1.id + ",'" + np1.name_surname + "','" + np1.email + "','" + np1.address + "','" + np1.experience + "','" + np1.expectations + "','" + np1.gender + "' );";
            stmt.executeUpdate(query);

            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    //Kullanici giris yaparken bilgilerini kontrol etmek icin bir fonksiyon olusturuyorum. 
    public static Person Login(String email, String password_user) {

        Person person = null;
        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM proje_company_db.tbl_personel_info WHERE email='" + email + "' AND password='" + password_user + "';";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                person = new Person();
                person.id = rs.getInt("id");
                person.name_surname = rs.getString("name_surname");
                person.email = rs.getString("email");
                person.password = rs.getString("password");
                person.position = rs.getString("position");

            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return person;

    }

    public static Staff StaffLogin(String email, String password_user) {

        Staff staff = null;
        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM proje_company_db.tbl_personel_company_info WHERE email='" + email + "' AND password='" + password_user + "';";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                staff = new Staff();
                staff.id = rs.getInt("id");
                staff.name_surname = rs.getString("name_surname");
                staff.email = rs.getString("email");
                staff.password = rs.getString("password");
                staff.address = rs.getString("address");
                staff.position = rs.getString("position");
                staff.salary = rs.getDouble("Salary");

            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return staff;

    }

    // Kullanicinin emaili ya da mailini database'den aramak icin fonksiyon yazdim. 
    public static ArrayList<Staff> SearchByNameOrEmail(String search) {
        ArrayList<Staff> plist = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM proje_company_db.tbl_personel_company_info WHERE name_surname LIKE '%" + search + "%' OR email LIKE '%" + search + "%' OR address LIKE '%" + search + "%' OR gender LIKE '%" + search + "%' OR position LIKE '%" + search + "%' OR salary LIKE '%" + search + "%'";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Staff np1 = new Staff();
                np1.id = rs.getInt("id");
                np1.name_surname = rs.getString("name_surname");
                np1.email = rs.getString("email");
                np1.password = rs.getString("password");
                np1.position = rs.getString("position");
                np1.address = rs.getString("address");
                np1.gender = rs.getString("gender");
                np1.salary = rs.getDouble("salary");

                plist.add(np1);
            }
            // Yorum: Veritabanından alınan her bir satır için bir Staff nesnesi oluşturulur ve bu nesnenin alanları veritabanındaki değerlerle doldurulur.
            //Daha sonra oluşturulan Staff nesnesi, bir ArrayList olan 'plist' listesine eklenir.
            //Bu döngü, tüm veritabanı sonuçlarını dolaşarak Staff nesnelerini plist listesine ekler.

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plist;

    }

    public static ArrayList<Staff> SearchByNameOrEmailStaffEdit(String search) {
        ArrayList<Staff> plist = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM proje_company_db.tbl_personel_company_info WHERE name_surname = '" + search + "' OR email = '" + search + "'";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Staff np1 = new Staff();
                np1.id = rs.getInt("id");
                np1.name_surname = rs.getString("name_surname");
                np1.email = rs.getString("email");
                np1.password = rs.getString("password");
                np1.position = rs.getString("position");
                np1.address = rs.getString("address");
                np1.gender = rs.getString("gender");
                np1.salary = rs.getDouble("salary");

                plist.add(np1);
            }
            // Yorum: Veritabanından alınan her bir satır için bir Staff nesnesi oluşturulur ve bu nesnenin alanları veritabanındaki değerlerle doldurulur.
            //Daha sonra oluşturulan Staff nesnesi, bir ArrayList olan 'plist' listesine eklenir.
            //Bu döngü, tüm veritabanı sonuçlarını dolaşarak Staff nesnelerini plist listesine ekler.

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plist;

    }

    public static ArrayList<Candidate> SearchCandidate(String search) {
        ArrayList<Candidate> clist = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM  proje_company_db.tbl_personel_candidate WHERE name_surname LIKE '%" + search + "%' OR email LIKE '%" + search + "%'";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Candidate cand = new Candidate();
                cand.id = rs.getInt("id");
                cand.name_surname = rs.getString("name_surname");
                cand.email = rs.getString("email");
                cand.address = rs.getString("address");
                cand.expectations = rs.getString("expectation");
                cand.experience = rs.getString("experience");
                cand.gender = rs.getString("gender");

                clist.add(cand);
            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clist;

    }

    public static ArrayList<Person> SearchPerson(String search) {
        ArrayList<Person> plist = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM proje_company_db.tbl_personel_info WHERE name_surname LIKE '%" + search + "%' OR email LIKE '%" + search + "%'";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Person np1 = new Person();
                np1.id = rs.getInt("id");
                np1.name_surname = rs.getString("name_surname");
                np1.email = rs.getString("email");
                np1.password = rs.getString("password");
                np1.position = rs.getString("position");
                np1.address = rs.getString("address");
                np1.gender = rs.getString("gender");
                //np1.salary = rs.getDouble("salary");

                plist.add(np1);
            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plist;

    }

    public static boolean transferData1() throws SQLException {
        Connection sourceConn = null;
        Connection targetConn = null;
        Statement sourceStmt = null;
        Statement targetStmt = null;
        ResultSet resultSet = null;

        try {
            // Kaynak veritabanına bağlanma
            sourceConn = DriverManager.getConnection(dbUrl, userName, password);
            sourceStmt = sourceConn.createStatement();

            // Kaynak tablodaki kişileri seçme
            String selectQuery = "SELECT * FROM proje_company_db.tbl_personel_info";
            resultSet = sourceStmt.executeQuery(selectQuery);

            // Hedef veritabanına bağlanma
            targetConn = DriverManager.getConnection(dbUrl, userName, password);
            targetStmt = targetConn.createStatement();

            // Hedef tabloya verileri ekleme veya güncelleme
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nameSurname = resultSet.getString("name_surname");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String address = resultSet.getString("address");
                String gender = resultSet.getString("gender");
                String position = resultSet.getString("position");

                // Hedef tabloda aynı anahtar değeriyle mevcut bir kayıt var mı kontrol etme
                String checkQuery = "SELECT COUNT(*) AS count FROM proje_company_db.tbl_personel_company_info WHERE id = " + id;
                ResultSet checkResult = targetStmt.executeQuery(checkQuery);
                checkResult.next();
                int count = checkResult.getInt("count");

                if (count > 0) {
                    // Mevcut kayıt varsa güncelleme işlemi yapma
                    String updateQuery = "UPDATE proje_company_db.tbl_personel_company_info SET name_surname = '" + nameSurname + "', email = '" + email + "', password = '" + password + "', address = '" + address + "', gender = '" + gender + "', position = '" + position + "' WHERE id = " + id;
                    targetStmt.executeUpdate(updateQuery);
                } else {
                    // Mevcut kayıt yoksa yeni kayıt ekleme
                    String insertQuery = "INSERT INTO proje_company_db.tbl_personel_company_info (id, name_surname, email, password, address, gender, position) VALUES (" + id + ", '" + nameSurname + "', '" + email + "', '" + password + "', '" + address + "', '" + gender + "', '" + position + "')";
                    targetStmt.executeUpdate(insertQuery);
                }
            }

            System.out.println("Veriler başarıyla aktarıldı!");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            // Kaynakları serbest bırakma

            if (resultSet != null) {
                resultSet.close();
            }
            if (sourceStmt != null) {
                sourceStmt.close();
            }

        }
    }

    public static ArrayList<Candidate> GetCandidates() {

        ArrayList<Candidate> candidates = null;

        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM proje_company_db.tbl_personel_candidate;";
            ResultSet rs = stmt.executeQuery(query);
            candidates = new ArrayList<>();

            while (rs.next()) {
                Candidate cand = new Candidate();
                cand.id = rs.getInt("id");
                cand.name_surname = rs.getString("name_surname");
                cand.email = rs.getString("email");
                cand.address = rs.getString("address");
                cand.expectations = rs.getString("expectation");
                cand.experience = rs.getString("experience");
                cand.gender = rs.getString("gender");

                candidates.add(cand);

            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return candidates;

    }

    public static ArrayList<Staff> GetStaff() {

        ArrayList<Staff> stf = null;

        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM proje_company_db.tbl_personel_company_info;";
            ResultSet rs = stmt.executeQuery(query);
            stf = new ArrayList<>();

            while (rs.next()) {
                Staff stfss = new Staff();
                stfss.id = rs.getInt("id");
                stfss.name_surname = rs.getString("name_surname");
                stfss.email = rs.getString("email");
                stfss.address = rs.getString("address");
                stfss.gender = rs.getString("gender");
                stfss.position = rs.getString("position");
                stfss.salary = rs.getDouble("salary");

                stf.add(stfss);

            }
            conn.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return stf;

    }

    public static Candidate SearchPersonById(int id) {

        Candidate candidates = null;
        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM proje_company_db.tbl_personel_candidate WHERE id=" + id + ";";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                candidates = new Candidate();
                candidates.id = rs.getInt("id");
                candidates.name_surname = rs.getString("name_surname");
                candidates.email = rs.getString("email");
                candidates.address = rs.getString("address");
                candidates.expectations = rs.getString("expectation");
                candidates.experience = rs.getString("experience");
                candidates.gender = rs.getString("gender");

            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return candidates;

    }

    public static Staff SearchStaffById(int id) {

        Staff stf = null;
        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM proje_company_db.tbl_personel_company_info WHERE id=" + id + ";";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                stf = new Staff();
                stf.id = rs.getInt("id");
                stf.name_surname = rs.getString("name_surname");
                stf.email = rs.getString("email");
                stf.password = rs.getString("password");
                stf.address = rs.getString("address");
                stf.gender = rs.getString("gender");
                stf.position = rs.getString("position");
                stf.salary = rs.getDouble("salary");

            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stf;

    }

    public static boolean isEmailExists(String email) {
        String query = "SELECT COUNT(*) FROM proje_company_db.tbl_personel_info WHERE email = ?";

        try (Connection conn = DriverManager.getConnection(dbUrl, userName, password); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);

            try (ResultSet rs = stmt.executeQuery()) {
                rs.next();
                int count = rs.getInt(1);
                return count > 0;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return false;
    }

    public static boolean DeleteCandidate(int id_candidate, String name_surname, String email) {
        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            String query = "DELETE FROM proje_company_db.tbl_personel_candidate WHERE id = ? AND name_surname = ? AND email = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id_candidate);
            stmt.setString(2, name_surname);
            stmt.setString(3, email);
            stmt.executeUpdate();
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static boolean DeleteStaff(int id_staff, String name_surname, String email) {
        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            String query = "DELETE FROM proje_company_db.tbl_personel_company_info WHERE id = ? AND name_surname = ? AND email = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id_staff);
            stmt.setString(2, name_surname);
            stmt.setString(3, email);
            stmt.executeUpdate();
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static boolean UpdateStaff(Staff np1) {

        try {
            Connection conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement stmt = conn.createStatement();
            String query = "UPDATE tbl_personel_company_info SET "
                    + "name_surname='" + np1.name_surname
                    + "', email='" + np1.email
                    + "', password='" + np1.password
                    + "', address='" + np1.address
                    + "', gender='" + np1.gender
                    + "', position='" + np1.position
                    + "', salary=" + np1.salary
                    + " WHERE id=" + np1.id + ";";

            stmt.executeUpdate(query);
            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
