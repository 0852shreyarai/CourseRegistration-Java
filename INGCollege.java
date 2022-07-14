import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * This class is to create a graphical user interface (GUI) for a system that stores details of Course that includes both academic and 
 non-academic course.
 * It implements ActionListener interface
 * It contains variables and method consisting the components for the GUI, method for 
    ActionListner
 *
 * @author (Shreya Rai)
 * @version (13-08-2021)
 */

public class INGCollege implements ActionListener
{
    //Instance variables 
    private JFrame frame;
    private Font label_Font;
    private Font Button_Font;
    private ArrayList<Course> courseList = new ArrayList<Course>();    
    private JPanel main_panel;
    private JPanel panel_left_Academic;
    private JPanel panel_right_Academic;
    private JPanel panel_left_NonAcademic;
    private JPanel panel_right_NonAcademic;

    private JLabel academicCourse;
    private JLabel courseID_Aca;
    private JLabel courseName_Aca;
    private JLabel duration;
    private JLabel level;  
    private JLabel startDate;
    private JLabel completionDate;
    private JLabel courseID_NonAca;
    private JLabel courseName_NonAca;
    private JLabel prerequisite; 
    private JLabel courseLeader;
    private JLabel lecturerName;
    private JLabel instructorName;
    private JLabel examDate;
    private JLabel credit;
    private JLabel numberOfAssessments;
    
    private JTextField field_CourseID_Aca;
    private JTextField field_CourseName_Aca;
    private JTextField field_Duration_Aca;
    private JTextField field_Level;
    private JTextField field_Credit;
    private JTextField field_NumberOfAssessments;
    private JTextField field_CourseLeader_Aca;
    private JTextField field_LecturerName;
    private JTextField field_CourseID_NonAca;
    private JTextField field_CourseName_NonAca;
    private JTextField field_Duration_NonAca;
    private JTextField field_Prerequisite;
    private JTextField field_CourseLeader_NonAca;
    private JTextField field_InstructorName;
    
    private JButton button_Add_Aca;
    private JButton button_Add_NonAca;
    private JButton button_NonAcademic;
    private JButton button_Academic;
    private JButton button_Register_Aca;
    private JButton button_Display_Aca;
    private JButton button_Register_NonAca;
    private JButton button_Display_NonAca;
    private JButton button_Clear;
    private JButton button_Remove_NonAca;
  
    private JComboBox start_Year_Box_A;
    private JComboBox start_Month_Box_A;
    private JComboBox start_Day_Box_A;
    
    private JComboBox complete_Year_Box_A;
    private JComboBox complete_Month_Box_A;
    private JComboBox complete_Day_Box_A;

    private JComboBox start_Year_Box_NA;
    private JComboBox start_Month_Box_NA;
    private JComboBox start_Day_Box_NA;
    
    private JComboBox complete_Year_Box_NA;
    private JComboBox complete_Month_Box_NA;
    private JComboBox complete_Day_Box_NA;
    private JComboBox exam_Year_Box_NA;
    private JComboBox exam_Month_Box_NA;
    private JComboBox exam_Day_Box_NA;   

    private AcademicCourse object_Academic;
    private NonAcademicCourse object_NonAcademic;

