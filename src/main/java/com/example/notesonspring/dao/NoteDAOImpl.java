package com.example.notesonspring.dao;

import java.util.List;

import org.hibernate.query.Query;

import com.example.notesonspring.entity.Note;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoteDAOImpl implements NoteDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Note findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Note note = session.get(Note.class, id);
        return note;
    }

    @Override
    public List<Note> findAll() {
        Session session = sessionFactory.getCurrentSession();

        Query<Note> query = session.createQuery("from Note ", Note.class);
        List<Note> allNote = query.getResultList();
        return allNote;
    }

    @Override
    public List<Note> findFavouritesNotes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void saveNote(Note note) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(note);
        
    }

    @Override
    public void deleteById(Long id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Note> query = session.createQuery("delete from Note " + "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
        
    }
}
