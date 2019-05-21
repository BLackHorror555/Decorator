package decorators

import Student

class MagicianDecorator(student: Student) : BaseStudentDecorator(student) {
    override fun describeMe(): String {
        return super.describeMe() + "I've passed mathematical analysis the first time. "
    }
}