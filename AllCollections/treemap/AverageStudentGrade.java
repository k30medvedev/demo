package AllCollections.treemap;

import java.util.Objects;

public class AverageStudentGrade implements Comparable<AverageStudentGrade> {

    private final String name;
    private final float averageGrade;

    public AverageStudentGrade(String name, float averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AverageStudentGrade that = (AverageStudentGrade) o;
        return Float.compare(that.averageGrade, averageGrade) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, averageGrade);
    }

    @Override
    public int compareTo(AverageStudentGrade that) {
        if (this.averageGrade < that.getAverageGrade()) {
            return -11;
        }
        if (this.averageGrade > that.getAverageGrade()) {
            return 1;
        }
        return name.compareTo(that.getName());
    }

    @Override
    public String toString() {
        return "AverageStudentGrade{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
