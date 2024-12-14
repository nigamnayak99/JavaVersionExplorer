package com.nigam.javaversionexplorer.java1.jdbc;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) {

        String fetchAllDataQuery = "SELECT * FROM public.employee";
        String insertQuery = "INSERT INTO public.employee (employee_id, first_name, last_name, email, phone_number, hire_date, job_title, salary, department_id, manager_id, created_at, updated_at) " +
                "VALUES (101, 'John', 'Doe', 'john.doe@example1.com', '1234567890', '2024-12-01', 'Software Engineer', 85000.00, 10, 100, now(), now())";
        String deleteQuery = "DELETE FROM public.employee where employee_id = 101";


        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "root";

        try {
//            --Deprecated from version 1.6
//            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully!!!");
            Statement statement = connection.createStatement();


            int numberOfRowsAffected = statement.executeUpdate(deleteQuery);
            if(numberOfRowsAffected > 0) System.out.println("Data Inserted Successfully, number of rows affected:" +numberOfRowsAffected);

            ResultSet resultSet = statement.executeQuery(fetchAllDataQuery);
            showData(resultSet);
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    private static void showData(ResultSet resultSet){
        try {
            while(resultSet.next()) {
                int employeeId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                String phoneNumber = resultSet.getString("phone_number");
                Date hireDate = resultSet.getDate("hire_date");
                String jobTitle = resultSet.getString("job_title");
                double salary = resultSet.getDouble("salary");
                int departmentId = resultSet.getInt("department_id");
                int managerId = resultSet.getInt("manager_id");
                Timestamp createdAt = resultSet.getTimestamp("created_at");
                Timestamp updatedAt = resultSet.getTimestamp("updated_at");

                System.out.println("Employee ID: " + employeeId);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Email: " + email);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("Hire Date: " + hireDate);
                System.out.println("Job Title: " + jobTitle);
                System.out.println("Salary: " + salary);
                System.out.println("Department ID: " + departmentId);
                System.out.println("Manager ID: " + managerId);
                System.out.println("Created At: " + createdAt);
                System.out.println("Updated At: " + updatedAt);
                System.out.println("--------------------------------------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
