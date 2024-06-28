package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class OwnBroadCaster:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action == "TEST_ACTION"){
            Toast.makeText(context,"Broadcast received", Toast.LENGTH_SHORT).show()
        }
    }
}