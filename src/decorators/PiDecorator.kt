package decorators

import Student

class PiDecorator(student: Student) : BaseStudentDecorator(student) {
    override fun describeMe(): String {
        return super.describeMe() + "I'm used to going to university 1 time per week. "
    }
}