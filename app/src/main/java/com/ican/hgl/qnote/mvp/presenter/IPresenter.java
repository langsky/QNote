package com.ican.hgl.qnote.mvp.presenter;

import com.ican.hgl.qnote.mvp.view.IView;

/**
 * Created by hgl on 16-10-7.
 * 作为顶层presenter，负责处理和view的关系
 */

public interface IPresenter<V extends IView> {
    void attachView(V mvpView);
    void detachView();
}
