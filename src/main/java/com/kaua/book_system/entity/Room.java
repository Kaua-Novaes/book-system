package com.kaua.book_system.entity;

import com.kaua.book_system.enums.Disponibility;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Disponibility disponibility;

    @NotNull
    private String description;

    @NotNull
    private int capacityMax;

    @NotNull
    private LocalDateTime hourOpen;

    @NotNull
    private LocalDateTime hourClose;

}
