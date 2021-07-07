package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        try {
            if (number.toInt() < 0) {
                return null
            }
        } catch (e: NumberFormatException){
            return null
        }

        val neighbourNumbers = arrayOf(
            arrayOf('8'),
            arrayOf('2', '4'),
            arrayOf('1', '3', '5'),
            arrayOf('2', '6'),
            arrayOf('1', '5', '7'),
            arrayOf('2', '4', '6', '8'),
            arrayOf('3', '5', '9'),
            arrayOf('4', '8'),
            arrayOf('0', '5', '7', '9'),
            arrayOf('6', '8'))

        val result = arrayListOf<String>()
        var currentNumber = 0
        val numberAsCharsArray = number.toCharArray()

        for (i in 0..number.length - 1) {
            currentNumber = numberAsCharsArray[i].toString().toInt()
            val tempNumberAsCharsArray = number.toCharArray()
            for (j in 0..neighbourNumbers[currentNumber].size - 1) {
                tempNumberAsCharsArray.set(i, neighbourNumbers[currentNumber][j])
                result.add(tempNumberAsCharsArray.joinToString(""))
            }
        }
        return result.toTypedArray()
    }
}
