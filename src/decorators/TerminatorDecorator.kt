package decorators

import Student

class TerminatorDecorator(student: Student) : BaseStudentDecorator(student) {
    override fun describeMe(): String {
        return super.describeMe() + "I'll be back. "
    }
}