package com.developers.notify.developers.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
public class Subscription {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "subscribe_id")
    private Long subscribeId;

    @NonNull
    @Column(nullable = false, name = "user_name")
    private String userName;

    @NonNull
    @Column(nullable = false, name = "mentor_name")
    private String mentorName;

    @Builder
    public Subscription(String userName, String mentorName){
        this.userName = userName;
        this.mentorName = mentorName;
    }
}
