package com.avd.avdcore.presentation.base

interface Presenter<T> {
    fun attachView(view: T)
    fun detachView()
}