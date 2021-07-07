package subtask1

import java.math.BigDecimal

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        if (array.size != 2) {
            throw NotImplementedError("Invalid 'array' size input")
        } else {
            if (array[1] <= 0 || array[0] <= 0) {
                throw NotImplementedError("Invalid values input")
            }
        }

        var m = 0
        val n = array[1]
        val inputC = array[0].toBigDecimal()
        var c: BigDecimal

        do {
            c = combinations(m, n)
            if (c == inputC) {
                return m
            }
            if (c > inputC) {
                return null
            }
            m += 1
        } while (m <= n)

        return null
    }

    private fun combinations(m: Int, n: Int): BigDecimal {
        return factorial(n)/factorial((n - m))/factorial(m)
    }

    private fun factorial(number: Int): BigDecimal {
        var result = 1.toBigDecimal()
        if (number != 0) {
            for (i in 1..number){
                result *= i.toBigDecimal()
            }
        }
        return result
    }
}
