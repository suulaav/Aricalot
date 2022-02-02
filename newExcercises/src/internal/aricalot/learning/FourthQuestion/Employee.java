package internal.aricalot.learning.FourthQuestion;
class Employee {
    private String id;
    private float salary;
    private int numberOfHoursWorked;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
    public String getInfo(){
        return ("Employee id : "+ id +
                "\n Salary :"+salary+
                "\n numberOfHoursWorked :"+numberOfHoursWorked );
    }
    public void AddSal(){
        if(this.salary <500){
            this.salary= this.salary+10;
        }
    }
    public void AddWork(){
        if(this.numberOfHoursWorked>6){
            this.salary=this.salary+5;
        }
    }

}

