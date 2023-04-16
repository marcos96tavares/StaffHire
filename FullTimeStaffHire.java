/***
 * THIS IS THE FULLTIMESTAFFHIRE CLASS
 * THIS CLASS IS A EXTENTION OF STAFFHIRE
 * @author MARCOS TAVARES
 */
public class FullTimeStaffHire extends StaffHire {
    private double salary;
    private int weeklyFractionalHours;

    public FullTimeStaffHire(int vacancyNumber, String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined, double salary, int weeklyFractionalHours) {
        super(vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.salary = salary;
        this.weeklyFractionalHours = weeklyFractionalHours;
    }

    /***
     * This is important message how you can insert the input by order:
     * @param vacancyNumber Example: 5.
     * @param designationType Example: " Junior".
     * @param jobTypeNumber ATTENTION HERE.
     * The jobTypeNumber section should be chosen between number 1 to 3.
     * These are the only parameter accepted on job type.
     * number 1-----> permanent.
     * number 2-----> contract.
     * number 3-----> temporary.
     * @param staffName Example: "Paul" .
     * @param joiningDate Example: "30/10/22".
     * @param qualification Example: " bachelor degree".
     * @param appointedBy Example: "Paul".
     * @param joined Your answer should be "false or true".
     * @param salary Example: £12000.00.
     * @param weeklyFractionalHours Example: 42.
     *
     */


    public FullTimeStaffHire(int vacancyNumber, String designationType, int jobTypeNumber, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined, double salary, int weeklyFractionalHours) {
        super(vacancyNumber, designationType, jobTypeNumber, staffName, joiningDate, qualification, appointedBy, joined);
        this.salary = salary;
        this.weeklyFractionalHours = weeklyFractionalHours;
    }



    /***
     * HERE ARE LIST OF SET AND GET METHODS
     */
    public double getSalary() {
        return  salary;
    }

    /***
     * THIS METHOD IS TO SET THE SALARY BUT IT HAS CONDITION TO SET THE SALARY
     * @param salary I WILL GET THE USER SALARY INPUT
     */

    public void setSalary(double salary) {
        if (isJoined()) {
            // The user can only enter the positive value of salary.
            if(salary > 0.0){
            this.salary = salary;
            }

            else {
                System.out.println("You entered the wrong value!");
            }

        } else {
            System.out.println(" Sorry The Staff have not joined yet.");
            System.out.println(" Please check the joined section.");
        }
    }

    /***
     * you can get the weekly fractional hours
     * @return WeeklyFractionalHours
     */
    public int getWeeklyFractionalHours() {
        return weeklyFractionalHours;
    }

    /***
     * you can change the weekly fractional hours
     * @param weeklyFractionalHours
     */
    public void setWeeklyFractionalHours(int weeklyFractionalHours) {
        this.weeklyFractionalHours = weeklyFractionalHours;
    }


    /***
     * THIS A METHODS THAT WILL DISPLAY THE STAFF-HIRE (overriding) VARIABLE IN A CONTEXT.
     * @return
     */
    public String fullTimeDetails() {
        StringBuilder sb = new StringBuilder();
        if (salary > 0.0) {
            sb.append(staffDetails()).append("\n");
            sb.append(" Staff Salary £:").append(getSalary()).append("\n");
            sb.append(" Weekly Fractional Hours :").append(getWeeklyFractionalHours()).append("\n");
        } else {
            sb.append(staffDetails()).append("\n");
        }
        return sb.toString();
    }



}
