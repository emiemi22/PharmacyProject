package com.example.pharmacy.repository;

import java.util.List;

public interface Repository {
    void addElement(Object o);
    void deleteElement(Object o);
    void updateElement(Object o);
    List<Object> getAllElements();
    Object findByName(String name);
    Object findById(Long id);
}
