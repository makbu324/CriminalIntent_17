package com.bignerdranch.android.criminalintent

import android.app.AlertDialog
import android.app.Dialog
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.DialogFragment

class PictureDialog(private val photoUri: Uri): DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialogView = layoutInflater.inflate(R.layout.picture_dialog_layout, null)
        val imageView = dialogView.findViewById<ImageView>(R.id.PictureView)

        imageView.setImageURI(photoUri)

        return AlertDialog.Builder(context)
            .setView(dialogView)
            .create()
    }
}