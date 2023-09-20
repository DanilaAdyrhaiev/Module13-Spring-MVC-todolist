package com.goit.Module13.Services;


import com.goit.Module13.entities.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {
    private List<Note> noteList = new ArrayList<>();
    private long nextId = 1;

    public List<Note> listAll() {
        return new ArrayList<>(noteList);
    }

    public Note add(Note note) {
        note.setId(nextId);
        nextId++;
        noteList.add(note);
        return note;
    }

    public void deleteById(long id) {
        Note noteToRemove = null;
        for (Note note : noteList) {
            if (note.getId() == id) {
                noteToRemove = note;
                break;
            }
        }
        if (noteToRemove != null) {
            noteList.remove(noteToRemove);
        } else {
            throw new IllegalArgumentException("Note with id " + id + " not found");
        }
    }

    public void update(Note note) {
        long id = note.getId();
        for (int i = 0; i < noteList.size(); i++) {
            if (noteList.get(i).getId() == id) {
                noteList.set(i, note);
                return;
            }
        }
        throw new IllegalArgumentException("Note with id " + id + " not found");
    }

    public Note getById(long id) {
        for (Note note : noteList) {
            if (note.getId() == id) {
                return note;
            }
        }
        throw new IllegalArgumentException("Note with id " + id + " not found");
    }



}
