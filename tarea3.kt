import java.util.Arrays

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

fun intercambia(arreglo: Array<Int>, i: Int, j: Int) {
	val temporal = arreglo[i]
	arreglo[i] = arreglo[j]
	arreglo[j] = temporal
}
