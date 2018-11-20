package com.avd.avdcore.presentation.base

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseAdapter<T, VH : BaseViewHolder<T>> : RecyclerView.Adapter<VH>() {

    protected val elements = ArrayList<T>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {

        val itemView = LayoutInflater.from(parent.context)
                .inflate(getItemLayoutId(), parent, false)
        return getViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(elements[position])
    }

    override fun getItemCount() = elements.size

    protected abstract fun getItemLayoutId(): Int

    protected abstract fun getViewHolder(itemView: View): VH
}