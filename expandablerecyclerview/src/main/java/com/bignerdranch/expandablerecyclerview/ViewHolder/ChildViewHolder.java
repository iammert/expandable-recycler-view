package com.bignerdranch.expandablerecyclerview.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * {@link android.support.v7.widget.RecyclerView.ViewHolder} for a child list
 * item.
 * <p>
 * The user should extend this class and implement as they wish for their
 * child list item.
 *
 * @author Ryan Brooks
 * @version 1.0
 * @since 5/27/2015
 */
public class ChildViewHolder extends RecyclerView.ViewHolder {

    /**
     * Default constructor.
     *
     * @param itemView The {@link View} being hosted in this {@link android.support.v7.widget.RecyclerView.ViewHolder}
     */
    public ChildViewHolder(View itemView) {
        super(itemView);
    }
}