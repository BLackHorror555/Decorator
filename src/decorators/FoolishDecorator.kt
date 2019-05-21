package decorators

import Student

class FoolishDecorator(student: Student) : BaseStudentDecorator(student) {
    override fun describeMe(): String {
        return super.describeMe() + "I like PHP programming. "
    }
}