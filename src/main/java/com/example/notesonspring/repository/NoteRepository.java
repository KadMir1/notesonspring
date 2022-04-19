package com.example.notesonspring.repository;

import java.util.List;

import com.example.notesonspring.entity.Note;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {

    public List<Note> getNoteByImportantTrue();
}