package com.ramos.ejer02

fun main() {

    println("Nombre del estudiante:")
    val nombre = readLine()

    println("Cantidad de cursos:")
    val cantidadCursos = readLine()!!.toInt()

    val nombresCursos = mutableListOf<String>()
    val creditos = mutableListOf<Int>()
    val costos = mutableListOf<Int>()

    var curso = 1

    while (curso <= cantidadCursos) {
        println("Curso $curso - Nombre:")
        val nombreCurso = readLine()!!

        println("Curso $curso - Crédito:")
        val credito = readLine()!!.toInt()

        val costo = credito * 100

        nombresCursos.add(nombreCurso)
        creditos.add(credito)
        costos.add(costo)

        curso++
    }


}