    /*
     * This method is used to create a Graphical user interface (GUI)
     * It is used to create a form for registering Courses with panels, text fields, combobox 
     and buttons in it
    */
    public void gUI()
    {
        //For Frame
        frame = new JFrame("Course Registeration");
        
        //For Font
        label_Font = new Font("Times New Roman", Font.PLAIN, 18);
        Button_Font = new Font("Times New Roman", Font.BOLD, 18);
        
        //For main Panel of the form
        main_panel = new JPanel();
        Color color= new Color (184, 217, 239);
        main_panel.setBackground(color);
        main_panel.setLayout(null);

        //For left panel in Academic Form
        panel_left_Academic = new JPanel();
        panel_left_Academic.setBounds(50, 150, 500, 510);
        Color color_left = new Color(237, 246, 249);
        panel_left_Academic.setBackground(color_left);
        
        panel_left_Academic.setLayout(null);
        main_panel.add(panel_left_Academic);
        //For right panel in Academic Form
        panel_right_Academic = new JPanel();
        panel_right_Academic.setBounds(590, 210, 470, 370);
        Color color_right = new Color(248, 249, 250);
        panel_right_Academic.setBackground(color_right);
        
        panel_right_Academic.setLayout(null);
        main_panel.add(panel_right_Academic);
        
        //For left panel in Non-Academic Form
        panel_left_NonAcademic = new JPanel();
        panel_left_NonAcademic.setBounds(50, 210, 460, 380);
        panel_left_NonAcademic.setBackground(color_left);
        
        panel_left_NonAcademic.setLayout(null);
        main_panel.add(panel_left_NonAcademic);
  
        //For right panel in Non-Academic Form
        panel_right_NonAcademic = new JPanel();
        panel_right_NonAcademic.setBounds(570, 150, 480, 440);
        panel_right_NonAcademic.setBackground(color_right);
        
        panel_right_NonAcademic.setLayout(null);
        main_panel.add(panel_right_NonAcademic);

        //For title of the form
        academicCourse = new JLabel("Academic Course");
        academicCourse.setBounds(370, 40, 500, 45);
        Font F_label_academicCourse = new Font("Times New Roman", Font.BOLD, 50);
        academicCourse.setFont(F_label_academicCourse);
        main_panel.add(academicCourse);
        //to add Academic Course
        courseID_Aca = new JLabel("Course ID");
        courseID_Aca.setBounds(35, 30, 90, 30);
        courseID_Aca.setFont(label_Font);
        panel_left_Academic.add(courseID_Aca);
        
        field_CourseID_Aca = new JTextField();
        field_CourseID_Aca.setBounds(220, 20, 230, 50);
        field_CourseID_Aca.setFont(label_Font);
        panel_left_Academic.add(field_CourseID_Aca);

        courseName_Aca = new JLabel("Course Name");
        courseName_Aca.setBounds(35, 100, 100, 30);
        courseName_Aca.setFont(label_Font);
        panel_left_Academic.add(courseName_Aca);
        
        field_CourseName_Aca = new JTextField();
        field_CourseName_Aca.setBounds(220, 90, 270, 50);
        field_CourseName_Aca.setFont(label_Font);
        panel_left_Academic.add(field_CourseName_Aca);
        
        duration = new JLabel("Duration");
        duration.setBounds(35, 170, 100, 30);
        duration.setFont(label_Font);
        panel_left_Academic.add(duration);        
        
        field_Duration_Aca = new JTextField();
        field_Duration_Aca.setBounds(220, 160, 270, 50);
        field_Duration_Aca.setFont(label_Font);
        panel_left_Academic.add(field_Duration_Aca);
        
        level = new JLabel("Level");
        level.setBounds(35, 240, 100, 30);
        level.setFont(label_Font);
        panel_left_Academic.add(level);  
        

        field_Level = new JTextField();
        field_Level.setBounds(220, 230, 270, 50);
        field_Level.setFont(label_Font);
        panel_left_Academic.add(field_Level);
        
        credit = new JLabel("Credit");
        credit.setBounds(35, 310, 180, 30);
        credit.setFont(label_Font);
        panel_left_Academic.add(credit); 
        
        field_Credit = new JTextField();
        field_Credit.setBounds(220, 300, 270, 50);
        field_Credit.setFont(label_Font);
        panel_left_Academic.add(field_Credit);
        
        numberOfAssessments = new JLabel("Number Of Assessment");
        numberOfAssessments.setBounds(35, 380, 180, 30);
        numberOfAssessments.setFont(label_Font);
        panel_left_Academic.add(numberOfAssessments); 
        
        field_NumberOfAssessments = new JTextField();
        field_NumberOfAssessments.setBounds(220, 370, 270, 50);
        field_NumberOfAssessments.setFont(label_Font);
        panel_left_Academic.add(field_NumberOfAssessments);
        
        
        //Button to add Academic Course
        button_Add_Aca = new JButton("Add Course");
        button_Add_Aca.setBounds(35, 450, 440, 50);
        button_Add_Aca.setFont(Button_Font);
        button_Add_Aca.addActionListener(this);
        panel_left_Academic.add(button_Add_Aca);
        
        
        //Button for changing the Academic form to Non Academic Form
        button_NonAcademic = new JButton("For Non-Academic Course >>");
        button_NonAcademic.setBounds(620, 150, 400, 50);
        button_NonAcademic.setFont(Button_Font);
        button_NonAcademic.addActionListener(this);
        main_panel.add(button_NonAcademic);

        //To register Academic Course
        courseLeader = new JLabel("Course Leader");
        courseLeader.setBounds(35, 30, 130, 30); 
        courseLeader.setFont(label_Font);
        panel_right_Academic.add(courseLeader);
        

        field_CourseLeader_Aca = new JTextField();
        field_CourseLeader_Aca.setBounds(170, 20, 270, 50);
        field_CourseLeader_Aca.setFont(label_Font);
        panel_right_Academic.add(field_CourseLeader_Aca);


        lecturerName = new JLabel("Lecturer Name");
        lecturerName.setBounds(35, 100, 130, 30);
        lecturerName.setFont(label_Font);
        panel_right_Academic.add(lecturerName);        
        

        field_LecturerName = new JTextField();
        field_LecturerName.setBounds(170, 90, 270, 50);
        field_LecturerName.setFont(label_Font);
        panel_right_Academic.add(field_LecturerName);
       



        //year
        Integer year_list[] = new Integer[31];
        int  year= 2015;
        for (int i = 0; i <= 30; i++){
            year_list[i] = year;
            year++;
        }
        
        //month
        String[] month_list = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", 
                               "December"};
        
        //day
        Integer day_list[] = new Integer[32];
        int day = 1;
        for(int i = 0; i<= 31; i++){
            day_list[i] = day;
            day++;
        }
        
        startDate = new JLabel("Start Date");
        startDate.setBounds(35, 170, 100, 30);
        startDate.setFont(label_Font);
        panel_right_Academic.add(startDate);   
        
        //Combo box for registering starting date of the Academic Course 
        start_Year_Box_A = new JComboBox(year_list);
        start_Year_Box_A.setBounds(170, 160, 90, 50);
        start_Year_Box_A.setVisible(true);
        start_Year_Box_A.setFont(label_Font);
        panel_right_Academic.add(start_Year_Box_A);
        
        start_Month_Box_A = new JComboBox(month_list);
        start_Month_Box_A.setBounds(260, 160, 130, 50);
        start_Month_Box_A.setVisible(true);
        start_Month_Box_A.setFont(label_Font);
        panel_right_Academic.add(start_Month_Box_A);
        
