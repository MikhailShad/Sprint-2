class ProblemB {

    fun main() {
        var requests: Int = readInt()
        while (requests-- > 0) {
            val params: List<Int> = readListInt()
            val targetStringLength: Int = params[0]
            val charactersNumber: Int = params[1]

            var targetString = ""
            for (i in 0 until targetStringLength) {
                targetString += 'a'.plus(i % charactersNumber);
            }

            println(targetString)
        }
    }

}