package com.example.notesonspring.service;

import java.util.Collections;
import java.util.List;

import com.example.notesonspring.entity.Note;
import com.example.notesonspring.repository.NoteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note findById(Long id){
        return noteRepository.getById(id);
    }

    public List<Note> findAll(){
        List<Note> result = noteRepository.findAll();
        Collections.sort(result);
        return result;
    }

    @Override
    public List<Note> findImportantNotes() {
        return noteRepository.getNoteByImportantTrue();
    }

    public void saveNote(Note note){
        noteRepository.save(note);
    }

    public void deleteById(Long id){
        noteRepository.deleteById(id);
    }
}
