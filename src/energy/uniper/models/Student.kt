package energy.uniper.models

/**
 * Diese Klasse repräsentiert den Studenten und enthält alle nötigen Informationen, die wir für die Erstellung des Stundenplans
 * benötigen.
 * ElectiveCourses sind diejenigen Fächer, die nur 2 Stündig in der Woche belegt werden
 * In mainElectiveCourses sind die Fächer, die 4 Stunden bzw. 6 Stunden belegt werden müssen.
 * Es kann sein, dass ein Name unter den Schülern identisch sind, deshalb ist der Schlüssel, der definitiv den Schüler identifiziert
 * die Variable ID.
 * Hier müssen neue Variablen und Funktionen hinzugefügt werden.
 */

class Student(val id: Int, val firstName : String, val lastName : String,  val electiveCourses : List<String>, val mainElectiveCourses: List<String>){
    var studyHoursWeek : Int = 0
    val studyPlan : StudyPlan = StudyPlan()

    fun printPlanOfStudent(){

    }
}