package ru.lesson.servlet.storage;

import ru.lesson.lessons.User;

import java.util.Collection;

/**
 * Created by Rihn Kornak on 15.06.2017.
 */
public interface Storage {

    public Collection<User> values();

    public int add(final User user);

    public void edit(final User user);

    public void delete(final int id);

    public User get(final int id);

    public User findByLogin(final String login) ;

    public int generateId();

    public void close();
}