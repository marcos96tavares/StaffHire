/***
 * THIS IS THE STAFFHIRE CLASS
 * @author MARCOS TAVARES
 */
public class StaffHire {



    private int vacancyNumber;
    private String designationType;
    private String jobType;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;


    public StaffHire(int vacancyNumber, String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined) {
        this.vacancyNumber = vacancyNumber;
        this.designationType = designationType;
        this.jobType = jobType;
        this.staffName = staffName;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
        this.joined = joined;
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
     */




    public StaffHire( int vacancyNumber, String designationType,int jobTypeNumber, String staffName, String
        joiningDate, String qualification, String appointedBy,boolean joined){
        this.vacancyNumber = vacancyNumber;
        this.designationType = designationType;

        switch (jobTypeNumber) {

            case 1:
                this.jobType = "permanent";

                break;

            case 2:
                this.jobType = "contract";

                break;

            case 3:
                this.jobType = "temporary";

                break;

            default:
                this.jobType = "You have enter wrong Number.";
        }
        this.jobType = jobType;
        this.staffName = staffName;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
        this.joined = joined;
    }

    /***
     * IN THESE SECTIONS YOU WILL FIND THE GET ANS SET METHODS OF THE VARIABLES.
     * @return WILL RETURN GET
     */
    public int getVacancyNumber() {
        return vacancyNumber;
    }

    /***
     * change the vacancyNumber
     * @param vacancyNumber
     */
    public void setVacancyNumber(int vacancyNumber) {
        this.vacancyNumber = vacancyNumber;
    }

    /***
     * you can get the designation type
     * @return DesignationType
     */
    public String getDesignationType() {
        return designationType;
    }

    /***
     * you can set the designation type
     * @param designationType
     */
    public void setDesignationType(String designationType) {
        this.designationType = designationType;
    }

    /***
     * you can get the job type
     * @return JobType
     */
    public String getJobType() {
        return  jobType;
    }

    /***
     * THIS IS THE SET METHOD OF JOBTYPE BUT IT HAS A CONDITION THAT I WILL ONLY SET THIS NAME
     * "PERMANET", "CONTACT" AND "TEMPORARY"
     */
    public void setJobType(int jobTypeNumber) {

        switch (jobTypeNumber){

            case 1: this.jobType = "permanent";

                break;

            case 2: this.jobType = "contract";

                break;

            case 3:  this.jobType = "temporary";
                break;

            default: System.out.println("You have enter wrong Number.");
        }
    }

    /***
     * you can get the staff name
     * @return StaffName
     */
    public String getStaffName() {
        return staffName;
    }

    /***
     * you can change the staff name
     * @param staffName
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /***
     * you can get the joining data
     * @return JoiningDate
     */
    public String getJoiningDate() {
        return joiningDate;
    }

    /***
     * you can can change the joining data
     * @param joiningDate
     */
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    /***
     * you can get the qualification
     * @return Qualification
     */
    public String getQualification() {
        return qualification;
    }

    /***
     * you can change the qualification
     * @param qualification
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    /***
     * you can get the appointed by
     * @return AppointedBy
     */
    public String getAppointedBy() {
        return appointedBy;
    }

    /***
     * you can change appointed by
     * @param appointedBy
     */
    public void setAppointedBy(String appointedBy) {
        this.appointedBy = appointedBy;
    }

    /***
     * you can get the joined state
     * @return Joined
     */
    public boolean isJoined() {
        return joined;
    }

    /***
     * you can change the joined
     *      * the only parameter you can
     *      * put are "true" or "false"
     * @param joined
     */
    public void setJoined(boolean joined) {
        this.joined = joined;
    }


    /***
     * THIS A METHODS THAT WILL DISPLAY THE STAFFHIRE VARIABLE IN A CONTEXT.
     * @return
     */
    public String staffDetails() {
        StringBuilder sb = new StringBuilder();
        String string = "###";
        sb.append(string.repeat(20)).append("\n");
        sb.append(string.repeat(20)).append("\n");
        sb.append(" Should only be view by employer or employee!").append("\n");
        String className = this.getClass().getName();
        sb.append(" This is the  ").append(className).append(" details:").append("\n");
        sb.append(" Staff Name :").append(getStaffName()).append("\n");
        sb.append(" Vacancy Number :").append(getVacancyNumber()).append("\n");
        sb.append(" Job Type :").append(getJobType()).append("\n");
        sb.append(" Designation Type :").append(getDesignationType()).append("\n");
        sb.append(" Joining Date  :").append(getJoiningDate()).append("\n");
        sb.append(" Qualification :").append(getQualification()).append("\n");
        sb.append(" Appointed by :").append(getAppointedBy()).append("\n");
        sb.append(" Is Joined :").append(isJoined()).append("\n");
        return sb.toString();
    }


}