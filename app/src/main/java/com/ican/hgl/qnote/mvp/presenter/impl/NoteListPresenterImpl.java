package com.ican.hgl.qnote.mvp.presenter.impl;

import android.database.Cursor;
import android.icu.util.ULocale;

import com.ican.hgl.qnote.entity.QCategory;
import com.ican.hgl.qnote.mvp.model.FileModel;
import com.ican.hgl.qnote.mvp.model.NoteModel;
import com.ican.hgl.qnote.mvp.presenter.NoteListPresenter;
import com.ican.hgl.qnote.mvp.view.NoteListView;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by hgl on 16-10-7.
 */

public class NoteListPresenterImpl implements NoteListPresenter {

    private FileModel fileModel;
    private NoteModel noteModel;
    private NoteListView noteListView;

    //test
    QCategory category;

    @Override
    public void updateNoteList() {

    }

    @Override
    public void addCategory() {
        Observable.just(category).subscribeOn(Schedulers.io()).subscribe(new Subscriber<QCategory>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(QCategory qCategory) {

            }
        });
        Observable.
    }

    @Override
    public void delCategory() {

    }

    @Override
    public void addLabel() {

    }

    @Override
    public void delLabel() {

    }

    @Override
    public void addStar() {

    }

    @Override
    public void delStar() {

    }

    @Override
    public void importFile() {

    }

    @Override
    public void exportFile() {

    }

    @Override
    public void deleteNote() {

    }

    @Override
    public void updateNote() {

    }

    @Override
    public void createNote() {

    }

    @Override
    public void selectNote() {

    }
}
