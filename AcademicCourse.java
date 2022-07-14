/**Doucmentation(AcademicCourse)
 * The AcademicCourse is a child class of class "Course" with seven attributes
 * It consists of a constructor, accessor method for each attribute, mutator methods to set the the value to class variables.
 * And display method to display the outputs. 
 *
 * @author Shreya Rai
 * @version 11.0.2(07-05-2021)
 */
public class AcademicCourse extends Course
{
    //Atributes of the class 
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;
    
    /*
     * A constructor for AcademicCourse is created with four parameters- courseId, courseName, duration, level, credit, numberOfAssessment
     * Super class constructor is called with three parameters - courseId, courseName and  duration
     * 
     * @param courseId - it is called from super class to set Id of the course
     * @param courseName - it is called from super class to set name of the course
     * @param duration -it is called from super class to set duration of the course
     * @param level - level of the course
     * @param credit - Credit for the course
     * @param numberOfAssessment - number of assessment for the course
    */
    public AcademicCourse(String courseId, String courseName, int duration, String level, String credit, int numberOfAssessment)
    {
        //constructor called from super class
        super(courseId, courseName, duration);   
        //initializing class variables
        this.lecturerName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
        this.credit = credit;
        this.level = level;
        this.numberOfAssessments = numberOfAssessment;
    }
    
    /*
     * This method is used to get access to the attribute lecturerName
     * 
     * @return - value of lecturername attribute of the class
    */
    public String getLecturerName()
    {
        return this.lecturerName;
    }
    
    /*
     * This method is used to get access to the attribute level 
     * 
     * @return - value of level attribute of the class 
    */
    public String getLevel()
    {
        return this.level;
    }
    
    /*
     * This method is used to get access to the attribute credit 
     * 
     * @return - value of credit attribute of the class 
    */
    public String getCredit()
    {
        return this.credit;
    }

    /*
     * This method is used to get access to the attribute startingDate 
     * 
     * @return - value of startingDate attribute of the class 
    */
    public String getStartingDate()
    {
        return this.startingDate;
    }
    
    /*
     * This method is used to get access to the attribute completionDate 
     * 
     * @return - value of completionDate attribute of the class 
    */
    public String getCompletionDate()
    {
        return this.completionDate;
    }
    
    /*
     * This method ia used to get access to numberOfAssessments attribute 
     * 
     * @return - value of numberOfAssessments attribute of the class 
    */
    public int getNumberOfAssessments()
    {
        return this.numberOfAssessments;
    }
    
    /*
     * This method is used to get access to isRegistered attribute
     * 
     * @return - value of isRegistered attribute ofthe class 
    */
    public boolean isIsRegistered()
    {
        return this.isRegistered;
    }
      
    /*
     * This method is created to set new lecturer name with a parameter - lecturerName 
     * It accepts new value as parameter and assigns the value to the lecturerName attribute of the class "AcademicCoursei"
     * 
     * @param lecturerName - Name of the lecturer of the course
    */
    public void setLecturerName(String lecturerName)
    {
        this.lecturerName = lecturerName;
    }
    
    /*
     * This method is created to set new numberOfAssessment with a parameter - numberOfAssessment
     * It accepts new value as parameter and assigns the value to the numberOfAssessments attribute of the class "AcademicCourse"
     *  
     * @param numberOfAssessments - number of assessments required for the course
    */
    public void setNumberOfAssessments(int numberOfAssessments)
    {
        this.numberOfAssessments = numberOfAssessments;
    }
    
    /*
     * This Method is created to register the academic course with four parameters - courseLeader, lecturerName, startingDate, completionDate
     * 
     * @param courseLeader - It is called from super class to set the name of the leader of the course 
     * @param lecturerName - Name of the lecturer
     * @param startingDate - date when the course is planned to start
     * @param completionDate - date when the course is planned to complete
     * 
    */
    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate)
    {
        if(this.isRegistered == true) {
            //output to be printed if the course is registered
            System.out.println("Lecturer Name: "+ this.lecturerName);
            System.out.println("Starting Date: " + this.startingDate);
            System.out.println("Completion Date: " + this.completionDate);
            System.out.println("Message : The course has already been registered.");
        }
        else {
            //called from parent class to set the coureLeader
            super.setCourseLeader(courseLeader);        
            // setting parameter values to the class variable
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
        }       
    }
    
    /*
     * This method is created to display the stored details of the attributes of class 'AcademicCourse'.
     * Method from parent class is called to display courseId, courseName, duration and courseLeader
    */
    public void display()
    {
        //calling method of parent class "Course" 
        super.display();     
        if(this.isRegistered == true) {
            //output to be printed if the course is registered
            System.out.println("Lecturer Name: "+ getLecturerName());
            System.out.println("Level: "+ getLevel());
            System.out.println("Credit: "+ getCredit());
            System.out.println("Starting Date: "+ getStartingDate());
            System.out.println("Completion Date: "+ getCompletionDate());
            System.out.println("Number of Assessment: "+ getNumberOfAssessments());
            System.out.println("\n");
        }
    }    
}
