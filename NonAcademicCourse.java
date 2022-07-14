/**Documentation(NonAcademicCourse Class)
 * The NonAcademicCourse is a child class of class "Course"  with seven attributes.
 * It consists of a constructor, accessor method for each attribute, mutator methods to set the the value to class variables.
 * And display method to display the outputs. 
 * 
 * @author Shreya Rai
 * @version 11.0.2(07-05-2021)
 */
public class NonAcademicCourse extends Course
{
    //Atributes of the class
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
      
    /*
    * A constructor is created with four parameters: courseId, courseName, duration, prerequisite.
    * Super class constructor is called with three parameters: courseId, courseName and duration.
    * 
    * @param courseId - It is called from super class to set Id of the course.
    * @param courseName - It is called from super class to set name of the course.
    * @param duration -It is called from super class to set duration of the course.
    * @param prerequisite - Preprequisite for NonAcademicCourse
    */ 
    public NonAcademicCourse(String courseId, String courseName, int duration, String prerequisite)
    {
        //constructor called from super class
        super(courseId, courseName, duration);
        // setting parameter values to the class variable
        this.prerequisite = prerequisite;
        //initializing class variables
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }
      
    /*
     * This method is used to get access to the attribute instructorName.
     * 
     * @return - value of instructorName attribute of the class
    */ 
    public String getInstructorName()
    {
        return this.instructorName;
    }
    
    
    /*
     * This method is used to get access to the attribute startDate
     * 
     * @return - value of startDate attribute of the class
    */ 
    public String getStartDate()
    {
        return this.startDate;
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
     * This method is used to get access to the attribute examDate
     * 
     * @return - value of examDate attribute of the class
    */     
    public String getExamDate()
    {
        return this.examDate;
    }

    /*
     * This method is used to get access to the attribute prerequisite
     * 
     * @return - value of prerequisite attribute of the class
    */     
    public String getPrerequisite()
    {
        return this.prerequisite;
    }
     
    /*
     * This method is used to get access to the attribute isRegistered
     * 
     * @return - value of isRegistered attribute of the class
    */ 
    public boolean isIsRegistered() 
    {
        return this.isRegistered;
    }
    
    /*
     * This method is used to get access to the attribute isRemoved
     * 
     * @return - value of isRemoved attribute of the class
    */ 
    public boolean isIsRemoved()
    {
        return this.isRemoved;
    }
      
    /*
     * This method is created to set new instructor name with a parameter
     * It accepts new value as parameter and assigns the value to the instructorName attribute
     * 
     * @param instructorName - Name of the instructor of the course
    */
    public void setInstructorName(String instructorName)
    {
        if(this.isRegistered == false) {
            //if the non-academic course has not been registered parameter value is assigned to the class attribute
            this.instructorName = instructorName;
        }
        else {
            //output to be printed if the course is already registered
            System.out.println("************************************************");
            System.out.println("** Error : Not possible to change the Instructor Name.**");
            System.out.println("************************************************");
        }
    }

    /*
     * This method is created to set new start date with a parameter
     * It accepts new value as parameter and assigns the value to the startDate attribute
     * 
     * @param startDate - date when the course is planned to start
    */
    public void setStartDate(String startDate)
    {
        //new value is assigned to class attribute
        this.startDate = startDate;
    }
    
    /*
     * This method is created to set new completion date with a parameter
     * It accepts new value as parameter and assigns the value to the completionDate attribute
     * 
     * @param completionDate - date when the course is planned to complete
    */
    public void setCompletionDate(String completionDate)
    {
        //new value is assigned to class attribute  
        this.completionDate = completionDate;
    }
    
    /*
     * This method is created to set new exam date with a parameter
     * It accepts new value as parameter and assigns the value to the examDate attribute
     * 
     * @param examDate - date when the exam is held
    */
    public void setExamDate(String examDate)
    {     
        //new value is assigned to examDate attribute  
        this.examDate = examDate;
    }
    
    /*
     * This Method is created to register the non-academic course with five parameters - courseLeader, instructorName, startingDate,
     * CompletionDate, examDate
     * Method from parent class is called to set the name of the courseLeader
     * 
     * @param courseLeader - it is called from super class and used to set name of the leader of the course
     * @param instructorName - name of the instructor of the course
     * @param startingDate - date when the course is planned to start
     * @param CompletionDate - date when the course is planned to complete
     * @param examDate - date when the exam is held
    */
    public void register(String courseLeader, String instructorName, String startingDate, String completionDate, String examDate)
    {
        if (this.isRegistered == false) {   
            //method to set the instructor name is called
            setInstructorName(instructorName);
            //called from parent class
            super.setCourseLeader(courseLeader);
            //assigning values to class variables*/
            this.isRegistered = true;
            // setting parameter values to the class variable
            this.startDate = startingDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            
        }
        else {
            //message to be printed if the course is already registered
            System.out.println("Error : The Non-Academic course is already registered.");
            
            }    
    }
       
    /*
     * This method is created to remove the Non-Academic course
     * Method from parent class is called to set the name of the courseLeader
    */  
    public void remove()
    {
        //checking if the non-academic course is already removed
        if (this.isRemoved == true) {
            //message to be displayed is the course is already removed
            System.out.println("Message : The course has already been removed.");
        }
        else {
            //called from parent class
            super.setCourseLeader("");
            //assigning values to class variables
            this.isRegistered = false;
            this.isRemoved = true;
            //method to set instructorName, startDate, completionDate and examDate is called
            setInstructorName("");
            setStartDate("");
            setCompletionDate("");
            setExamDate("");
        }
    }
    
    /*
     * This method is created to display the details of the attribut of the class 'NonAcademicCourse'.
     * method from parent class is called to display courseId, courseName and duration
    */
    public void display()
    {
        //calling method of parent class "Course" 
        super.display();
        if(this.isRegistered == true) {
            //output to be printed if the course is registered
            System.out.println("Instructor Name: " + getInstructorName());
            System.out.println("Start Date:" + getStartDate());
            System.out.println("Completion Date:" + getCompletionDate());
            System.out.println("Exam Date:" + getExamDate());
            System.out.println("Prerequisite:" + getPrerequisite());
            System.out.println("\n");
        }
    }
}
