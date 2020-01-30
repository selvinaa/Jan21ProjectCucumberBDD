package testData_PojoClas;

public class PojoStudent {
    private String name;
    private String group;
    private int studentID;

    public PojoStudent(String name, String group, int studentID){
        this.name = name;
        this.group = group;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getStudentID() {
        return studentID;
    }


}
