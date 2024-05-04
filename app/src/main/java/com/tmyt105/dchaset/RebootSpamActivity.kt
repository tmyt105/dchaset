package com.tmyt105.dchaset

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings


class RebootSpamActivity : BroadcastReceiver() {


    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    override fun onReceive(context: Context?, intent: Intent?) {
        val contentResolver = context!!.contentResolver

            Thread.sleep(20000)
            Settings.Global.putInt(contentResolver ,Settings.Global.ADB_ENABLED, 1)


    }
}
