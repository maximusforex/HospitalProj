package com.ua.satrumroom.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
@Table(name = "doctor")
public class Doctor implements Serializable {

    private static final long serialVersionUID = 3557445443701304650L;

    @Id
    @Column(name = "doctor_id")
    private String doctor_id;

    @Column(name = "first_name")
    @Getter private String firstName;

    @Column(name = "second_name")
    @Getter private String secondName;

    @Column(name = "last_name")
    @Getter private String lastName;

    @Column(name = "specialization_id")
    @Getter private String specializationId;

    @Column(name = "post_id")
    @Getter private String postId;

//    public String getDoctor_id() {
//        return doctor_id;
//    }

//    public void setDoctor_id(String doctor_id) {
//        this.doctor_id = doctor_id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getSecondName() {
//        return secondName;
//    }
//
//    public void setSecondName(String secondName) {
//        this.secondName = secondName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getSpecializationId() {
//        return specializationId;
//    }
//
//    public void setSpecializationId(String specializationId) {
//        this.specializationId = specializationId;
//    }
//
//    public String getPostId() {
//        return postId;
//    }
//
//    public void setPostId(String postId) {
//        this.postId = postId;
//    }
}
