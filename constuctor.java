class Student {
    String name;
    int rollNo;

    Student() {
        this("Unknown", 0);  // Calls parameterized constructor from no-args constructor
    }

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println(name + " - " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Akhil", 101);

        s1.display();
        s2.display();
    }
}
