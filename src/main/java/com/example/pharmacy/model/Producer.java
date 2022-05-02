package com.example.pharmacy.model;

import javax.persistence.*;

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

    public Producer() {

    }

    public Producer(int idProducer, String producerName, String phoneNumber, String email, String pharmaceuticGroup, int categoryID) {
        this.idProducer = idProducer;
        this.producerName = producerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pharmaceuticGroup = pharmaceuticGroup;
        this.categoryID = categoryID;
    }

    public Producer(String producerName, String phoneNumber, String email, String pharmaceuticGroup, int categoryID) {
        this.producerName = producerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pharmaceuticGroup = pharmaceuticGroup;
        this.categoryID = categoryID;
    }

    public long getIdProducer() {
        return idProducer;
    }

    public void setIdProducer(int idProducer) {
        this.idProducer = idProducer;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPharmaceuticGroup() {
        return pharmaceuticGroup;
    }

    public void setPharmaceuticGroup(String pharmaceuticGroup) {
        this.pharmaceuticGroup = pharmaceuticGroup;
    }

    public int getCategoryID() {
        return categoryID;
    }

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
