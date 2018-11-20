package com.avd.avdcore.presentation.base

abstract class BasePresenter<T> : Presenter<T> {

    protected var view: T? = null

    override fun attachView(view: T) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }
}