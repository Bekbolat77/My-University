class Course {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public void displayCourse() {
        System.out.println(courseName + " " + courseCode + " " + credits);
    }
}

class Professor {
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public void displayProfessor() {
        System.out.println(name + " " + department);
    }
}

class University {
    private String universityName;
    private String location;

    public University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    public String getUniversityName() { return universityName; }
    public void setUniversityName(String universityName) { this.universityName = universityName; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public void displayUniversity() {
        System.out.println(universityName + " " + location);
    }
}

class UniversityManagementSystem {
    public static void main(String[] args) {
        Course course1 = new Course("OOP", "CS101", 4);
        Course course2 = new Course("DS", "CS102", 3);
        Professor prof1 = new Professor("Dr. Smith", "Computer Science");
        Professor prof2 = new Professor("Dr. Johnson", "IT");
        University uni1 = new University("Tech University", "New York");
        University uni2 = new University("Global University", "London");

        course1.displayCourse();
        course2.displayCourse();
        prof1.displayProfessor();
        prof2.displayProfessor();
        uni1.displayUniversity();
        uni2.displayUniversity();

        if (course1.getCredits() > course2.getCredits()) {
            System.out.println(course1.getCourseName() + " has more credits.");
        } else if (course1.getCredits() < course2.getCredits()) {
            System.out.println(course2.getCourseName() + " has more credits.");
        } else {
            System.out.println("Both courses have equal credits.");
        }
    }
}
