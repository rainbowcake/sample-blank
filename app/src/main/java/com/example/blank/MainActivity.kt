package com.example.blank

import android.os.Bundle
import co.zsmb.rainbowcake.navigation.SimpleNavActivity
import com.example.blank.ui.blank.BlankFragment

class MainActivity : SimpleNavActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            navigator.add(BlankFragment())
        }
    }

}
