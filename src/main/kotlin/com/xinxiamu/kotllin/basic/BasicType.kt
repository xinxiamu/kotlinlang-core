package com.xinxiamu.kotllin.basic

fun main() {
//    testNumber()
//    underscores()
    representation()
}

//==========Numbers
/**
 * //Byte 8位
//Short 16位
//Int 32位
//Long 64位
//Float 32位
//Double 64位
 */
fun testNumber() {
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    val pi = 3.14 // Double
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

    fun printDouble(d: Double) { print(d) }
    val i = 1
    val d = 1.1
    val f = 1.1f
    printDouble(d)
// printDouble(i) // Error: Type mismatch
// printDouble(f) // Error: Type mismatch
}

//数字中的下划线
fun underscores() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(">>>>>int = $oneMillion, Long = $creditCardNumber, Long1 = $socialSecurityNumber, HexBytes = $hexBytes, bytes = $bytes")
}

// ==比较的是值，===比较的是地址
fun representation() {
    val a: Int = 100 //Int代表一个数字
    val boxedA: Int? = a //Int?代表一个对象
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // true

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b
    println(boxedB === anotherBoxedB) // false

//    val a: Int = 10000
//    println(a == a) // Prints 'true'
//    val boxedA: Int? = a
//    val anotherBoxedA: Int? = a
//    println(boxedA == anotherBoxedA) // Prints 'true'
}

