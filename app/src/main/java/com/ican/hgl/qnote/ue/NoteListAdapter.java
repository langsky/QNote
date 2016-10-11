package com.ican.hgl.qnote.ue;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hgl on 16-10-11.
 * NoteAdapter做为所有Note的列表显示的RecycleView的Adapter
 */

public class NoteListAdapter extends RecyclerView.Adapter<NoteListAdapter.NoteViewHolder> {
    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(NoteViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class NoteViewHolder extends RecyclerView.ViewHolder {
        public NoteViewHolder(View itemView) {
            super(itemView);
        }
    }
}
