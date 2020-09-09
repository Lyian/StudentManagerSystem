package energy.uniper.models

class StudyPlan(){
    private val courseData = mutableMapOf<String, MutableList<String>>()

    fun printStudyPlanDemo(){
        // Schüler hat gewählt:
        // Deutsch, Physik, Latain als Schwerpunkt (6 Stunden, 4 Stunden)
        // Sport, Biologie, Chemie (a 2 Stunden)
        // Mathematik und Englisch (a 4 Stunden)
        val name = "Bohlen, Dieter"
        courseData.put("Montag", mutableListOf(    "Deutsch",      "Deutsch",      "Pause",    "Sport",        "Sport",    "Pause",    "Physik",   "Latain"))
        courseData.put("Dienstag", mutableListOf(  "Physik",       "Physik",       "Pause",    "Deutsch",      "Deutsch",  "Pause",    "Latain",   "Latain"))
        courseData.put("Mittwoch", mutableListOf(  "Deutsch",      "Biologie",     "Pause",    "Biologie",     "Latain",   "Pause",    "Physik"))
        courseData.put("Donnerstag", mutableListOf("Chemie",       "Mathematik",   "Pause",    "Mathematik",   "Englisch", "Pause",    "Englisch", "Deutsch"))
        courseData.put("Freitag", mutableListOf(   "Mathematik",   "Mathematik",   "Pause",    "Chemie",       "Englisch", "Pause",    "Englisch"))


        println("\n\nStundenplan von $name")
        for ((day, _) in courseData){
            print(day.padEnd(20))
        }
        print("\n".padEnd(100,'_'))

        for (i in 0..7)
            printRow()
    }

    private fun printRow(){
        print("\n")
        for ((day, _) in courseData){
            val course = courseData[day]?.let { getFirstAndRemove(day, it) }
            print(course?.padEnd(20))
        }
    }

    private fun getFirstAndRemove(day: String, coursesOfDay : MutableList<String>) : String {
        if(coursesOfDay.isNotEmpty()){
            val course = coursesOfDay[0]
            coursesOfDay.removeAt(0)
            courseData[day] = coursesOfDay
            return course
        }
        return "---"
    }
}