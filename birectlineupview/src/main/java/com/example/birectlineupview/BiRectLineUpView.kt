package com.example.birectlineupview

import android.view.View
import android.view.MotionEvent
import android.content.Context
import android.app.Activity
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF

val colors : Array<Int> = arrayOf(
    "#1abc9c",
    "#3498db",
    "#e74c3c",
    "#8e44ad",
    "#f1c40f"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 3
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val lineSizeFactor : Float = 7.8f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
