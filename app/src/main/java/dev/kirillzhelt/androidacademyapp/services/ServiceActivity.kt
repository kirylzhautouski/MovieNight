package dev.kirillzhelt.androidacademyapp.services

import android.app.Service
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import dev.kirillzhelt.androidacademyapp.R

class ServiceActivity : AppCompatActivity() {

    private lateinit var progressTextView: TextView
    private lateinit var startIntentService: Button
    private lateinit var startService: Button

    private var backgroundProgressReceiver: BackgroundProgressReceiver? = null

    private var runningServiceClass: Class<out Service>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        progressTextView = findViewById(R.id.activity_service_progress_tv)

        startIntentService = findViewById(R.id.activity_service_start_intent_service_btn)
        startIntentService.setOnClickListener {
            if (runningServiceClass == null) {
                Intent(this, HardJobIntentService::class.java).also { intent ->
                    startService(intent)
                }

                runningServiceClass = HardJobIntentService::class.java
            }
        }

        startService = findViewById(R.id.activity_service_start_service_btn)
        startService.setOnClickListener {
            if (runningServiceClass == null) {
                Intent(this, HardJobService::class.java).also { intent ->
                    startService(intent)
                }

                runningServiceClass = HardJobService::class.java
            }
        }
    }

    override fun onResume() {
        super.onResume()

        subscribeForProgressUpdates()
    }

    override fun onPause() {
        if (backgroundProgressReceiver != null) {
            LocalBroadcastManager.getInstance(applicationContext)
                .unregisterReceiver(backgroundProgressReceiver!!)
        }

        runningServiceClass = null

        super.onPause()
    }

    private fun subscribeForProgressUpdates() {
        if (backgroundProgressReceiver == null) {
            backgroundProgressReceiver = BackgroundProgressReceiver { progress ->
                progressTextView.text = progress.toString()

                if (progress == 100) {
                    Intent(this, runningServiceClass).also { intent ->
                        stopService(intent)
                    }

                    runningServiceClass = null
                }
            }
        }

        val progressUpdateActionFilter = IntentFilter(BackgroundProgressReceiver.PROGRESS_UPDATE_ACTION)

        LocalBroadcastManager.getInstance(applicationContext).registerReceiver(backgroundProgressReceiver!!,
            progressUpdateActionFilter)
    }
}
