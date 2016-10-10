package com.ican.hgl.qnote.mvp.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by hgl on 16-10-7.
 */
@Entity(nameInDb = "IMAGE")
public class QImage {

    @Id(autoincrement = true)
    private long id;

    @Property(nameInDb = "note_id")
    private long noteId;

    @Property(nameInDb = "image_uri")
    @NotNull
    private String content;

    @Property(nameInDb = "description")
    private String description;

    @Property(nameInDb = "mime_type")
    private String type;

    @Generated(hash = 1568008667)
    public QImage(long id, long noteId, @NotNull String content, String description,
            String type) {
        this.id = id;
        this.noteId = noteId;
        this.content = content;
        this.description = description;
        this.type = type;
    }

    @Generated(hash = 1626852367)
    public QImage() {
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


}