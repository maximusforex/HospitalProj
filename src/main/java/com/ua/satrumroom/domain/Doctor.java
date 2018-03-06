package com.ua.satrumroom.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
@Table(name = "doctor")
public class Doctor implements Serializable {

    private static final long serialVersionUID = 3557445443701304650L;

    @Id
    @GeneratedValue
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

}
