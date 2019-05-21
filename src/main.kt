import decorators.*

/**
 * Yoo it's my first program written in Kotlin, don't take to heart.
 */
fun main() {
    println("Hello world!")

    val hseStudent = PiDecorator(MagicianDecorator(NaiveDecorator(HseStudent())))
    println(hseStudent.describeMe())

    val nnguStudent =  TerminatorDecorator(FoolishDecorator(NnguStudent()))
    print(nnguStudent.describeMe())
}