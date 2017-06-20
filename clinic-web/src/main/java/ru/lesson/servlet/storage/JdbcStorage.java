package ru.lesson.servlet.storage;

import ru.lesson.lessons.User;
import ru.lesson.servlet.service.Settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Rihn Kornak on 15.06.2017.
 */
public class JdbcStorage implements Storage {
    private final Connection connection;

    public JdbcStorage(){
        final Settings settings = Settings.getInstance();
        try {
            this.connection = DriverManager.getConnection(settings.value("jdbc.url"), settings.value("jdbc.username"), settings.value("jdbc.password"));
        }catch (SQLException e){
            throw new IllegalStateException(e);
        }
    }

    @Override
    public Collection<User> values() {
        return null;
    }

    @Override
    public int add(User user) {
        return 0;
    }

    @Override
    public void edit(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User findByLogin(String login) {
        return null;
    }

    @Override
    public int generateId() {
        return 0;
    }

    @Override
    public void close() {
try {
    this.connection.close();
} catch (SQLException e) {
    e.printStackTrace();
}
    }
}
