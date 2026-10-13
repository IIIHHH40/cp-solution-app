package io.github.iiihhh40.cpsolutionapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="Submission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Submission {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=true)
    private Long problemId;

    @Column(nullable=true)
    private String language;

    @Column(nullable=true)
    private String code;

    @Column(nullable = false)
    private String memo;

    //instant vs localDate
    @Column(nullable=true)
    private LocalDate createAt;

    @Column(nullable = true)
    private LocalDate updatedAt;


}