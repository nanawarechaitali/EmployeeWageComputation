import java.util.Random;

public class EmployeeWageComputation {
   private static final  int Absent_Day_Hr = 0;
   // private  static final int Wage_Per_Hr =20;
    private static final int Full_Day_Hr=8;
    private static final int Half_Day_Hr=4;

   static final  int Is_Full_Time=1;
    static final int Is_Part_Time=2;
    static  final int Is_Absent_Today =0;

    private static final int Total_Working_Day_Per_Month=20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation program on Master branch");
        calculateEmpWage("DMart",30,5,20);
        calculateEmpWage("TATA",40,4,20);
    }
    public static int calculateEmpWage(String company, int wagePerHour, int numOfWorkingDays, int maxWorkingHours) {

        Random random = new Random();
        int attendance;
        int total_working_days = 0;
        int total_emp_hours = 0;
        int total_emp_wage = 0;
        while (total_emp_hours <= 100 && total_working_days < 20) {
            attendance = random.nextInt(3);
            switch (attendance) {
                case Is_Full_Time:
                    total_emp_hours += Full_Day_Hr;
                    total_working_days++;
                    break;

                case Is_Part_Time:
                    total_emp_hours += Half_Day_Hr;
                    total_working_days++;
                    break;

                default:
                    total_emp_hours = Absent_Day_Hr;
                    total_working_days=0;


            }
        }

        total_emp_wage += wagePerHour * total_emp_hours;
        System.out.println("Total working days" + total_working_days);
        System.out.println("total working hours" + total_emp_hours);
        System.out.println("Total wage for a month" + total_emp_wage);

        return total_emp_wage;


    }

}
