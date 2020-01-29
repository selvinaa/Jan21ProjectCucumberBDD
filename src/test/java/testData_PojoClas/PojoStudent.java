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
//String parentWindow = driver.getWindowHandle();
//Set<String> windowHandles = driver.getWindowHandles();
//Iterator<String> iterator = windowHandles.iterator();
//while (iterator.hasNext()) {
//   String handle = iterator.next();
//   if (!handle.contains(parentWindow)) {
//                    // Switch to popup
//                    driver.switchTo().window(handle);
//                    // Add code to find element
//       }
//}
//// Switch back to original window
//driver.switchTo().window(parentWindow);
//This code will work with any number of popups


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
