package com.example.notesonspring.entity;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "note")
public class Note implements Comparable<Note> {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "text")
    @NotBlank(message = "Не может быть пустой")
    @Size(max = 80, message = "Превышен лимит в 80 символов")
    private String text;

    @Column(name = "last_date")
    private LocalDateTime lastDate;

    @Column(name = "favourites")
    private Boolean favourites;

    @Override
    public int compareTo(Note otherNote) {
        if(getLastDate() == null || otherNote.getLastDate() == null) {
            return -1;
        }
        return otherNote.getLastDate().compareTo(getLastDate());
    }
}
