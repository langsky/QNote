package com.ican.hgl.qnote.rx;

/**
 * Created by hgl on 16-10-13.
 * Rx Event, App消息处理总线的事件类
 */

public class RxEvent {
    /*定义可能发生的事件类型*/
    public static final int TYPE_FINISH_ACTIVITY = 1; //结束activity的事件
    public static final int TYPE_REFRESH_DATA = 2; //刷新数据


    public int type;
    public Object[] data;

    public RxEvent(int type, Object... objects) {
        this.type = type;
        this.data = objects;
    }

    public boolean isTypeOf(int type){
        return this.type == type;
    }

    public boolean hasData(int type){
        return isTypeOf(type)&&data.length>0;
    }

}
