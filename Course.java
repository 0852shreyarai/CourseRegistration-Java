/**
 * This is a parent class of AcademicCourse and NonAcademic sub classes with four attributes. 
 * It consists of a constructor, accessor method for each attribute, mutator methods to set the the value to class variables.
 * And display method to display the outputs. 
 * 
 * @author Shreya Rai
 * @version 11.0.2(07-05-2021)
 */
public class Course
{
    //Attributes of the class 
    private String courseId;
    private String courseName;
    private int duration;
    private String courseLeader;
    
    /*
     * A constructor for Course is created with three parameters - courseId, courseName, duration.
     * 
     * @param courseId - Id of the course
     * @param courseName - Name of the course
     * @param duration - Duration of the course
     */           //local variable
    public Course(String Id, String courseName, int duration)
    {
        //initializing class variables
        this.courseLeader = "";
        // setting parameter values to the class variable
            //instance variable   //local variable
        this.courseId          =   Id;
        this.courseName = courseName;
        this.duration = duration;
    }
    
    /*
     * This method is used to get access to the Course attribute 'courseId'.
     * 
     * @return - value of attribute 'courseId' of the class
    */
    public String getCourseId()
    {
        return this.courseId;
    }
    
    /*
     * This method is used to get access to the Course attribute 'courseName'.
     * 
     * @return - value of attribute 'courseName' of the class
    */
    public String getCourseName()
    {
        return this.courseName;
    }
    
    /*
     * This method is used to get access to the Course attribute 'courseLeader'.
     * 
     * @return - value of attribute 'courseLeader' of the class
    */
    public String getCourseLeader()
    {
        return this.courseLeader;
    }
    
    /*
     * This method is used to get access to the Course attribute 'duration'.
     * 
     * @return - value of  attribute 'duration' of the class
    */
    public int getDuration()
    {
        return this.duration;
    }
    
    /*
     * This method is created to set new course Leader with a parameter.
     * It accepts new value as parameter and assigns the value to the courseLeader attribute.
     * 
     * @param courseLeader - leader of the course
    */
    public void setCourseLeader(String courseLeader)
    {
        this.courseLeader = courseLeader;
    }
    
    /*
     * This method is created to display the stored details of the attribute of the class 'Course'.
    */
    public void display()
    {
        //outputs to be printed 
        System.out.println("Course ID: " + getCourseId());
        System.out.println("Course name: " + getCourseName());
        System.out.println("Duration: " + getDuration());
        if(this.courseLeader != "") {
            //output to be displayed if the attribute is not empty
            System.out.println("Course Leader: " + getCourseLeader());
        }
        System.out.println("\n");
    }
}
