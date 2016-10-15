package com.ican.hgl.qnote.mvp.act;

import com.ican.hgl.qnote.mvp.model.IFileModel;
import com.ican.hgl.qnote.mvp.model.INoteModel;
import com.ican.hgl.qnote.mvp.presenter.IPresenter;
import com.ican.hgl.qnote.mvp.view.IView;

/**
 * Created by hgl on 16-10-14.
 * 规定三大模块的基本操作，这些操作依托于UI提供的改变DB的方法
 */

public interface MVP {

    interface BaseFileModel extends IFileModel {
        void setName();
    }

    interface BaseNoteModel extends INoteModel {

    }

    interface BaseView extends IView {

        void onSuccess(int flag);

        void onFailure(int errCode, String msg, int flag);

        void showProgress(int flag);

        void hideProgress(int flag);

    }

    interface BasePresenter extends IPresenter {

        void refresh(int flag);

    }
}
