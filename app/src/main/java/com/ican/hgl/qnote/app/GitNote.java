package com.ican.hgl.qnote.app;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.ican.hgl.qnote.entity.DaoMaster;
import com.ican.hgl.qnote.entity.DaoSession;

/**
 * Created by hgl on 16-10-12.
 * 在这个类中，定义常用的全局变量，建立数据库与greenDao的关联。
 */

public class GitNote extends Application {

    private static GitNote instance;
    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Context Instance() {
        return instance;
    }

    public static DaoSession getDaoSession() {
        if (daoSession == null)
            initDaoSession();
        return daoSession;
    }

    private static void initDaoSession() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(instance, "note.db", null);
        SQLiteDatabase database = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(database);
        daoSession = daoMaster.newSession();
    }


}
