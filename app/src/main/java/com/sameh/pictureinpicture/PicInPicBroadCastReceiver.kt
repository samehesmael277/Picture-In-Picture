package com.sameh.pictureinpicture

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class PicInPicBroadCastReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("MyAppTag", "on Broadcast Receive: ")
    }
}