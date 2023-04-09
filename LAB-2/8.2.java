class Student {
    private String firstName;
    private String lastName;
    private int indexNumber;
    private double attendance;
    private int grade;

    public Student(int indexNumber, double attendance, int grade) {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.indexNumber = indexNumber;
        setAttendance(attendance);
        setGrade(grade);
    }

    public Student(String firstName, String lastName, int indexNumber, double attendance, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        setAttendance(attendance);
        setGrade(grade);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        if (attendance < 0 || attendance > 100) {
            throw new IllegalArgumentException("Attendance must be between 0 and 100%");
        }
        this.attendance = attendance;
        if (attendance < 50) {
            setGrade(2);
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("The grade must be betweeen 2 and 5");
        }
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student1 = new Student(999, 55, 5);
        System.out.println(student1.getFirstName());
        student1.setFirstName("Jan");
        System.out.println(student1.getFirstName());
        student1.setAttendance(40);
        System.out.println(student1.getGrade());

        Student student2 = new Student("Marcin", "Kowalski", 111, 10, 4);
        System.out.println(student2.getLastName());
        student2.setGrade(5);
        System.out.println(student2.getGrade());
    }
}