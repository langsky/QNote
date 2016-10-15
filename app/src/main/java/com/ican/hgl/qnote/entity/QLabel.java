package com.ican.hgl.qnote.entity;

import com.ican.hgl.qnote.entity.DaoSession;
import com.ican.hgl.qnote.entity.QLabelDao;
import com.ican.hgl.qnote.entity.QNoteDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;



/**
 * Created by hgl on 16-10-7.
 */

@Entity(nameInDb = "LABEL")
public class QLabel {
    @Id(autoincrement = true)
    @Property(nameInDb = "_id")
    private long id;

    @Property(nameInDb = "title")
    @NotNull
    private String title;

    @Property(nameInDb = "color")
    private int colorId;

    @Property(nameInDb = "notes")
    @ToMany
    @JoinEntity(entity = QNoteJoinQLabel.class, sourceProperty = "labelId", targetProperty = "noteId")
    private List<QNote> noteList;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1634883792)
    private transient QLabelDao myDao;

    @Generated(hash = 2034519521)
    public QLabel(long id, @NotNull String title, int colorId) {
        this.id = id;
        this.title = title;
        this.colorId = colorId;
    }

    @Generated(hash = 1080010524)
    public QLabel() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getColorId() {
        return this.colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1681070350)
    public List<QNote> getNoteList() {
        if (noteList == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            QNoteDao targetDao = daoSession.getQNoteDao();
            List<QNote> noteListNew = targetDao._queryQLabel_NoteList(id);
            synchronized (this) {
                if (noteList == null) {
                    noteList = noteListNew;
                }
            }
        }
        return noteList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 2100931397)
    public synchronized void resetNoteList() {
        noteList = null;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1067167331)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getQLabelDao() : null;
    }

}