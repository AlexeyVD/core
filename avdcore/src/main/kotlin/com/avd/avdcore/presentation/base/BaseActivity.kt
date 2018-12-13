package com.avd.avdcore.presentation.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
    }

    abstract fun getLayoutId(): Int

    protected fun setFragment(containerId : Int, fragment : Fragment, tag : String?) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(containerId, fragment, tag)
        fragmentTransaction.commit()
    }
}