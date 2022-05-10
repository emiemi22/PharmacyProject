package com.example.pharmacy.servicelayer;
import com.example.pharmacy.model.Users.BasicUser;
import com.example.pharmacy.repository.Repository;
import com.example.pharmacy.repository.UserRepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final Repository userRepository;

    @Autowired
    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public List<Object> getUsers(){
        return userRepository.getAllElements();
    }


    public void addNewUser(BasicUser user) {
        userRepository.addElement(user);
    }
}
