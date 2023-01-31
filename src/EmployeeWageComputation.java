public class EmployeeWageComputation {
    public static void main(String[] args) {
        int Is_Present =1;
        int Is_Absent=0;
        int Full_Time=1;
        int Wage_Per_Hr =20;
        int checkAttendence =(int)(Math.random()*100)%2;
        int workingHours=0;

        if(checkAttendence==Full_Time){
            System.out.println("Employee is present");
            workingHours=8;

        }else{
            System.out.println("Employee is absent");
        }
        int wage = workingHours*Wage_Per_Hr;
        System.out.println("Employee Daily Wage is" + wage);

    }
}
