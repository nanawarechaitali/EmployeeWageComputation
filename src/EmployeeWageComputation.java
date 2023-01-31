public class EmployeeWageComputation {
    public static void main(String[] args) {
        int Is_Present =1;
        int Is_Absent=0;
        int checkAttendence =(int)(Math.random()*100)%2;
        if(checkAttendence==Is_Present){
            System.out.println("Employee is present");

        }else{
            System.out.println("Employee is absent");
        }

    }
}