        start_Day_Box_A = new JComboBox(day_list);
        start_Day_Box_A.setBounds(390, 160, 70, 50);
        start_Day_Box_A.setVisible(true);
        start_Day_Box_A.setFont(label_Font);
        panel_right_Academic.add(start_Day_Box_A);

        completionDate = new JLabel("Completion Date");
        completionDate.setBounds(35, 240, 150, 30);
        completionDate.setFont(label_Font);
        panel_right_Academic.add(completionDate); 

        //Combo box for registering Completion date of the Academic Course 
        complete_Year_Box_A = new JComboBox(year_list);
        complete_Year_Box_A.setBounds(170, 230, 90, 50);
        complete_Year_Box_A.setVisible(true);
        complete_Year_Box_A.setFont(label_Font);
        panel_right_Academic.add(complete_Year_Box_A);
        
        complete_Month_Box_A = new JComboBox(month_list);
        complete_Month_Box_A.setBounds(260, 230, 130, 50);
        complete_Month_Box_A.setVisible(true);
        complete_Month_Box_A.setFont(label_Font);
        panel_right_Academic.add(complete_Month_Box_A);
             
        complete_Day_Box_A = new JComboBox(day_list);
        complete_Day_Box_A.setBounds(390, 230, 70, 50);
        complete_Day_Box_A.setVisible(true);
        complete_Day_Box_A.setFont(label_Font);
        panel_right_Academic.add(complete_Day_Box_A);
        
        //Button to register Academic Course
        button_Register_Aca = new JButton("Register Course");
        button_Register_Aca.setBounds(40, 300, 380, 50);
        button_Register_Aca.setFont(Button_Font);
        button_Register_Aca.addActionListener(this);
        panel_right_Academic.add(button_Register_Aca);

        //For adding Non-Academic Course
        button_Academic = new JButton("<< For Academic Course");
        button_Academic.setBounds(70, 150, 400, 50);
        Font F_Aca = new Font("Times New Roman", Font.BOLD, 18);
        button_Academic.setFont(F_Aca);
        button_Academic.addActionListener(this);
        main_panel.add(button_Academic);
        
        courseID_NonAca = new JLabel("Course ID");
        courseID_NonAca.setBounds(35, 30, 90, 30);
        courseID_NonAca.setFont(label_Font);
        panel_left_NonAcademic.add(courseID_NonAca);
        
        field_CourseID_NonAca = new JTextField();
        field_CourseID_NonAca.setBounds(160, 20, 230, 50);
        field_CourseID_NonAca.setFont(label_Font);
        panel_left_NonAcademic.add(field_CourseID_NonAca);

        courseName_NonAca = new JLabel("Course Name");
        courseName_NonAca.setBounds(35, 100, 100, 30);
        courseName_NonAca.setFont(label_Font);
        panel_left_NonAcademic.add(courseName_NonAca);
        
        field_CourseName_NonAca = new JTextField();
        field_CourseName_NonAca.setBounds(160, 90, 270, 50);
        field_CourseName_NonAca.setFont(label_Font);
        panel_left_NonAcademic.add(field_CourseName_NonAca);
        duration = new JLabel("Duration");
        duration.setBounds(35, 170, 100, 30);
        duration.setFont(label_Font);
        panel_left_NonAcademic.add(duration);        
        
        field_Duration_NonAca = new JTextField();
        field_Duration_NonAca.setBounds(160, 160, 270, 50);
        field_Duration_NonAca.setFont(label_Font);
        panel_left_NonAcademic.add(field_Duration_NonAca);
        
        prerequisite = new JLabel("Prerequisite");
        prerequisite.setBounds(35, 240, 100, 30);
        prerequisite.setFont(label_Font);
        panel_left_NonAcademic.add(prerequisite);  
        field_Prerequisite = new JTextField();
        field_Prerequisite.setBounds(160, 230, 270, 50);
        field_Prerequisite.setFont(label_Font);
        panel_left_NonAcademic.add(field_Prerequisite);
        
        //Button to Add Non Academic Course
        button_Add_NonAca = new JButton("Add Course");
        button_Add_NonAca.setBounds(35, 310, 180, 50);
        button_Add_NonAca.setFont(Button_Font);
        button_Add_NonAca.addActionListener(this);
        panel_left_NonAcademic.add(button_Add_NonAca);
        
        button_Remove_NonAca = new JButton("Remove Course");
        button_Remove_NonAca.setBounds(240, 310, 180, 50);
        button_Remove_NonAca.setFont(Button_Font);
        button_Remove_NonAca.addActionListener(this);
        panel_left_NonAcademic.add(button_Remove_NonAca);
        
        

        //Labels and text fields to register Non-Academic Course
        instructorName = new JLabel("Instructor Name");
        instructorName.setBounds(35, 30, 130, 30);
        instructorName.setFont(label_Font);
        panel_right_NonAcademic.add(instructorName);  
        
        field_InstructorName = new JTextField();
        field_InstructorName.setBounds(170, 30, 270, 50);
        field_InstructorName.setFont(label_Font);
        panel_right_NonAcademic.add(field_InstructorName);

        courseLeader = new JLabel("Course Leader");
        courseLeader.setBounds(35, 100, 130, 30); 
        courseLeader.setFont(label_Font);
        panel_right_NonAcademic.add(courseLeader);
        
