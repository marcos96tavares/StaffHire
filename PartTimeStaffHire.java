/***
 * THIS IS THE PARTTIMESTAFFHIRE CLASS
 * THIS CLASS IS A EXTENTION OF STAFFHIRE
 * @author MARCOS TAVARES
 */

public class PartTimeStaffHire extends StaffHire {

    private int workingHours;
    private double wagePerHours;
    private String shifts;
    private boolean terminated;


    public PartTimeStaffHire(int vacancyNumber, String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined, int workingHours, double wagePerHours, String shifts) {
        super(vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.workingHours = workingHours;
        this.wagePerHours = wagePerHours;
        this.shifts = shifts;
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
     * @param workingHours Example: 35.
     * @param wagePerHours Example: 12.
     * @param shifhNumber ATTENTION HERE.
     * The shifhNumber section should be chosen between number 1 to 3.
     * The  only parameter accepted on shifh are.
     *  number 1-----> day.
     * number 2-----> morning.
     * number 3-----> evening.
     */



    public PartTimeStaffHire(int vacancyNumber, int shifhNumber,int jobTypeNumber, String designationType, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined, int workingHours, double wagePerHours) {
        super(vacancyNumber, designationType, jobTypeNumber, staffName, joiningDate, qualification, appointedBy, joined);

        this.workingHours = workingHours;
        this.wagePerHours = wagePerHours;
        this.terminated = false;

        switch (shifhNumber){

            case 1: this.shifts = "day";

                break;

            case 2: this.shifts = "morning";

                break;

            case 3:  this.shifts = "evening";
                break;

            default: System.out.println("You have enter wrong Number.");
        }

    }

    /***
     * HERE ARE LIST OF SET AND GET METHODS
     * @return WorkingHours
     */
    public int getWorkingHours() {
        return workingHours;
    }

    /***
     * you can change the working hours here.
     * @param workingHours
     */

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    /***
     * you can get the wage per hours
     * @return WagePerHours
     */
    public double getWagePerHours() {
        return wagePerHours;
    }

    /***
     * you can change the wage per hours
     * @param wagePerHours
     */
    public void setWagePerHours(double wagePerHours) {
        this.wagePerHours = wagePerHours;
    }

    /***
     * THESE ARE TWO MEHTOD GET AND SET OF SHIFTS
     * IN THIS METHOD, WE HAVE TO DISPLAYS SOME CONDITION FOR SHIFTS
     * SHIFTS ONLY ACCEPT("DAY","MORNING" AND "EVENING" )
     * @return Shifts
     */
    public String getShifts() {
       return this.shifts;
    }

    /***
     * This is the method that you can
     * change the shifts.
     * @param shifts
     */
    public void setShifts(String shifts) {




        if (isJoined()) {

            this.shifts = shifts;



        }
        else{
            System.out.println(" Sorry The Staff have not joined yet.");
            System.out.println(" Please check the joined section.");

        }

    }

    /***
     * you can get the terminated
     * @return Terminated
     */
    public boolean isTerminated() {
        return terminated;
    }

    /***
     * THIS METHOD WILL SET SOME VARIABLE IN EMPTY.
     * @param terminated GET THE CONDITION OF TERMINATE
     */
    public void setTerminated(boolean terminated) {


        if(terminated){

            System.out.println("The employee have terminated is services with us.");
        }
        else {
            setStaffName(" ");
            setJoiningDate(" ");
            setQualification(" ");
            setAppointedBy(" ");
            setJoined(false);
            this.terminated = true;
        }
    }


    /***
     * THIS METHOD WILL DISPLAY OF PARTIMESTAFF OVERRIDING THE STAFF-HIRE DETAILS METHOD
     * @return
     */
    public String partTimeDetails() {
        StringBuilder sb = new StringBuilder();

        sb.append(staffDetails()).append("\n");

        if (getWorkingHours() > 0) {
            double incomePerDay = getWagePerHours() * getWorkingHours();


            sb.append(" Working hours: ").append(getWorkingHours()).append(" hours per day\n");
            sb.append(" The wage per hours £: ").append(getWagePerHours()).append("\n");
            sb.append(" The shift is: ").append(getShifts()).append("\n");
            sb.append(" The income Per Day are: ").append(incomePerDay).append("\n");

        }

        return sb.toString();

    }


}

