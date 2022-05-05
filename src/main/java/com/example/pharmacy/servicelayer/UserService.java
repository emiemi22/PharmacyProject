//package com.example.pharmacy.servicelayer;
//import com.example.pharmacy.model.Producer;
//import com.example.pharmacy.repository.Repository;
//import com.example.pharmacy.repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService {
//    private final Repository userRepository;
//
//    @Autowired
//    public UserService(UserRepo userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public List<Object> getUsers(){
//        return userRepository.getAllElements();
//    }
//
//    public boolean producerValidation(Producer producer) {
//        //User p = (Producer) userRepository.findByName(producer.getProducerName());
////        if (p == null) {
////            return true;
////        } else {
////            return false;
////        }
//        return false;
//    }
//
//    public void addNewProducer(Producer producer) {
//        if(producerValidation(producer)){
//            userRepository.addElement(producer);
//        }
//        else{
//            throw new IllegalStateException("product already in DB");
//        }
//    }
//}
