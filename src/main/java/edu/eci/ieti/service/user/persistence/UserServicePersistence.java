package edu.eci.ieti.service.user.persistence;

import edu.eci.ieti.repository.user.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class UserServicePersistence {
    private static HashMap<String, User> users;

    public void save(User user) {
        users.put(user.getId(),user);
    }

    public User findById(String id) {
        return users.get(id);
    }

    public List<User> all(){
        return new ArrayList<>(users.values());
    }

    public void deleteById(String id) {
        users.remove(id);
    }

    public User update(User user, String userId) {
        users.remove(userId);
        users.put(userId,user);
        return user;
    }
}
