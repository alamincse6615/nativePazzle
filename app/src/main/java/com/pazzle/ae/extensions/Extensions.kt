package com.pazzle.ae.extensions

import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

import com.google.android.material.snackbar.Snackbar
import com.pazzle.ae.R

fun View.onClick(action: (View) -> Unit) {
    setOnClickListener {
        if (it != null) action(it)
    }
}

fun AppCompatActivity.toastShow(message: String) =
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()


fun Fragment.snackErrorMessage(message: String) =
    Snackbar.make(requireView(), message, Snackbar.LENGTH_LONG).apply {
        setBackgroundTint(
            ContextCompat.getColor(
                requireContext(),
                R.color.color_switch_off
            )
        )
        setTextColor(ContextCompat.getColor(requireContext(), R.color.color_snack_bar))
        show()
    }

fun AppCompatActivity.visible(): Int {
    return View.VISIBLE
}

fun AppCompatActivity.invisible(): Int {
    return View.INVISIBLE

}

fun AppCompatActivity.gone(): Int {
    return View.GONE
}