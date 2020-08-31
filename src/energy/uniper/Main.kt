package energy.uniper;

import energy.uniper.models.StudyPlan;
import energy.uniper.util.StudentGenerator

/**
 * Dieses Projekt ist dazu gedacht, den Studentenplan von Schülern automatisch einzurichten. Dazu dürft ihr vorgehen wie ihr möchtet unter den
 * untenstehenden Regeln.
 * Die Schule Uniper hat insgesamt 150 Schüler im Jahrgang 10.
 * Jeder Schüler hat einen Schultag von maximal 6 Stunden am Tag, aber maximal 28 Stundenwochen. Die Grundfächer Deutsch, Englisch und Mathematik sind jeweils die Woche zu
 * 4 Stunden zu belegen, d.h. diese 3 Fächer belegen bei jedem Schüler 12 Stunden die Woche. Ein Fach darf maximal 2 Stunden am Stück stattfinden.
 * Nach jeweils 2 Stunden, findet eine zwanzigminütige Pause statt, die im Stundenplan gelistet sein soll.
 *
 * Jeder Schüler hat 6 Wahlfächer, von denen 3 Schwerpunktfächer sind, d.h. jeweils 4 Stunden die Wochen auftreten, die anderen
 * 3 Fächer sind je zu 2 Stunden die Woche zu belegen. Ein Schüler muss und kann nur ein Hauptfach als Schwerpunktfach wählen, dessen Stundenanzahl
 * sich dann auf 6 Stunden die Woche erhöht.
 *
 * Ist Beispielsweise das Fach Deutsch ein Schwerpunktfach eines Schülers, so hat er 4 Stunden English, 4 Stunden Mathematik und 6 Stunden Deutsch,
 * sowie 8 Stunden in seinen anderen beiden Schwerpunktfächer, und 6 Stunden in seinen anderen 3 Wahlpflichtfächern.
 * -> Dieser Schüler hat eine Wochenstundenanzahl von 28 Stunden.
 *
 * Es gibt insgesamt die Fächer:
 * Deutsch, Englisch, Mathematik, Latain, Spanisch, Physik, Biologie, Chemie, Sport, Psychologie, Pädagokik, Erdkunde, Geschichte,
 * Informatik, Kunst, Musik, Politik.
 *
 * Das Ziel dieser Aufgabe ist es, jedem Schüler eine abwechslungsreichen Stundenplan zu geben, wobei wir die oben genannten
 * Regeln einhalten müssen und wir möglichst viel mit Klassen und Objekten arbeiten wollen.
 *
 * Die Klasse Stundenplan gibt eine formartierte Konsolenausgabe an Fächern aus, diese solltet ihr benutzen, um den Stundenplan eines Schülers
 * auszugeben.
 *
 */


fun main() {
    val demoPlan = StudyPlan()
    demoPlan.printStudyPlanDemo()

    val students = StudentGenerator().generateStudents()
}

