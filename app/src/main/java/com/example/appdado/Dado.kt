package com.example.appdado

/**
 * Clase Dado
 * Recibe como parametro el numero de lados que tiene el dado
 */
class Dado(val numLados: Int) {

    //Metodo lanzar, devuelve el numero generado
    fun lanzar(): Int {
        return (1..numLados).random()
    }
}