package OOPSAssignments;
/*Encapsulation:-Print college names(any 5 colleges) and departments - IT , CS , MECH , ECE , EEE , AERO , AUTO , EI -
Should use private variables for the department name and college . (Apply encapsulation)
 */
public class College {
    public String collegeName;
    public String[] departmentName;

    public String[] getDepartmentName(){
        return departmentName;
    }
    public void setDepartmentName(String[] departmentName){
        this.departmentName=departmentName;
    }
    public String getCollegeName() {
        return collegeName;
    }
    //setter method
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    }
