package io.github.iiihhh40.cpsolutionapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Table(name="tag")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tag{
    // To do-@Id アノテーションでのimportがjakartaなのかspring dataなのか確認する
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=true)
    private String name;

    @Column(nullable=true)
    private LocalDateTime createdAt;


}

