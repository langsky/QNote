package com.ican.hgl.qnote.entity;



import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;



/**
 * Created by hgl on 16-10-7.
 */

@Entity(nameInDb = "NOTE", active = true)
public class QNote {
    @Id(autoincrement = true)
    @Property(nameInDb = "_id")
    private long id;

    @Property(nameInDb = "title")
    private String title;

    @Property(nameInDb = "text_id")
    private long textId;

    @ToOne(joinProperty = "textId")
    private QText text;

    @Property(nameInDb = "star")
    private boolean star;

    @Property(nameInDb = "labels")
    @ToMany
    @JoinEntity(entity = QNoteJoinQLabel.class, sourceProperty = "noteId", targetProperty = "labelId")
    private List<QLabel> labels;

    @Property(nameInDb = "images")
    @ToMany(referencedJoinProperty = "noteId")
    private List<QImage> images;

    @Property(nameInDb = "category")
    private long categoryId;

    @Property(nameInDb = "create_time")
    private long createdTime;

    @Property(nameInDb = "modify_time")
    private long modifiedTime;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 503589909)
    private transient QNoteDao myDao;

    @Generated(hash = 1827521628)
    public QNote(long id, String title, long textId, boolean star, long categoryId, long createdTime,
            long modifiedTime) {
        this.id = id;
        this.title = title;
        this.textId = textId;
        this.star = star;
        this.categoryId = categoryId;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
    }

    @Generated(hash = 338853909)
    public QNote() {
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

    public long getTextId() {
        return this.textId;
    }

    public void setTextId(long textId) {
        this.textId = textId;
    }

    public boolean getStar() {
        return this.star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public long getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(long modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Generated(hash = 418096336)
    private transient Long text__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 2087532196)
    public QText getText() {
        long __key = this.textId;
        if (text__resolvedKey == null || !text__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            QTextDao targetDao = daoSession.getQTextDao();
            QText textNew = targetDao.load(__key);
            synchronized (this) {
                text = textNew;
                text__resolvedKey = __key;
            }
        }
        return text;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 911231287)
    public void setText(@NotNull QText text) {
        if (text == null) {
            throw new DaoException(
                    "To-one property 'textId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.text = text;
            textId = text.getId();
            text__resolvedKey = textId;
        }
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1712199834)
    public List<QLabel> getLabels() {
        if (labels == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            QLabelDao targetDao = daoSession.getQLabelDao();
            List<QLabel> labelsNew = targetDao._queryQNote_Labels(id);
            synchronized (this) {
                if (labels == null) {
                    labels = labelsNew;
                }
            }
        }
        return labels;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 902294403)
    public synchronized void resetLabels() {
        labels = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 842391294)
    public List<QImage> getImages() {
        if (images == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            QImageDao targetDao = daoSession.getQImageDao();
            List<QImage> imagesNew = targetDao._queryQNote_Images(id);
            synchronized (this) {
                if (images == null) {
                    images = imagesNew;
                }
            }
        }
        return images;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 604059028)
    public synchronized void resetImages() {
        images = null;
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
    @Generated(hash = 1865007984)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getQNoteDao() : null;
    }

}