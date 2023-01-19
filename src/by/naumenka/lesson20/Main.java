package by.naumenka.lesson20;

import java.sql.*;

//Создать таблицу с данными студентов группы.
// Создать Java приложение для получения списка всех студентов группы.
//Улучшить основное задание. Создать таблицу с городами, где живут студенты.

public class Main {
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "1111";
    public static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/homework";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        try (
                Connection connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD);
                Statement statement = connection.createStatement()
        ) {
            statement.executeUpdate("create table students (" +
                    "id int not null auto_increment," +
                    "first_name varchar(30) not null," +
                    "last_name varchar(30) not null," +
                    "gender varchar(30) not null," +
                    "primary key (id))");

            statement.executeUpdate(
                    "insert into students set " +
                            "first_name = 'Egor'," +
                            "last_name = 'Poles', " +
                            "gender = 'male'"
            );

            statement.executeUpdate(
                    "insert into students set " +
                            "first_name = 'Daria'," +
                            "last_name = 'Wesley', " +
                            "gender = 'female'"
            );

            statement.executeUpdate(
                    "insert into students set " +
                            "first_name = 'Max'," +
                            "last_name = 'Demchenko', " +
                            "gender = 'male'"
            );

            //         statement.executeUpdate("drop table cities");

            statement.executeUpdate("create table cities (" +
                    "id_cities int not null auto_increment," +
                    "cities_name varchar(30) not null," +
                    "population varchar(30) not null," +
                    "primary key (id_cities))");

            statement.executeUpdate(
                    "insert into cities set " +
                            "cities_name = 'New York'," +
                            "population = '8.5 million'"
            );

            statement.executeUpdate(
                    "insert into cities set " +
                            "cities_name = 'Minsk'," +
                            "population = '2 million'"
            );

            statement.executeUpdate(
                    "insert into cities set " +
                            "cities_name = 'Prague'," +
                            "population = '1.2 million'"
            );

            ResultSet resultSet = statement.executeQuery("select * from students");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
                System.out.println("-----------");
            }

            statement.executeUpdate("create table information_people (" +
                    "select students.id, cities.id_cities, first_name, cities_name " +
                    "from students join cities on students.id = cities.id_cities)");
        }
    }
}