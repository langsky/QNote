package com.ican.hgl.qnote.mvp.presenter;

import android.database.Cursor;

/**
 * Created by hgl on 16-10-7.
 */

public interface QNListPresenter extends IPresenter {
    Cursor getNoteList();
}
