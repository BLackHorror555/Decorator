package decorators

import Student

open class BaseStudentDecorator(private val student: Student) : Student {
    override fun describeMe(): String {
        return student.describeMe()
    }
}