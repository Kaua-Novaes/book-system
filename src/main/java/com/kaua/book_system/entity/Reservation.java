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
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @NotNull
    private LocalDateTime hourStart;

    @NotNull
    private LocalDateTime hourEnd;

    @NotNull
    private LocalDateTime execTime;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Disponibility status;


}
