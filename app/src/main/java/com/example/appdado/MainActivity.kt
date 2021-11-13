package com.example.appdado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

/**
 * Clase principal
 * Creamos un objeto Button, un objeto Dado y un objeto ImageView
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById(R.id.button)
        val miDado = Dado(6)
        val imagenDado: ImageView = findViewById(R.id.imageView)

        //Asignamos una imagen por defecto cuando se abre la app
        imagenDado.setImageResource(R.drawable.dice_1)

        /*Cuando el boton es pulsado, llamamos al metodo lanzar del objeto Dado
        Segun el numero que devuelve el metodo lanzar, seleccionamos la imagen correspondiente
        Le damos una descripcion a la imagen con el numero generado
         */
        boton.setOnClickListener {

            //Con Toast mostramos un pequeño mensaje en la parte inferior
            //Toast.makeText(this,"Dado Lanzado",Toast.LENGTH_SHORT).show()
            val numero = miDado.lanzar()
            val imagenSeleccionada = when (numero) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            imagenDado.setImageResource(imagenSeleccionada)
            imagenDado.contentDescription = numero.toString()

        }
    }
}