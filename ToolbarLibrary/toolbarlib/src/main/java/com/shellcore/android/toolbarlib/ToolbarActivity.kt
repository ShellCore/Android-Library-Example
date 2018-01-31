package com.shellcore.android.toolbarlib

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.shellcore.android.toolbarlib.interfaces.ToolbarInterface

/**
 * Created by MOGC on 31/01/2018.
 */
open class ToolbarActivity: AppCompatActivity(), ToolbarInterface {

    private var _toolbar: Toolbar? = null

    override fun toolbarToLoad(toolbar: Toolbar?) {
        _toolbar = toolbar
        _toolbar?.let { setSupportActionBar(_toolbar) }
    }

    override fun enableHomeDisplay(value: Boolean) {
        supportActionBar?.setDisplayHomeAsUpEnabled(value)
    }
}