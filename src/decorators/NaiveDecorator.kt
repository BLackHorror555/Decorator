package decorators

import Student

class NaiveDecorator(student: Student) : BaseStudentDecorator(student) {
    override fun describeMe(): String {
        return super.describeMe() + "I'll start doing my coursework one week before deadline and finish it in time. "
    }
}