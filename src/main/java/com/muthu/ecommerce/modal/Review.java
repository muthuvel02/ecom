package com.muthu.ecommerce.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false)
    private String reviewText;

    @Column(nullable = false)
    private double rating;

    @ElementCollection
    private List<String> productImages; // the user can upload product which they bought

    @JsonIgnore
    @ManyToOne
    private Product product; //one product has multiple review;

    @JsonIgnore
    @ManyToOne
    private User user; //one user has multiple review;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}
