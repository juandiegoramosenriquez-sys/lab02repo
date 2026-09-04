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

    println("\nTurno (mañana/tarde/noche):")
    val turno = readLine()!!.lowercase()

    val descuento: Double = when (turno) {
        "mañana" -> 0.10
        "tarde" -> 0.15
        "noche" -> 0.20
        else -> 0.0
    }

    println("\nCategoría (ordinario/becado):")
    val categoria = readLine()!!.lowercase()

    val matricula: Int = if (categoria == "becado") 0 else 300


    println("\nResultado final")
    println("Estudiante: $nombre")
    println("\ncurso\tcredito\tcosto")

    var i = 0
    while (i < cantidadCursos) {
        println("c${i + 1}\t${creditos[i]}\t${costos[i]}")
        i++
    }

    var totalCreditos = 0
    var totalPagar = 0
    var j = 0

    while (j < cantidadCursos) {
        totalCreditos += creditos[j]
        totalPagar += costos[j]
        j++
    }


    val montoDescuento = totalPagar * descuento
    val totalConDescuento = totalPagar - montoDescuento

    val totalConMatricula = totalConDescuento + matricula

    val cargaAcademica: String

    if (totalCreditos <= 12) {
        cargaAcademica = "Normal"
    } else if (totalCreditos <= 18) {
        cargaAcademica = "Carga completa"
    } else {
        cargaAcademica = "Requiere autorización"
    }

    val numeroCuotas: Int

    if (totalConMatricula > 2500) {
        numeroCuotas = 3
    } else {
        numeroCuotas = 2
    }

    val montoCuota = totalConMatricula / numeroCuotas

    println("\ncursos: $cantidadCursos")
    println("total de creditos: $totalCreditos")
    println("total a pagar: $totalPagar")
    println("carga academica: $cargaAcademica")
    println("forma de pago: $numeroCuotas cuotas de $montoCuota cada una")

    println("turno: $turno")
    println("descuento aplicado: ${(descuento * 100).toInt()}%")
    println("total con descuento: $totalConDescuento")

    println("categoria: $categoria")
    println("matricula: $matricula")
    println("total con matricula: $totalConMatricula")

}