package com.example.pharmacy.repository;

import java.util.List;

/**
 * The interface Repository.
 */
public interface Repository {
    /**
     * Add element.
     *
     * @param o the o
     */
    void addElement(Object o);

    /**
     * Delete element.
     *
     * @param o the o
     */
    void deleteElement(Object o);

    /**
     * Update element.
     *
     * @param o the o
     */
    void updateElement(Long id, Object o);

    /**
     * Gets all elements.
     *
     * @return the all elements
     */
    List<Object> getAllElements();

    /**
     * Find by name object.
     *
     * @param name the name
     * @return the object
     */
    Object findByName(String name);

    /**
     * Find by id object.
     *
     * @param id the id
     * @return the object
     */
    Object findById(Long id);
}
