package com.example.notesonspring.service;

import java.util.List;

import com.example.notesonspring.dao.NoteDAO;
import com.example.notesonspring.entity.Note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteDAO noteDAO;

    @Override
    @Transactional
    public Note findById(Long id) {
        return noteDAO.findById(id);
    }

    @Override
    public List<Note> findAll() {
        return noteDAO.findAll();
    }

    @Override
    public List<Note> findFavouritesNotes() {
        return noteDAO.findFavouritesNotes();
    }

    @Override
    public void saveNote(Note note) {
        noteDAO.saveNote(note);
        
    }

    @Override
    public void deleteById(Long id) {
        noteDAO.deleteById(id);
        
    }  
}
