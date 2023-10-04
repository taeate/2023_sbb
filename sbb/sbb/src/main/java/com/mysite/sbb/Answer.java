package com.mysite.sbb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    private Integer id;
    private String content;

    private LocalDateTime createDate;
    @ManyToOne
    private Question question;
}
