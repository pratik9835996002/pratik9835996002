package com.jdc.main;
public interface UserDAO {

    void addUser(User user);
    void removeUser(int id);
    User getUserById(int id);
    void UpdateUser(User user);

}
