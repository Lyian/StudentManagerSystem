package energy.uniper.service

import energy.uniper.models.Student
import energy.uniper.models.StudyPlan

/**
 * Diese Klasse soll die Logik enthalten, die den Stundenplan des Schülers erstellt.
 * Beachtet, dass entweder ein Student dieser Klasse übergeben wird, und die Klasse denselben Studenten mit einem Studenplan zurückgibt
 * (Stundenplan ist Teil des Schülers), oder ihr vor allem Funktionen schreibt, die die Schülerklasse (Student.kt) aufruft,
 * und den Stundenplan erstellt.
 *
 * Ihr dürft jede Variable, Parameter und Klasse abändern, falls ihr dies für nötig empfindet. Am wichtigsten ist, dass
 * ihr euch nicht eingezwängt in den Vorgaben der Klasse fühlt.
 *
 * Hier nochmals die Spielregeln:
 * 1.) Jeder Student belegt die Hauptfächer Mathematik, Deutsch, Englisch. Jeder dieser Fächer findet in der Woche vierstündig statt.
 * 2.) Eines der Hauptfächer ist ein Schwerpunktfach findet deshalb sechsstündig statt.
 * 3.) Es gibt zwei weitere Schwerpunktfächer, die jeweils vierstündig stattfinden.
 * 4.) Es gibt drei weitere gewählte Fächer, die zweistündig stattfinden.
 * 5.) Jedes Fach kann zweistündig stattfinden. Es soll aber am Tag maximal nur 2 Fächer zweistündig stattfinden.
 *
 * Erweiterungen, sofern die obigen Regeln implementiert sind:
 * 0.) Erstellt im Package "util" eine Klasse TeacherGenerator, die SPÄTER Lehrer generieren soll. Bitte entlehnt diese Klasse der
 * SchülgerGenerator-Klasse. Aber zuerst:
 * 1.) Erstellt eine Klasse Lehrer. Diese Klasse soll entweder zwei oder drei Fächer enthalten, die der Lehrer lehrt und natürlich
 * einen Namen beinhalten. Geht davon aus, dass jeder Lehrer maximal ein Grundfach unterrichtet.
 * 2.) Ein Lehrer kann maximal 25 Schüler gleichzeitig in einer Klasse unterrichten.
 * 3.) Ändert das Verhalten CourseAssignmentService um den obigen Anforderungen gerecht zu werden, wobei ihn nun den Fokus dieser
 * Klasse vermutlich auf die Lehrer legen müsst. (Wenn das Wort Fokus, und die dahinterliegende Logik nicht klar ist, bitte erfragen)
 * 4.) Implementiert nun die TeacherGenerator-Klasse inder 30 Lehrerobjekte generiert werden, die möglichst gleichverteilt alle Fächer
 * abdecken. (Was ist die minimale Anzahl an Lehrern, um 150 Schülern abzudecken, wenn alle Kurse gewählt werden?)
 */

/*class CourseAssignmentService(val student: Student){

}

class CourseAssignmentService(val studyPlan: StudyPlan){

}

class CourseAssignmentService(){

}
*/
