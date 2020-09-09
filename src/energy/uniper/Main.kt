package energy.uniper;

import energy.uniper.models.StudyPlan;
import energy.uniper.util.StudentGenerator

/**
 * In der Vergangenheit haben sich die Lehrer vor Anfang des Schuljahres versammelt, um den Stundenplan der Schüler zu erstellen.
 * Da dies ein langwieriger Prozess ist, hat die Schule sich für eine Softwarelösung entschieden, die nun der folgenden Logik genügt:
 *
 * Im 10. Jahrgang sind 150 Schüler, die am Tag maximal 6 Stunden unterricht haben.
 * An der Schule Uniper, muss jeder Schüler die Hauptfächer Mathematik, Englisch und Deutsch belegen, die in der Woche 4 stündig stattfindet.
 * Desweiteren muss jeder Schüler drei Schwerpunktfächer, die 4 stündig stattfinden, sowie drei weitere, einfache Wahlfächer wählen, die 2 stündig stattfinden.
 * Genau eines der gewählten Schwerpunktfächer muss ein Hauptfach sein, dass dann 6 stündig die Woche stattfindet.
 * Ein Fach tritt nur einmal am Tag auf, und dies entweder einstündig oder zweistündig. Nach jeweils 2 Stunden findet eine Pause statt.
 *
 * Desweiteren hat die Schule für jeden Jahrgang, also im besonderen für den Jahrgang 10, eigene Lehrer, die ausschließlich in ihren zugeteilten Jahrgang unterrichten.
 * Jeder Lehrer lehrt ein Hauptfach und 2 weitere, beliebige Fächer. Jeder Lehrer hat seinen eigenen Klassenraum und kann gleichzeitig 25 Schüler unterrichten,
 * wobei der Lehrer maximal 3 Stunden am Tag dasselbe Fach lehrt.
 *
 */

fun main() {
    val demoPlan = StudyPlan()
    demoPlan.printStudyPlanDemo()

    val students = StudentGenerator().generateStudents()

}

