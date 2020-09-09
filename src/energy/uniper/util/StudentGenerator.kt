package energy.uniper.util

import energy.uniper.models.Student
import kotlin.random.Random

/**
 * Diese Klasse generiert euch die 150 Studenten. In jedem Lauf, sind die Studenten die selben!
 */

class StudentGenerator (val countStudents : Int = 150) {
    private val random = Random(1)
    private val studentList : MutableList<Student> = mutableListOf()
    private val electiveCourses = listOf("Latain", "Spanisch", "Physik", "Biologie", "Chemie", "Sport", "Psychologie", "Pädagokik", "Erdkunde", "Geschichte",
            "Informatik", "Kunst", "Musik", "Politik")
    private val mainCourses = listOf("Deutsch", "Englisch", "Mathe")
    private val firstNames = listOf("Hannah", "Ben","Emma", "Paul", "Emilia", "Leon", "Mia", "Henry", "Ella", "Finn", "Lina", "Felix", "Clara", "Matteo", "Leni", "Luis", "Lea", "Theo", "Sophia", "Noah")
    private val lastNames = listOf( "Müller","Schmidt","Schneider","Fischer","Weber","Meyer","Wagner","Becker","Schulz","Hoffmann")

    fun generateStudents() : List<Student>{
        for (i in 0..countStudents){
            val (electiveCoursesStudent, mainCoursesStudent) = generateCourses()
            val firstName = firstNames.random(random)
            println("$firstName, $mainCoursesStudent ${mainCoursesStudent.size + electiveCoursesStudent.size}")
            studentList.add(Student(i, firstName, lastNames.random(random),electiveCoursesStudent, mainCoursesStudent))
        }
        return studentList
    }

    private fun generateCourses(): Pair<MutableList<String>, MutableList<String>> {
        val electiveCoursesStudent = mutableListOf<String>()
        val mainCoursesStudent = mutableListOf<String>()
        val fundamentalElectedCourse = mainCourses.random(random)

        mainCoursesStudent.add(fundamentalElectedCourse)

        while (electiveCoursesStudent.size < 3 || mainCoursesStudent.size < 3) {
            val currentMainCourse = electiveCourses.random(random)
            if (!mainCoursesStudent.contains(currentMainCourse) && mainCoursesStudent.size < 3) {
                mainCoursesStudent.add(currentMainCourse)
            }

            val currentElectiveCourse = electiveCourses.random(random)
            if (!electiveCoursesStudent.contains(currentElectiveCourse) && !mainCoursesStudent.contains(currentElectiveCourse) && electiveCoursesStudent.size < 3) {
                electiveCoursesStudent.add(currentElectiveCourse)
            }
        }

        return Pair(electiveCoursesStudent, mainCoursesStudent)
    }

}