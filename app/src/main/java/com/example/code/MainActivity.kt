package com.example.code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


        val x1 = 4f
        val y1 = 3f

        val x2 = -3f
        val y2 = -2f


        val pendiente = (y2 - y1)/(x2 - x1)

        println("El resultado de la pendiente es $pendiente ")



}