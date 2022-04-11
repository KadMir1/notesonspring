package com.example.notesonspring.dao;

import java.util.List;

import com.example.notesonspring.entity.Note;

public interface NoteDAO {
    
    public Note findById(Long id);

    public List<Note> findAll();

    public List<Note> findFavouritesNotes();

    public void saveNote(Note note);

    public void deleteById(Long id);
}
