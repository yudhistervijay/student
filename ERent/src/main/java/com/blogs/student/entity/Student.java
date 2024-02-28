package com.blogs.student.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Getter
@Setter
@DynamicUpdate
@NoArgsConstructor
@DynamicInsert
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="roll_id")
    private Integer rollId;
    @Column(name="student_name")
    private String name;
    private String address;
    private String branch;
    private Float fee;

}