        field_CourseLeader_NonAca = new JTextField();
        field_CourseLeader_NonAca.setBounds(170, 90, 270, 50);
        field_CourseLeader_NonAca.setFont(label_Font);
        panel_right_NonAcademic.add(field_CourseLeader_NonAca);

        startDate = new JLabel("Start Date");
        startDate.setBounds(35, 170, 100, 30);
        startDate.setFont(label_Font);
        panel_right_NonAcademic.add(startDate);   
        
        //Combo box for registering starting date of the Non-Academic Course 
        start_Year_Box_NA = new JComboBox(year_list);
        start_Year_Box_NA.setBounds(170, 160, 90, 50);
        start_Year_Box_NA.setVisible(true);
        start_Year_Box_NA.setFont(label_Font);
        panel_right_NonAcademic.add(start_Year_Box_NA);
        

        start_Month_Box_NA = new JComboBox(month_list);
        start_Month_Box_NA.setBounds(260, 160, 130, 50);
        start_Month_Box_NA.setVisible(true);
        start_Month_Box_NA.setFont(label_Font);
        panel_right_NonAcademic.add(start_Month_Box_NA);
        
        start_Day_Box_NA = new JComboBox(day_list);
        start_Day_Box_NA.setBounds(390, 160, 70, 50);
        start_Day_Box_NA.setVisible(true);
        start_Day_Box_NA.setFont(label_Font);
        panel_right_NonAcademic.add(start_Day_Box_NA);

        completionDate = new JLabel("Completion Date");
        completionDate.setBounds(35, 240, 150, 30);
        completionDate.setFont(label_Font);
        panel_right_NonAcademic.add(completionDate); 
        
        //Combo box for registering Completion date of the Non-Academic Course
        complete_Year_Box_NA = new JComboBox(year_list);
        complete_Year_Box_NA.setBounds(170, 230, 90, 50);
        complete_Year_Box_NA.setVisible(true);
        complete_Year_Box_NA.setFont(label_Font);
        panel_right_NonAcademic.add(complete_Year_Box_NA);
        
        complete_Month_Box_NA = new JComboBox(month_list);
        complete_Month_Box_NA.setBounds(260, 230, 130, 50);
        complete_Month_Box_NA.setVisible(true);
        complete_Month_Box_NA.setFont(label_Font);
        panel_right_NonAcademic.add(complete_Month_Box_NA);
        
        complete_Day_Box_NA = new JComboBox(day_list);
        complete_Day_Box_NA.setBounds(390, 230, 70, 50);
        complete_Day_Box_NA.setVisible(true);
        complete_Day_Box_NA.setFont(label_Font);
        panel_right_NonAcademic.add(complete_Day_Box_NA);
        
        examDate = new JLabel("Exam Date");
        examDate.setBounds(35, 310, 100, 30);
        examDate.setFont(label_Font);
        panel_right_NonAcademic.add(examDate);   
        
        //Combo box for registering Exam date of the Non-Academic Course
        exam_Year_Box_NA = new JComboBox(year_list);
        exam_Year_Box_NA.setBounds(170, 300, 90, 50);
        exam_Year_Box_NA.setVisible(true);
        exam_Year_Box_NA.setFont(label_Font);
        panel_right_NonAcademic.add(exam_Year_Box_NA);

        exam_Month_Box_NA = new JComboBox(month_list);
        exam_Month_Box_NA.setBounds(260, 300, 130, 50);
        exam_Month_Box_NA.setVisible(true);
        exam_Month_Box_NA.setFont(label_Font);
        panel_right_NonAcademic.add(exam_Month_Box_NA);
    
        exam_Day_Box_NA = new JComboBox(day_list);
        exam_Day_Box_NA.setBounds(390, 300, 70, 50);
        exam_Day_Box_NA.setVisible(true);
        exam_Day_Box_NA.setFont(label_Font);
        panel_right_NonAcademic.add(exam_Day_Box_NA);
        
        //Button to register Non-Academic Course
        button_Register_NonAca = new JButton("Register Course");
        button_Register_NonAca.setBounds(40, 370, 380, 50);
        button_Register_NonAca.setFont(Button_Font);
        button_Register_NonAca.addActionListener(this);
        panel_right_NonAcademic.add(button_Register_NonAca);
       

        //Button to display the details of the course
        button_Display_Aca = new JButton("Display");
        button_Display_Aca.setBounds(620, 610, 190, 50);
        button_Display_Aca.setFont(Button_Font);
        button_Display_Aca.addActionListener(this);
        main_panel.add(button_Display_Aca);
        //Button to display the details of the course
        button_Display_NonAca = new JButton("Display");
        button_Display_NonAca.setBounds(610, 610, 190, 50);
        button_Display_NonAca.setFont(Button_Font);
        button_Display_NonAca.addActionListener(this);
        main_panel.add(button_Display_NonAca);
        
        //Button to clear the entered values
        button_Clear = new JButton("Clear");
        button_Clear.setBounds(830, 610, 190, 50);
        button_Clear.setFont(Button_Font);
        button_Clear.addActionListener(this);
        main_panel.add(button_Clear);
        
        button_Academic.setVisible(false);
        panel_left_Academic.setVisible(true);
        panel_right_Academic.setVisible(true);
        panel_left_NonAcademic.setVisible(false);
        panel_right_NonAcademic.setVisible(false);
        button_Display_NonAca.setVisible(false);
        button_Display_Aca.setVisible(true);
        
