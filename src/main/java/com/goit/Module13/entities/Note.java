package com.goit.Module13.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Note {
    long id;
    String title;
    String content;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
