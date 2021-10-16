import java.util.Arrays

/**
* Esta funcion ordena un arreglo de enteros usando selection sort.
* El metodo es no destructivo.
* @param arreglo el arreglo de enteros a ordenar.
* @return el arreglo ordenado.
*/
fun ordena(arreglo: Array<Int>) : Array<Int> {
	val ordenado = arreglo.copyOf()
	val n = ordenado.size - 1
	for (i in 0..n) {
		for (j in i..n) {
			if (ordenado[j] < ordenado[i])
				intercambia(ordenado, i, j)
		}
	}
	return ordenado
}

/**
* Funcion auxiliar para intercambiar elementos en un arreglo.
* @param arreglo el arreglo al cual se le van a intercambiar dos elementos.
* @param i el indice correspondiente a uno de los elementos a intercambiar.
* @param j el indice del otro elemento a intercambiar.
*/
fun intercambia(arreglo: Array<Int>, i: Int, j: Int) {
	val temporal = arreglo[i]
	arreglo[i] = arreglo[j]
	arreglo[j] = temporal
}

/**
* Algunos ejemplos de funcionamiento del programa.
*/
fun main() {	
	val arreglos = listOf<Array<Int>>(
		arrayOf(1,2,3,4,5),
		arrayOf(8,8,8,8,8),
		arrayOf(5,4,3,2,1),
		arrayOf(8,1,3,6,9)
	)
	for (arreglo in arreglos)
		println("ordena(${Arrays.toString(arreglo)}) = ${Arrays.toString(ordena(arreglo))}")
}
