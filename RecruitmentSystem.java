

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;
import javax.swing.*;

public class RecruitmentSystem extends JPanel {
    private JLabel Vacancy;
    private JLabel JobType;
    private JLabel StaffName;
    private JLabel Qualification;
    private JTextField vacancyText;
    private JTextField jobTypeText;
    private JTextField staffNameText;
    private JTextField qualificationText;
    private JLabel Designation;
    private JLabel JobDate;
    private JLabel Appointed;
    private JLabel jcomp12;
    private JTextField designationText;
    private JTextField jobDateText;
    private JTextField AppointedText;
    private JTextField salaryText;
    private JRadioButton Joined;
    private JLabel weeklyFractionHoursLabel;
    private JLabel jcomp19;
    private JTextField weefFractionalText;
    private JTextField wegesText;
    private JLabel jcomp22;
    private JLabel shifts;
    private JTextField WorkingHoursText;
    private JTextField shiftsText;
    private JButton fulltimeStaffButton;
    private JButton partimeButton;
    private JButton salaryButton;
    private JButton workingShiftsButton;
    private JButton terminateButton;
    private JTextField displayNumberText;
    private JButton displayNumberButton;
    private JLabel jcomp33;
    private JTextArea displayAreaTex;
    private JLabel jcomp37;
    private JLabel jcomp38;
    private JLabel jcomp39;
    private JLabel jcomp40;
    private JButton clearButton;

