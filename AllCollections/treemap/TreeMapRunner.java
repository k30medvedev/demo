package AllCollections.treemap;

import deiteiPJCourse.Lab6.Average;

import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {

        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = createGrade();
        printGrades(grades, false);

        AverageStudentGrade border = grades.ceilingKey(new AverageStudentGrade(" ", 70));
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> scolarShipStudents = (NavigableMap<AverageStudentGrade, Set<SubjectGrade>>) grades.tailMap(border);
        System.out.println("------------------------");

        System.out.println("Scgolarship students");
        printGrades(scolarShipStudents.descendingMap(), false);

        System.out.println("Contender stundent");
        AverageStudentGrade contender = grades.lowerKey(border);
        System.out.println(contender);

        System.out.println("Student hiest grade ");
        System.out.println(scolarShipStudents.lastEntry());

    }


    private static void printGrades(Map<AverageStudentGrade, Set<SubjectGrade>> grades, boolean printValue) {
        Set<AverageStudentGrade> averageGrades = grades.keySet();

        for (AverageStudentGrade gr : averageGrades) {
            System.out.println(gr);
            if (printValue) {
                System.out.println(grades.get(gr));
            }
        }
    }


    public static NavigableMap<AverageStudentGrade, Set<SubjectGrade>> createGrade() {

        Set<SubjectGrade> alexGrades = new HashSet<>();
        alexGrades.add(new SubjectGrade("Mathematics", 89));
        alexGrades.add(new SubjectGrade("Physics", 82));
        alexGrades.add(new SubjectGrade("Hystory", 84));
        alexGrades.add(new SubjectGrade("Literature", 59));
        alexGrades.add(new SubjectGrade("Chemistry", 86));


        Set<SubjectGrade> javmesGrades = new HashSet<>();
        javmesGrades.add(new SubjectGrade("Mathematics", 69));
        javmesGrades.add(new SubjectGrade("Physics", 69));
        javmesGrades.add(new SubjectGrade("Hystory", 79));
        javmesGrades.add(new SubjectGrade("Literature", 59));
        javmesGrades.add(new SubjectGrade("Chemistry", 86));

        Set<SubjectGrade> antonyGrades = new HashSet<>();
        antonyGrades.add(new SubjectGrade("Mathematics", 59));
        antonyGrades.add(new SubjectGrade("Physics", 83));
        antonyGrades.add(new SubjectGrade("Hystory", 82));
        antonyGrades.add(new SubjectGrade("Literature", 81));
        antonyGrades.add(new SubjectGrade("Chemistry", 85));


        Set<SubjectGrade> VictoryGrades = new HashSet<>();
        VictoryGrades.add(new SubjectGrade("Mathematics", 84));
        VictoryGrades.add(new SubjectGrade("Physics", 59));
        VictoryGrades.add(new SubjectGrade("Hystory", 69));
        VictoryGrades.add(new SubjectGrade("Literature", 79));
        VictoryGrades.add(new SubjectGrade("Chemistry", 29));


        Set<SubjectGrade> HelenGrades = new HashSet<>();
        HelenGrades.add(new SubjectGrade("Mathematics", 59));
        HelenGrades.add(new SubjectGrade("Physics", 69));
        HelenGrades.add(new SubjectGrade("Hystory", 49));
        HelenGrades.add(new SubjectGrade("Literature", 59));
        HelenGrades.add(new SubjectGrade("Chemistry", 69));

        Set<SubjectGrade> AlinaGrades = new HashSet<>();
        AlinaGrades.add(new SubjectGrade("Mathematics", 49));
        AlinaGrades.add(new SubjectGrade("Physics", 65));
        AlinaGrades.add(new SubjectGrade("Hystory", 29));
        AlinaGrades.add(new SubjectGrade("Literature", 19));
        AlinaGrades.add(new SubjectGrade("Chemistry", 65));


        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> map = new TreeMap<>();
        map.put(new AverageStudentGrade("Alex", calcAvarage(alexGrades)), alexGrades);
        map.put(new AverageStudentGrade("Antony", calcAvarage(antonyGrades)), antonyGrades);
        map.put(new AverageStudentGrade("Victory", calcAvarage(VictoryGrades)), VictoryGrades);
        map.put(new AverageStudentGrade("Helen", calcAvarage(HelenGrades)), HelenGrades);
        map.put(new AverageStudentGrade("Alina", calcAvarage(AlinaGrades)), AlinaGrades);


        return map;
    }

    private static float calcAvarage(Set<SubjectGrade> grades) {
        float sum = 0f;
        for (SubjectGrade sg : grades) {
            sum += sg.getGrade();
        }
        return sum / grades.size();
    }


}
