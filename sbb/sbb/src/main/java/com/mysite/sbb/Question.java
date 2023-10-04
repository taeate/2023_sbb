package com.mysite.sbb;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  데이터를 저장할 때 해당 속성에 값을 따로 세팅하지 않아도 1씩 자동으로 증가하여 저장
    private Integer id;
    @Column(length = 200)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private LocalDateTime createDate;

}
