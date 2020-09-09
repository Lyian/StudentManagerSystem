package energy.uniper.models

class Student(val id: Int, val firstName : String, val lastName : String,  val electiveCourses : List<String>, val mainElectiveCourses: List<String>){
    var studyHoursWeek : Int = 0
    private val studyPlan : StudyPlan = StudyPlan()

    fun printPlanOfStudent(){
        studyPlan.printStudyPlanDemo()
    }
}