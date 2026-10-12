package io.github.iiihhh40.cpsolutionapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="Problem")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Problem {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=true)
    private String title;

    @Column(nullable=false)
    private Integer difficulty;

    @Column(nullable=false)
    private String url;

    @Column(nullable=false)
    private String memo;

    @Column(nullable=true)
    private LocalDate createAt;


}