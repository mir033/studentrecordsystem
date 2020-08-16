/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentrecordsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amir
 */
public class StudentDao {

    private final String jdbcurl = "jdbc:mariadb://localhost/StudentRecord";
    private final String jdbcusername = "root";
    private final String jdbcpassword = "ASyafiq97@";

    private static final String INSERT_STUDENT_SQL = "INSERT INTO Student" + "  (name, matricno, currentaddr, homeaddr, email, mobilephone, homephone) VALUES "
            + " (?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_ALL=  "SELECT * FROM STUDENT";
    private static final String DELETE_STUDENT_SQL = "delete from student where matricno = ?;";
    private static final String UPDATE_STUDENT_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

    public StudentDao() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcurl, jdbcusername, jdbcpassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    public void insertUser(Student student) throws SQLException {
        System.out.println(INSERT_STUDENT_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_SQL)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getMatricno());
            preparedStatement.setString(3, student.getCurrentaddress());
            preparedStatement.setString(4, student.getHomeaddress());
            preparedStatement.setString(5, student.getEmail());
            preparedStatement.setLong(6, student.getMobileno());
            preparedStatement.setLong(7, student.getPhoneno());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    
    public List < Student > selectAllUsers() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < Student > students = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);) {
          //  System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name;
                int matricno;
                String currentaddr;
                String homeaddr;
                String email;
                Long mobileno;
                Long homeno;
                students.add(new Student());
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return students;
    }
    public boolean deleteUser(int matricno) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_STUDENT_SQL);) {
            statement.setInt(1, matricno);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    public boolean updateUser(Student student) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_STUDENT_SQL);) {
            statement.setString(1, student.getName() );
            statement.setInt(2, student.getMatricno());
            statement.setString(3, student.getCurrentaddress());
            statement.setString(4, student.getHomeaddress());
            statement.setString(5, student.getEmail());
            statement.setLong(6, student.getMobileno());
            statement.setLong(7, student.getPhoneno());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
    

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
