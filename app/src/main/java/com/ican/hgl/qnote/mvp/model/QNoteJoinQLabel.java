package com.ican.hgl.qnote.mvp.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by hgl on 16-10-7.
 */

@Entity
public class QNoteJoinQLabel {
    @Id(autoincrement = true)
    private long id;

    private long noteId;
    private long labelId;
    @Generated(hash = 1920719824)
    public QNoteJoinQLabel(long id, long noteId, long labelId) {
        this.id = id;
        this.noteId = noteId;
        this.labelId = labelId;
    }
    @Generated(hash = 822445246)
    public QNoteJoinQLabel() {
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
    public long getLabelId() {
        return this.labelId;
    }
    public void setLabelId(long labelId) {
        this.labelId = labelId;
    }
}
