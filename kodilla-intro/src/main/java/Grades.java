public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public double averageGrades(Grades[] value) {
        int sumGrades = 0;
        for( int i = 0; i < grades.length; i++ ) {
            sumGrades = sumGrades + grades[i];
        }
        return (double) sumGrades/grades.length;
    }
    int numberOfElements = grades.length; {
        System.out.println(numberOfElements);
    }
}
