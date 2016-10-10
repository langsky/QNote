package com.ican.hgl.qnote.mvp.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by hgl on 16-10-7.
 */
@Entity(nameInDb = "TITLE")
public class QText {
    @Id(autoincrement = true)
    @Property(nameInDb = "_id")
    private long id;

    @Property(nameInDb = "note_id")
    private long noteId;

    @Property(nameInDb = "content")
    private String content;

    @Generated(hash = 1132402385)
    public QText(long id, long noteId, String content) {
        this.id = id;
        this.noteId = noteId;
        this.content = content;
    }

    @Generated(hash = 712525176)
    public QText() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNoteId() {
        return this.noteId;
    }

    public void setNoteId(long noteId) {
        this.noteId = noteId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}