    private ArrayList<StaffHire> staffHires;
    private JScrollPane scrollPane;
    private  int click;
    private int click1;
    private  int click2;
    private int click3;
    private int click4;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Recruitment System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new RecruitmentSystem());
        frame.pack();
        frame.setVisible(true);
    }


    public RecruitmentSystem() {


        //construct components
        staffHires = new ArrayList<>();
        Vacancy = new JLabel("Vacancy:");
        JobType = new JLabel("Job Type:");
        StaffName = new JLabel("Staff Name:");
        Qualification = new JLabel("Qualification:");
        vacancyText = new JTextField(5);
        jobTypeText = new JTextField(5);
        staffNameText = new JTextField(5);
        qualificationText = new JTextField(5);
        Designation = new JLabel("Designation:");
        JobDate = new JLabel("Job Date:");
        Appointed = new JLabel("Appointed By:");
        jcomp12 = new JLabel("Salary:");
        designationText = new JTextField(5);
        jobDateText = new JTextField(5);
        AppointedText = new JTextField(5);
        salaryText = new JTextField(5);
        Joined = new JRadioButton("Joined");
        weeklyFractionHoursLabel = new JLabel("Weekly Fractional Hours:");
        jcomp19 = new JLabel("Wages Per Hours:");
        weefFractionalText = new JTextField(5);
        wegesText = new JTextField(5);
        jcomp22 = new JLabel("Working Hours:");
        shifts = new JLabel("Shifts");
        WorkingHoursText = new JTextField(5);
        shiftsText = new JTextField(5);
        fulltimeStaffButton = new JButton("Add Fulltime Staff");
        partimeButton = new JButton("Add Parttime Staff");
        salaryButton = new JButton("Add Salary");
        workingShiftsButton = new JButton("Add Working Shifts");
        terminateButton = new JButton("Terminate");
        displayNumberText = new JTextField(5);
        displayNumberButton = new JButton("Display Number");
        jcomp33 = new JLabel("Display Number:");
        displayAreaTex = new JTextArea(5, 5);
        jcomp37 = new JLabel("Display:");
        jcomp38 = new JLabel("Each button you have to press to twice");
        jcomp39 = new JLabel("The first time it will give you which field must be fill.");
        jcomp40 = new JLabel("The second time will send the application");
        clearButton = new JButton("clear");
        scrollPane = new JScrollPane(displayAreaTex);
        click = 0;
        click1 =0;
        click2 =0;
        click3 = 0;
        click4 = 0;

        //adjust size and set layout
        setPreferredSize(new Dimension(950, 550));
        setLayout(null);

        //add components
        add(Vacancy);
        add(JobType);
        add(StaffName);
        add(Qualification);
        add(vacancyText);
        add(jobTypeText);
        add(staffNameText);
        add(qualificationText);
        add(Designation);
        add(JobDate);
        add(Appointed);
        add(jcomp12);
        add(designationText);
        add(jobDateText);
        add(AppointedText);
        add(salaryText);
        add(Joined);
        add(weeklyFractionHoursLabel);
        add(jcomp19);
        add(weefFractionalText);
        add(wegesText);
        add(jcomp22);
        add(shifts);
        add(WorkingHoursText);
        add(shiftsText);
        add(fulltimeStaffButton);
        add(partimeButton);
        add(salaryButton);
        add(workingShiftsButton);
        add(terminateButton);
        add(displayNumberText);
        add(displayNumberButton);
        add(jcomp33);
        add(displayAreaTex);
        add(scrollPane);
        add(jcomp37);
        add(jcomp38);
        add(jcomp39);
        add(jcomp40);
        add(clearButton);


        //set component bounds (only needed by Absolute Positioning)
        Vacancy.setBounds(15, 10, 100, 25);
        JobType.setBounds(15, 40, 100, 25);
        StaffName.setBounds(15, 70, 100, 25);
        Qualification.setBounds(15, 100, 100, 25);
        vacancyText.setBounds(165, 10, 130, 25);
        jobTypeText.setBounds(165, 40, 130, 25);
        staffNameText.setBounds(165, 70, 130, 25);
        qualificationText.setBounds(165, 100, 130, 25);
        Designation.setBounds(330, 10, 100, 25);
        JobDate.setBounds(330, 40, 100, 25);
        Appointed.setBounds(330, 70, 100, 25);
        jcomp12.setBounds(330, 100, 100, 25);
        designationText.setBounds(450, 10, 130, 25);
        jobDateText.setBounds(450, 40, 130, 25);
        AppointedText.setBounds(450, 70, 130, 25);
        salaryText.setBounds(450, 100, 130, 25);
        Joined.setBounds(450, 135, 100, 25);
        weeklyFractionHoursLabel.setBounds(15, 220, 146, 25);
        jcomp19.setBounds(15, 250, 106, 25);
        weefFractionalText.setBounds(165, 220, 132, 25);
        wegesText.setBounds(165, 250, 130, 25);
        jcomp22.setBounds(330, 220, 100, 25);
        shifts.setBounds(330, 250, 100, 25);
        WorkingHoursText.setBounds(450, 220, 130, 25);
        shiftsText.setBounds(450, 250, 130, 25);
        fulltimeStaffButton.setBounds(15, 300, 152, 25);
        partimeButton.setBounds(173, 300, 148, 25);
        salaryButton.setBounds(330, 300, 100, 25);
        workingShiftsButton.setBounds(450, 300, 150, 25);
        terminateButton.setBounds(173, 340, 100, 25);
        displayNumberText.setBounds(173, 375, 130, 25);
        displayNumberButton.setBounds(330, 375, 125, 25);
        jcomp33.setBounds(15, 375, 100, 25);
        displayAreaTex.setBounds(610, 175, 315, 480);
        jcomp37.setBounds(610, 140, 100, 25);
        jcomp38.setBounds(590, 10, 260, 25);
        jcomp39.setBounds(590, 40, 245, 35);
        jcomp40.setBounds(590, 75, 245, 30);
        clearButton.setBounds (470, 375, 100, 25);
        displayAreaTex.setEditable(false);

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        /***
         * Setting the texfield and button disable
         */

        vacancyText.setEnabled(false);
        jobTypeText.setEnabled(false);
        staffNameText.setEnabled(false);
        qualificationText.setEnabled(false);
        designationText.setEnabled(false);
        jobDateText.setEnabled(false);
        AppointedText.setEnabled(false);
        salaryText.setEnabled(false);


        weefFractionalText.setEnabled(false);
        WorkingHoursText.setEnabled(false);
        wegesText.setEnabled(false);
        shiftsText.setEnabled(false);




        /***
         * Setting some buttons disable
         */
        Joined.setEnabled(false);
        terminateButton.setEnabled(false);
        salaryButton.setEnabled(false);
        workingShiftsButton.setEnabled(false);


/***
 * This is the full time button
 * @fulltimeStaffButton
 *
 */
        fulltimeStaffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            click++;
            click1 =0;
            click2 =0;
            click3 =0;
            click4= 0;

                vacancyText.setEnabled(true);
                jobTypeText.setEnabled(true);
                staffNameText.setEnabled(true);
                qualificationText.setEnabled(true);
                designationText.setEnabled(true);
                jobDateText.setEnabled(true);
                AppointedText.setEnabled(true);
                salaryText.setEnabled(true);
                Joined.setEnabled(true);
                weefFractionalText.setEnabled(true);


                //set the false
                WorkingHoursText.setEnabled(false);
                wegesText.setEnabled(false);
                shiftsText.setEnabled(false);


                //set the button to true
                salaryButton.setEnabled(true);
                workingShiftsButton.setEnabled(true);
                terminateButton.setEnabled(true);


            if (click >= 2){
                fulltime();
            }

            }
        });
        /***
         * This is the partime button
         * @partimeButton
         */

        partimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                click1++;
                click =0;
                click2=0;
                click3= 0;
                click4= 0;

                vacancyText.setEnabled(true);
                jobTypeText.setEnabled(true);
                staffNameText.setEnabled(true);
                qualificationText.setEnabled(true);
                designationText.setEnabled(true);
                jobDateText.setEnabled(true);
                AppointedText.setEnabled(true);
                salaryText.setEnabled(true);
                WorkingHoursText.setEnabled(true);
                shiftsText.setEnabled(true);
                wegesText.setEnabled(true);
                salaryText.setEnabled(false);


                weefFractionalText.setEnabled(false);
                Joined.setEnabled(true);

                //set the button to true
                salaryButton.setEnabled(true);
                workingShiftsButton.setEnabled(true);
                terminateButton.setEnabled(true);

                if (click1 >= 2){
                    partTime();
                }

            }
        });


        /***
         * Terminate button I have to check this better to understand
         * @ terminateButton
         */

        terminateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                click4++;
                click = 0;
                click2 = 0;
                click1 = 0;
                click3 = 0;
                //set to true
                vacancyText.setEnabled(true);


                //set to false
                jobTypeText.setEnabled(false);
                qualificationText.setEnabled(false);
                designationText.setEnabled(false);
                jobDateText.setEnabled(false);
                AppointedText.setEnabled(false);
                WorkingHoursText.setEnabled(false);
                wegesText.setEnabled(false);
                weefFractionalText.setEnabled(false);
                shiftsText.setEnabled(false);
                staffNameText.setEnabled(false);
                salaryText.setEnabled(false);


                if (click4 >= 2) {
                    int number = getVacancy();

                    // check if number is valid
                    if (number < 0) {
                        JOptionPane.showMessageDialog(null, "Invalid vacancy number");
                        return;
                    }

                    try {


                        //using the Leaner search algorithm
                        for (int j = 0; j < staffHires.size(); j++) {

                            StaffHire staffHire = staffHires.get(j);
                            if (staffHire instanceof PartTimeStaffHire partTimeStaffHire) {

                                if (partTimeStaffHire.getVacancyNumber() == number) {

                                    displayAreaTex.append(terminateStr());
                                    staffHires.remove(j);
                                    JOptionPane.showMessageDialog(null, "The employee have terminated is services with us.");
                                    return; // exit the loop as soon as a matching vacancy is found

                                }
                            }


                        }
                        // if execution reaches here, it means no matching vacancy was found
                        JOptionPane.showMessageDialog(null, " Check if you enter the right value.");
                    }catch (IndexOutOfBoundsException IN){
                        JOptionPane.showMessageDialog(null, "The emplyee have terminate the service with us");
                    }
                }


            }
        });

        /***
         * Seach display on arrayList
         * @displayNumberButton
         */

        displayNumberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                if(getDisplay()<= (staffHires.size()-1)) {


                        for (int i = 0; i <= staffHires.size() - 1; i++) {


                            if (staffHires.get(getDisplay()) instanceof FullTimeStaffHire fullTimeStaffHire) {

                                displayAreaTex.setText("");
                                displayAreaTex.append(fullTimeStaffHire.staffDetails());
                                break;

                            } else if (staffHires.get(getDisplay()) instanceof PartTimeStaffHire partTimeStaffHire) {
                                displayAreaTex.setText("");
                                displayAreaTex.append(partTimeStaffHire.partTimeDetails());
                                break;
                            }

                        }

                }
                else {
                    JOptionPane.showMessageDialog(null,"You have enter wrong value");
                }

            }
        });

        /***
         * This is the clear button
         * @clearButton
         */


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                vacancyText.setText("");
                jobTypeText.setText("");
                jobDateText.setText("");
                designationText.setText("");
                staffNameText.setText("");
                AppointedText.setText("");
                qualificationText.setText("");
                salaryText.setText("");
                weefFractionalText.setText("");
                wegesText.setText("");
                WorkingHoursText.setText("");
                displayAreaTex.setText("");
                displayNumberText.setText("");
                shiftsText.setText("");



            }
        });


        /***
         * this is the app salary button
         * @ salaryButton
         */
        salaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                click2++;
                click=0;
                click3=0;
                click1=0;
                click4 =0;

                //set to true
                vacancyText.setEnabled(true);
                staffNameText.setEnabled(true);
                salaryText.setEnabled(true);

                //set to false
                jobTypeText.setEnabled(false);
                qualificationText.setEnabled(false);
                designationText.setEnabled(false);
                jobDateText.setEnabled(false);
                AppointedText.setEnabled(false);
                WorkingHoursText.setEnabled(false);
                wegesText.setEnabled(false);
                weefFractionalText.setEnabled(false);
                shiftsText.setEnabled(false);

                if(click2>=2) {
                    int vacancy = getVacancy();
                    String name = getStaffName();
                    boolean found = false;
                    displayAreaTex.setText("");

                    for (StaffHire staffHire : staffHires) {

                        if( staffHire instanceof FullTimeStaffHire fullTimeStaffHire) {

                            if (fullTimeStaffHire.getVacancyNumber() == vacancy && fullTimeStaffHire.getStaffName().equals(name)) {
                                fullTimeStaffHire.setSalary(getSalary());
                                displayAreaTex.append(fullTimeStaffHire.fullTimeDetails());
                                found = true;
                                break;
                            }
                        }
                    }

                    if (!found) {
                        JOptionPane.showMessageDialog(null, "The number and name does not match");
                    }
                }
            }
        });

        /***
         * This is the working shift button
         * @workingShiftsButton
         */
        workingShiftsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                click3++;
                click2=0;
                click4=0;
                click=0;
                click1 =0;

                //set to true
                vacancyText.setEnabled(true);
                staffNameText.setEnabled(true);
                shiftsText.setEnabled(true);


                //set to false
                jobTypeText.setEnabled(false);
                qualificationText.setEnabled(false);
                designationText.setEnabled(false);
                jobDateText.setEnabled(false);
                AppointedText.setEnabled(false);
                WorkingHoursText.setEnabled(false);
                wegesText.setEnabled(false);
                weefFractionalText.setEnabled(false);
                salaryText.setEnabled(false);

                if(click3>=2) {
                    int vacancy = getVacancy();
                    String name = getStaffName();
                    boolean found = false;
                    displayAreaTex.setText("");

                    for (StaffHire staffHire : staffHires) {

                        if(staffHire instanceof PartTimeStaffHire partTimeStaffHire) {

                            if (partTimeStaffHire.getVacancyNumber() == vacancy && partTimeStaffHire.getStaffName().equals(name)) {
                                partTimeStaffHire.setShifts(getShift());
                                displayAreaTex.append(partTimeStaffHire.partTimeDetails());
                                found = true;
                                break;
                            }
                        }
                    }

                    if (!found) {
                        displayAreaTex.setText("");
                        JOptionPane.showMessageDialog(null, "The number and name does not match");
                    }
                }
            }
        });






    }


    /**
     * Here is outside of construction class
     * we have the methods that will help with
     * course works
     *
     */

    /**
     * This method will create a instence of fulltime
     * and add it into the arraylist
     * @fulltime()
     */
    public  void  fulltime(){


        FullTimeStaffHire fullTimeStaffHire = new FullTimeStaffHire(getVacancy(), getdesignation(), getJobType(),
                getStaffName(), getJoiningDate(), getQualifacatio(), getAppointeby(), getjoin(), getSalary(),
                getWeekFractionalHours());

        staffHires.add(fullTimeStaffHire);
        displayAreaTex.setText("");
        displayAreaTex.append(fullTimeStaffHire.fullTimeDetails());


    }

    /**
     * This methods will create a instence of Part-time
     * and add it into the arraylist
     * @partTime()
     */
    public  void  partTime(){

        PartTimeStaffHire partTimeStaffHire = new PartTimeStaffHire(getVacancy(), getdesignation(),getJobType(), getStaffName(),getJoiningDate(),
                getQualifacatio(),getAppointeby(), getjoin(),getworkingHours(),getwagePerHours(),getShift());

              staffHires.add(partTimeStaffHire);
              displayAreaTex.setText("");
              displayAreaTex.append(partTimeStaffHire.partTimeDetails());

    }


    /**
     * This methods we get the user input in vacancy texfiel
     * @return vacancy
     */
    // get the vacancy number
    public int getVacancy() {

        int vacancy = -1;

        try {
            vacancy = Integer.parseInt(vacancyText.getText());
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "You have to Put Number check if" +
                    "Enter the value correct");

        }
        return vacancy;
    }

    /**
     *
     * @return join
     */

    // the joind method
    public boolean getjoin() {
        boolean join = Joined.isSelected();
        return join;


    }


    /**
     * this is the methods that get the user display number
     * @return displayNumber
     */
    // the display method
    public int getDisplay() {

        int displayNumber = -1;

        try {
            displayNumber = Integer.parseInt(displayNumberText.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You have to Put Number check if" +
                    "Enter the value correct");
        }

        return displayNumber;
    }

    public String getdesignation() {

        String designation = designationText.getText();

        return designation.toLowerCase();
    }

    public String getJobType() {

        String jobType = jobTypeText.getText();
        return jobType.toLowerCase();
    }

    public String getStaffName() {

        String staffName = staffNameText.getText();
        return staffName.toLowerCase();

    }

    public String getJoiningDate() {

        String joinDate = jobDateText.getText();
        return joinDate;
    }

    public String getQualifacatio() {

        String qualification = qualificationText.getText();
        return qualification.toLowerCase();

    }

    public String getAppointeby() {

        String appointed = AppointedText.getText();
        return appointed;
    }

    public double getSalary()

    {

        double salary = -1.0;

        try {
            salary = Double.parseDouble(salaryText.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You have to Put Number check if" +
                    "Enter the value correct");
        }

        return salary;

    }


    public  int getWeekFractionalHours(){

        int weekfractionalhours = -1;

        try {
            weekfractionalhours = Integer.parseInt(weefFractionalText.getText());

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "You have to Put Number check if" +
                    "Enter the value correct");
        }

        return weekfractionalhours;
    }


    public  String  getShift(){

        String shift = shiftsText.getText();
        return shift.toLowerCase();
    }

    public int getworkingHours(){

        int workingHours = 1;

        try {
            workingHours = Integer.parseInt(WorkingHoursText.getText());
        }catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "You have to Put Number check if" +
                    "Enter the value correct");
        }

        return workingHours;
    }

    public  double getwagePerHours(){

        double wagePerHours = -1.0;

        try{
            wagePerHours = Double.parseDouble(wegesText.getText());

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "You have to Put Number check if" +
                    "Enter the value correct");
        }
        return wagePerHours;
    }

    /***
     * This methods you will display the empity fiels
     * when we press the terminate button
     * @return terminates
     */

    public String terminateStr(){

        return "Vacancy Number: " +" "+ "\n" +
                " Designation Type: " + " "+ "\n" +
                "Job Type: " + " " + "\n" +
                "Job Date: " + " " + "\n" +
                "Staff Name: " + " " + "\n" +
                "Appointed By: " + " "  + "\n" +
                "Qualification: " + " " + "\n" +
                "Salary: " + " "+ "\n" +
                "Working Hours: " + " " + "\n" +
                "Wages Per Hours" + " " + "\n" +
                "Shifts: " + " ";
    }

}









