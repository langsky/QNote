package com.ican.hgl.qnote.mvp.presenter;

import android.database.Cursor;

import com.ican.hgl.qnote.mvp.act.MVP;

/**
 * Created by hgl on 16-10-7.
 */

public interface NoteListPresenter extends MVP.BasePresenter {
    void updateNoteList();
}