        frame.add(main_panel);
        frame.setBounds(200, 50, 1100, 750);
        frame.setResizable(true);
        frame.setVisible(true);
        
        
        //windowListener interface with a windowAdapter in parameter class is added to the frame
        frame.addWindowListener(new WindowAdapter() {
            /*
             * executed when the user attempts to close the window 
             * asks user to confirm if they want to close the window
            */
            public void windowClosing(WindowEvent e) {
                //for dialog box with options 
                int confirmExit = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit the program?", "Exit Program Message Box",
                JOptionPane.YES_NO_OPTION);
                
                if (confirmExit == JOptionPane.YES_OPTION) {
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                } 
                else{
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }
    
    /*
     * This is a getter method for attribute "field_CourseID_Aca" of the class
     * 
     * @return - value of the attribute of the class which is returned by the method getText from the text field
    */    
    public String getCourseID_Aca()
    {
        return this.field_CourseID_Aca.getText();
    }
    
    /*
     * This is a getter method for attribute "field_CourseName_Aca" of the class
     * 
     * @return - value of the attribute of the class which is returned by the method getText from the text field
    */    
    public String getCourseName_Aca()
    {
        return this.field_CourseName_Aca.getText();
    }
    
    /*
     * This is a getter method for attribute "field_Duration_Aca" of the class
     * The parseInt function parses a string argument and returns an integer for the attribute field_Duration_Aca
     * 
     * @return - value of the attribute of the class which is returned by the method getText from the text field
    */    
    public int getDuration_Aca()
    { 
        return Integer.parseInt(this.field_Duration_Aca.getText());
    }
    
    /*
     * This is a getter method for attribute "field_Level" of the class
     * 
     * @return - value of attribute "field_Level" of the class which is returned by the method getText from the text field
    */    
    public String getLevel()
    {
        return this.field_Level.getText();
    }
    /*
     * This is a getter method for attribute "field_Credit" of the class
     * 
     * @return - value of the attribute of the class which is returned by the method getText from the text field
    */  
    public String getCredit()
    { 
        return  this.field_Credit.getText();
    }
    
    /*
     * This is a getter method for attribute "field_NumberOfAssessments" of the class
     * The parseInt function parses a string argument and returns an integer for the attribute field_NumberOfAssessments
     * 
     * @return - value of the attribute of the class which is returned by the method getText from the text field
    */    
    public int getNumberOfAssessments()
    {
        return Integer.parseInt(this.field_NumberOfAssessments.getText());
    }
    
    /*
     * This is a getter method for attribute "field_CourseLeader" of the class
     * 
     * @return - value of the attribute of the class which is returned by the method getText from the text field
    */  
    public String getCourseLeader_Aca()
    {
        return this.field_CourseLeader_Aca.getText();
    }
    
    /*
     * This is a getter method for attribute "field_LecturerName" of the class
     * 
     * @return - value of the attribute of the class which is returned by the method getText from the text field
    */  
    public String getLecturerName()
    {
        return this.field_LecturerName.getText();
    }
    
    /*
     * This is a getter method which is used to get access to the value of instance variables Start year, month and day of the Academic Course
     * The year, month and date are concatenated and stored in a new  variable
     * 
     * @return - concatenated value of Starting Date using variable "startDate1" 
    */
    public String getStartDate_Aca()
    {
        String startDate1 = start_Year_Box_A.getSelectedItem() + " " +start_Month_Box_A.getSelectedItem() + " " + 
                            start_Day_Box_A.getSelectedItem();
        return startDate1;
    }
    
    /*
     * This is a getter method which is used to get access to the value of instance variables Completion year, month and day of the Academic Course
     * The year, month and date are concatenated and stored in a new variable
     * 
     * @return - concatenated value of Completion Date using variable "completeDate1" 
    */
    public String getCompletionDate_Aca()
    {
        String completeDate1 = complete_Year_Box_A.getSelectedItem() + " " + complete_Month_Box_A.getSelectedItem() + " " + 
                               complete_Day_Box_A.getSelectedItem();
        return completeDate1;
    }
    
    /*
     * This is a getter method for attribute "field_CourseID_NonAca" of the class
     * 
     * @return - value of the attribute of the class which is returned by the method getText 
     from the text field
    */  
    public String getCourseID_NonAca()
    {
        return this.field_CourseID_NonAca.getText();
    }

      /*
     * This is a getter method for attribute "field_CourseID_NonAca" of the class
     * 
     * @return - value of the attribute of the class which is returned by the method getText 
     from the text field
    */  
    public String getCourseName_NonAca()
    {
        return this.field_CourseName_NonAca.getText();
    }

    /*
     * This is a getter method for attribute "field_Duration_NonAca" of the class
     * The parseInt function parses a string argument and returns an integer for the attribute 
         field_Duration_NonAca
     * 
     * @return - value of the attribute of the class which is returned by the method getText 
      from the text field
    */    
    public int getDuration_NonAca()
    { 
        return Integer.parseInt(this.field_Duration_NonAca.getText());
    }
    
    /*
     * This is a getter method for "attribute field_Prerequisite" of the class
     * 
     * @return - value of the attribute of the class which is returned by the method getText from the text field
    */  
    public String getPrerequisite()
    {
        return this.field_Prerequisite.getText();
    }
    
    /*
     * This is a getter method for attribute "field_InstructorName" of the class
     * 
     * @return - value of the attribute of the class which is returned by the method getText from the text field
    */  
    public String getInstructorName()
    {
        return this.field_InstructorName.getText();
    }
    
    /*
     * This is a getter method for attribute "field_CourseLeader" of the class
     * 
     * @return - value of the attribute of the class which is returned by the method getText from the text field
    */  
    public String getCourseLeader_NonAca()
    {
        return this.field_CourseLeader_NonAca.getText();
    }
    
    /*
     * This is a getter method which is used to get access to the value of instance variables Starting year, month and day of the Non-Academic Course
     * The year, month and date are concatenated and stored in new variable
     * 
     * @return - concatenated value of Starting Date using reference variable "startDate2" 
    */
     public String getStartDate_NonAca()
    {
        String startDate2 = start_Year_Box_NA.getSelectedItem() + " " + start_Month_Box_NA.getSelectedItem() + " " +  
        start_Day_Box_NA.getSelectedItem();
        return startDate2;
    }
    
    /*
     * This is a getter method which is used to get access to the value of instance variables Completion year, month and day of the Non-Academic Course
     * The year, month and date are concatenated and stored in new variable
     * 
     * @return - concatenated value of Completion Date using variable "completeDate2" 
    */
    public String getCompletionDate_NonAca()
    {
        String completeDate2 = complete_Year_Box_NA.getSelectedItem() + " " + complete_Month_Box_NA.getSelectedItem() + " " + 
        complete_Day_Box_NA.getSelectedItem();
        return completeDate2;
    }
    
    /*
     * This is a getter method which is used to get access to the value of instance variables Exam year, month and day of the Non-Academic Course
     * The year, month and date are concatenated and stored in new variable
     * 
     * @return - concatenated value of Exam Date using variable "examDate" 
    */
    public String getExamDate()
    {
        String examDate = exam_Year_Box_NA.getSelectedItem() + " " + exam_Month_Box_NA.getSelectedItem() + " " + 
        exam_Day_Box_NA.getSelectedItem();
        return examDate;
    }
    
    /*
     * This method is created to set the text fields and combo boxes of the form to empty 
     * It is called in teh actionPerformed method and executed when the button clear is  clicked 
    */
    public void clearFields(){
        field_CourseID_Aca.setText("");
        field_CourseName_Aca.setText("");
        field_Duration_Aca.setText("");
        field_Level.setText("");
        field_Credit.setText("");
        field_NumberOfAssessments.setText("");
        field_CourseLeader_Aca.setText("");
        field_LecturerName.setText("");
        field_CourseID_NonAca.setText("");
        field_CourseName_NonAca.setText("");
        field_Duration_NonAca.setText("");
        field_Prerequisite.setText("");
        field_InstructorName.setText("");
        field_CourseLeader_NonAca.setText("");
        
        //combobox of Academic Course 
        start_Year_Box_A.setSelectedIndex(0);
        start_Month_Box_A.setSelectedIndex(0);
        start_Day_Box_A.setSelectedIndex(0);
        
        complete_Year_Box_A.setSelectedIndex(0);
        complete_Month_Box_A.setSelectedIndex(0);
        complete_Day_Box_A.setSelectedIndex(0);
        
        //combobox of Non-Academic Course 
        start_Year_Box_NA.setSelectedIndex(0);
        start_Month_Box_NA.setSelectedIndex(0);
        start_Day_Box_NA.setSelectedIndex(0);
        
        complete_Year_Box_NA.setSelectedIndex(0);
        complete_Month_Box_NA.setSelectedIndex(0);
        complete_Day_Box_NA.setSelectedIndex(0);
        
        exam_Year_Box_NA.setSelectedIndex(0);
        exam_Month_Box_NA.setSelectedIndex(0);
        exam_Day_Box_NA.setSelectedIndex(0);   
        
    }
    
    /*
     * This method is created to change the labels, panels and buttons of Academic Course form to Non-Academic Course form by changing the 
     * visibility of the components
     * It is called in the actionPerformed method
    */
    public void nonAcademicVisibility()
    {
        academicCourse.setText("Non Academic Course");
        panel_left_Academic.setVisible(false);
        panel_right_Academic.setVisible(false);
        panel_left_NonAcademic.setVisible(true);
        panel_right_NonAcademic.setVisible(true);
        button_NonAcademic.setVisible(false);
        button_Academic.setVisible(true);
        button_Display_NonAca.setVisible(true);
        button_Display_Aca.setVisible(false);   
    }
    
    /*
     * This method handles all the actions of the components
     * The code defined in it is to be executed when an action is performed.
    **/
    public void actionPerformed(ActionEvent e)
    {   
        //method to change the academic form to non-academic is called when button"button_NonAcademic"is pressed
        if(e.getSource() == button_NonAcademic)  
        {
            nonAcademicVisibility();
        }
        //non-academic form  is changed to academic when the button "button_Academic" is pressed
        else if(e.getSource() == button_Academic){     
            gUI();
        }
        // -----method to clears all the text fields is called when the button "button_Clear" is pressed-----
        else if(e.getSource() == button_Clear){
            clearFields();
        }

        /*----- Adding Academic Course with the provided values -----
         * entered course id is compared to the existing course id 
         * object of AcademicCourse is created and added the arrayList. 
        
         */else if(e.getSource() == button_Add_Aca){
            //checks if any field is empty
            if (getCourseID_Aca().equals("")|| getCourseName_Aca().equals("")||field_Duration_Aca.getText().equals("")||getLevel().equals("")||
            field_Credit.getText().equals("")||field_NumberOfAssessments.getText().equals("")){
                 JOptionPane.showMessageDialog(frame, "Error : Please fill in all the fields.","Error",JOptionPane.WARNING_MESSAGE);
            }
            else{
                boolean notPresent_A = true;
                for (Course course : courseList){
                    //checks if the academic course is already added 
                    if (course.getCourseId().equals(getCourseID_Aca())){
                        //message to be shown if the Course Id is already registered
                        JOptionPane.showMessageDialog( frame, "The Academic Course with Course ID : " + getCourseID_Aca() + 
                        " has already been added.\n");
                        
                        notPresent_A = false;                    
                        System.out.println("The Academic Course with Course ID : " + getCourseID_Aca() + " has already been added. \n");  
                    }
                }
            
                if (notPresent_A){
                    //Exception handling to check the datatype of the entered value
                    try{
                         getDuration_Aca();
                         getNumberOfAssessments();
                         
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog( frame, "Error : Please enter the data in correct format.","Error",
                        JOptionPane.WARNING_MESSAGE);
                       
                    }
                    //object of class Academic Course is created with the help of the constructor of class Academic Course

                    object_Academic = new AcademicCourse(getCourseID_Aca(),getCourseName_Aca(), getDuration_Aca(), getLevel(), getCredit(), 
                    getNumberOfAssessments()); 
                    
                    courseList.add(object_Academic);
                    JOptionPane.showMessageDialog( frame, "The Academic Course with Course ID : " + getCourseID_Aca() + 
                    " is successfully added to the list with following details : \n"+ "Course Name : "+ getCourseName_Aca() + "\n" + 
                    "Duration : " + getDuration_Aca() + "\n" + "Level : "  + getLevel() + "\n"+ "Credit : "  + getCredit() + "\n" + 
                    "Number of Assessments : " + getNumberOfAssessments() + "\n");
                }
            }
        }
         /*----- Adding Non-Academic Course with the provided values -----
          * entered course id is compared to the existing course id 
          * object of NonAcademicCourse is created and added the arrayList. 
          */
        else if(e.getSource() == button_Add_NonAca){
            //checks if any field is left empty
            if (getCourseID_NonAca().equals("")|| getCourseName_NonAca().equals("")|| field_Duration_NonAca.getText() .equals("")|| 
            getPrerequisite().equals("")){
                JOptionPane.showMessageDialog( frame, "Error : Please fill in all  the fields","Error",JOptionPane.WARNING_MESSAGE);  
            }
            else{
                boolean notPresent_NA = true;
                for (Course course : courseList){
                    //checks if the non-academic course is already registered
                    if (course.getCourseId().equals(getCourseID_NonAca())){
                        JOptionPane.showMessageDialog( frame, "The Non-Academic Course with Course ID : " + getCourseID_NonAca() + 
                        " has already been added. \n");
                        notPresent_NA = false;
                        System.out.println("The Non-Academic Course with Course ID : " + getCourseID_NonAca() + " has already been added. \n");
                
                    }
                }
                
                if(notPresent_NA){
                    //Exception handling to check the datatype of the entered value 
                    try{ 
                        getDuration_NonAca();
                        
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(frame, "Error : Please enter the data in correct format.","Error",
                        JOptionPane.WARNING_MESSAGE);
                            
                    } 
                    //new object of class NonAcademic Course is created using the constructor of class NonAcademicCourse
                    object_NonAcademic = new NonAcademicCourse(getCourseID_NonAca(), getCourseName_NonAca(), getDuration_NonAca(), 
                    getPrerequisite());
                        
                    courseList.add(object_NonAcademic);
                    JOptionPane.showMessageDialog( frame, "The Non-Academic Course with Course ID : " + getCourseID_NonAca() +
                    " is successfully added to the list with following details : \n" + "Course Name : "+ getCourseName_NonAca() + "\n" +
                    "Duration : " + getDuration_NonAca() + "\n" + "Prerequisite : "  + getPrerequisite() + "\n");  
                }
            } 
        }        
        
         /*----- Registering Academic Course using Course Id provided values ----
          * action to be perfomed when the button "Register" is clicked
          * entered course id is compared to the existing course id 
          * checks if the object of class Course is an instance of class AcademicCourse
          */
        else if(e.getSource() == button_Register_Aca){
            //to check if any field is left empty
            if (getCourseID_Aca().equals("") || getCourseLeader_Aca().equals("") || 
             getLecturerName().equals("")){
                JOptionPane.showMessageDialog(frame,"Error : Please fill in all the fields.", "Error",JOptionPane.WARNING_MESSAGE);
                
            }
            else{
                for (Course course : courseList){
                    if(course.getCourseId().equals(getCourseID_Aca()) && course instanceof AcademicCourse)
                    {
                        //down casting
                         AcademicCourse object_Academic  = (AcademicCourse) course;
                         if(object_Academic.isIsRegistered() == true)
                        {
                            JOptionPane.showMessageDialog( frame, "The Academic Course with Course ID : " + getCourseID_Aca() + 
                            " has already been registered." );
                           
                        }
                        //register method from class AcademicCourse is called to register the course
                        else if(object_Academic.isIsRegistered() == false){ 
                            object_Academic.register(getCourseLeader_Aca(), getLecturerName(),getStartDate_Aca(), getCompletionDate_Aca());
                            JOptionPane.showMessageDialog( frame, "The Academic Course with Course ID : " + getCourseID_Aca() +
                            " has been  registered successfully with following details : \n" + "Course Leader : " +getCourseLeader_Aca() + 
                            "\n" + "Lecturer Name : " + getLecturerName() + "\n" + "Start Date :"  + getStartDate_Aca() + "\n"+ 
                            "Completion Date : " + getCompletionDate_Aca() + "\n");
                                                          
                        }
                    }
                }
            }
            
        }
        /*----- For displaying the details of Academic Course -----
           * checks if the object of class Course is an instance of the class AcademicCourse
           * display method from class AcademicCourse is called 
           */
        else if(e.getSource() == button_Display_Aca){
            for (Course course : courseList){ 
                if(course instanceof AcademicCourse){
                    //down casting
                    AcademicCourse object_Academic = (AcademicCourse) course;
                    object_Academic.display();
                    
                }
            }   
        }
        /*----- Registering Non-Academic Course using Course Id provided values ----
          * action to be performed when the button "Register" is clicked
          * entered course id is compared to the existing course id 
          * checks if the object of class Course is an instance of class NonAcademicCourse
          */
        else if(e.getSource() == button_Register_NonAca){
            
            if (getCourseID_NonAca().equals("") || getCourseLeader_NonAca().equals("") ||  getInstructorName().equals("")){
                JOptionPane.showMessageDialog(frame, "Error : Please fill in all the fields.","Error",JOptionPane.WARNING_MESSAGE);
                
            }
            else{
                for (Course course : courseList){
                    if(course.getCourseId().equals(getCourseID_NonAca())&&course instanceof NonAcademicCourse){
                        //down casting
                        NonAcademicCourse object_NonAcademic  = (NonAcademicCourse) course;
                        if(object_NonAcademic.isIsRegistered() == true){
                           JOptionPane.showMessageDialog( frame, "The Non-Academic Course with Course ID : " + getCourseID_NonAca() +
                           " has been already registered." );
                                                                                   
                        }
                        else if(object_NonAcademic.isIsRegistered() == false){ 
                            object_NonAcademic.register(getCourseLeader_NonAca(), getInstructorName(),getStartDate_NonAca(),
                            getCompletionDate_NonAca(), getExamDate());
                            JOptionPane.showMessageDialog( frame, "The Non-Academic Course with Course ID : " + getCourseID_NonAca() + 
                            " has been registered successfully with following details : \n" + "Course Leader : "+ getCourseLeader_NonAca() +
                            "\n" + "Instructor Name : " + getInstructorName() + "\n" + "Start Date : "   + getStartDate_NonAca() + "\n"+  
                            "Completion Date : "  + getCompletionDate_NonAca() + "\n" + "Exam Date : " + getExamDate() + "\n" );
                            
                        }
                    }
                }
            }    
        }
        
         /*----- For displaying the details of Non-Academic Course -----
           * checks if the object of class Course is an instance of the class NonAcademicCourse
           * display method from class NonAcademicCourse is called 
           */
        else if(e.getSource() == button_Display_NonAca){
            for (Course course : courseList){
                if(course instanceof NonAcademicCourse){
                    //down casting
                    NonAcademicCourse object_NonAcademic = (NonAcademicCourse) course;
                    object_NonAcademic.display();
                    
                }
            }   
        }
         /*----- For removing Non-Academic Course using Course Id-----
          * entered course id is compared to the existing course id 
          * checks if the object of class Course is an instance of the class NonAcademicCourse
          * remove method form class NonAcademicCourse is called to remove the course
          */
        else if (e.getSource() == button_Remove_NonAca){
            if (getCourseID_NonAca().equals("")){
                JOptionPane.showMessageDialog(frame, "Error :Please enter the Course Id.","Error",JOptionPane.WARNING_MESSAGE);
                    }
            else{//to check that the course id is provided
                for (Course course : courseList){
                    //to check that the course id is provided
                    if (object_NonAcademic.isIsRemoved() == false){
                        if(course.getCourseId().equals(getCourseID_NonAca()) && course instanceof NonAcademicCourse){
                            //down casting
                            NonAcademicCourse object_NonAcademic = (NonAcademicCourse)course;
                            
                            object_NonAcademic.remove();
                            JOptionPane.showMessageDialog(frame, "The Non-Academic Course with Course ID : " + getCourseID_NonAca() + 
                            " has been removed");
                            System.out.println("The Non-Academic Course with Course ID : " + getCourseID_NonAca() + " has been removed. \n");
                        }
                    }
                    else {
                        if(course.getCourseId().equals(getCourseID_NonAca())){
                            JOptionPane.showMessageDialog(frame, "The course with Course Id : " + getCourseID_NonAca() +
                            " has been already removed.");
                        }
                    }
                }
            }
        }
        }
    
    /*
     * This is a main method for the INGCollege class 
    */
    public static void main(String[] args)
    {
        //creating an object of INGCollege class
        INGCollege object1 = new INGCollege();
        object1.gUI();
    }
}
