package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

/**
Created by ibrar on 24/08/2022
 */
class ToasterMessage {
    companion object {
        fun showToastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}