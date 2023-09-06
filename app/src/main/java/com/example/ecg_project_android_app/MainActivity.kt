package com.example.ecg_project_android_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.ecg_project_android_app.databinding.ActivityMainBinding
import com.example.ecg_project_android_app.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.mainHolder, MainFragment.newInstance())
            .commit()
    }
}