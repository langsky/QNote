package com.ican.hgl.qnote.mvp.presenter;

import com.ican.hgl.qnote.mvp.act.MVP;
import com.ican.hgl.qnote.mvp.presenter.IPresenter;

/**
 * Created by hgl on 16-10-7.
 */

public interface NoteEditPresenter extends MVP.BasePresenter {
    void getNoteDetail(long id);
}
