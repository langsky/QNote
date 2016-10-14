package com.ican.hgl.qnote.rx;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * Created by hgl on 16-10-13.
 * app事件总线
 */

// TODO: 16-10-13 学习如何使用RxJava来建立时间总线
public class RxBus {

    //单例模式。使用私有静态内部类实现
    private RxBus() {
    }

    private static class RxBusHandler {
        private static RxBus instance = new RxBus();
    }

    public static RxBus getInstance() {
        return RxBusHandler.instance;
    }

    private final Subject<Object, Object> subjectBus = new SerializedSubject<>(PublishSubject.create());

    public void send(Object event) {
        subjectBus.onNext(event);
    }

    public Observable<Object> toObservable() {
        return subjectBus;
    }

    public boolean hasObservers() {
        return subjectBus.hasObservers();
    }


}
