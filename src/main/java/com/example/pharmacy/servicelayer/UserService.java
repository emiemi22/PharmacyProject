package com.example.pharmacy.servicelayer;
import com.example.pharmacy.model.Users.BasicUser;
import com.example.pharmacy.model.Users.RequestUser;
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


    public void addNewUser(RequestUser user) {
        userRepository.addElement(user);
    }

    public void deleteUser(Long id){
        RequestUser requestUser = (RequestUser) userRepository.findById(id);
        if(requestUser == null){
            throw new IllegalStateException("User not in db");
        }
        else{
            userRepository.deleteElement(requestUser);
        }

    }
}
