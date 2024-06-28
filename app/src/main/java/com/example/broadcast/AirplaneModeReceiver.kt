package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.widget.Toast

class AirplaneModeReceiver:BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        if(intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED){

            val isTurned = Settings.Global.getInt(
                context?.contentResolver,
                Settings.Global.AIRPLANE_MODE_ON
            )
            if(isTurned == 0){
                Toast.makeText(context,"Airplane Mode Off",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(context,"Airplane Mode On",Toast.LENGTH_SHORT).show()
            }
        }

    }
}