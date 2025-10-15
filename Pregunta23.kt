/* 
23. Ordenamiento (10 puntos):
Implementa el método más básico de Ordenamiento de una lista de números,
bubbleSort, y también la llamada al método:
fun bubbleSort(input: MutableList<Int>): MutableList<Int> {
// TODO: Implementa el método
}
fun main() {
val numeros: MutableList<Int> = mutableListOf(64, 34, 25,
12, 22, 11, 90)
println("Lista original: $numeros")
// TODO: Escribe la llamada al método
println("Lista ordenada: $numeros")
}
*/
/*
fun bublesSort (input: MutableList<Int>): MutableList<Int>{
    var output: MutableList<Int> = ()

    for (i in 0 until input.lenght -1){
        var extra: Int = 0

        if (input[i] > input[i+1]){
            extra = input[i+1]
            input[i+1] = input[i]
            input[i] = extra
        }
    }
    return input
}

fun main(){
    // llama 
    val numero_sort: MutableList<Int> = buble sort (numeros)
    print (numero_sort)
}
*/
fun bubbleSort(input: MutableList<Int>): MutableList<Int> {
    for (i in 0 until input.size - 1) {
        for (j in 0 until input.size - i - 1) {
            if (input[j] > input[j + 1]) {
                val extra = input[j + 1]
                input[j + 1] = input[j]
                input[j] = extra
            }
        }
    }
    return input
}

fun main() {
    val numeros = mutableListOf(5, 3, 8, 4, 2)
    val NumeroOrdenado = bubbleSort(numeros)
    println(NumeroOrdenado)
}
