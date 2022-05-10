package com.example.pharmacy.model;

import javax.persistence.*;

/**
 * The type Producer.
 */
@Entity
@Table
public class Producer {
    @Id
    @SequenceGenerator(
            name = "producer_seq", sequenceName = "producer_seq", allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "producer_sequence"
    )
    private long idProducer;
    private String producerName;
    private String phoneNumber;
    private String email;
    private String pharmaceuticGroup;
    private int categoryID;

    /**
     * Instantiates a new Producer.
     */
    public Producer() {

    }

    /**
     * Instantiates a new Producer.
     *
     * @param idProducer        the id producer
     * @param producerName      the producer name
     * @param phoneNumber       the phone number
     * @param email             the email
     * @param pharmaceuticGroup the pharmaceutic group
     * @param categoryID        the category id
     */
    public Producer(int idProducer, String producerName, String phoneNumber, String email, String pharmaceuticGroup, int categoryID) {
        this.idProducer = idProducer;
        this.producerName = producerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pharmaceuticGroup = pharmaceuticGroup;
        this.categoryID = categoryID;
    }

    /**
     * Instantiates a new Producer.
     *
     * @param producerName      the producer name
     * @param phoneNumber       the phone number
     * @param email             the email
     * @param pharmaceuticGroup the pharmaceutic group
     * @param categoryID        the category id
     */
    public Producer(String producerName, String phoneNumber, String email, String pharmaceuticGroup, int categoryID) {
        this.producerName = producerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pharmaceuticGroup = pharmaceuticGroup;
        this.categoryID = categoryID;
    }

    /**
     * Gets id producer.
     *
     * @return the id producer
     */
    public long getIdProducer() {
        return idProducer;
    }

    /**
     * Sets id producer.
     *
     * @param idProducer the id producer
     */
    public void setIdProducer(int idProducer) {
        this.idProducer = idProducer;
    }

    /**
     * Gets producer name.
     *
     * @return the producer name
     */
    public String getProducerName() {
        return producerName;
    }

    /**
     * Sets producer name.
     *
     * @param producerName the producer name
     */
    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number.
     *
     * @param phoneNumber the phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets pharmaceutic group.
     *
     * @return the pharmaceutic group
     */
    public String getPharmaceuticGroup() {
        return pharmaceuticGroup;
    }

    /**
     * Sets pharmaceutic group.
     *
     * @param pharmaceuticGroup the pharmaceutic group
     */
    public void setPharmaceuticGroup(String pharmaceuticGroup) {
        this.pharmaceuticGroup = pharmaceuticGroup;
    }

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public int getCategoryID() {
        return categoryID;
    }

    /**
     * Sets category id.
     *
     * @param categoryID the category id
     */
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "idProducer=" + idProducer +
                ", producerName='" + producerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", pharmaceuticGroup='" + pharmaceuticGroup + '\'' +
                ", categoryID=" + categoryID +
                '}';
    }
}
