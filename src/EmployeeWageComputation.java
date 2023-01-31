public class EmployeeWageComputation {
    public static void main(String[] args) {
        int Is_Present =1;
        //int Is_Absent=0;
        int Full_Time=1;
        int Part_Time=2;
        int Wage_Per_Hr =20;
        int Working_Day_Per_Month=20;
        int totalWage =0;
        for(int day=1;day<=Working_Day_Per_Month;day++){
            int checkAttendence =(int)(Math.random()*100)%3;
            int workingHours=0;

            switch(checkAttendence){
                case 1:
                    System.out.println("Employee is present Full_Time");
                    workingHours=8;
                    break;

                case 2:
                    System.out.println("Employee is present Part_Time");
                    workingHours=4;
                    break;

                default:
                    System.out.println("Employee is absent");
            }
            int wage = workingHours*Wage_Per_Hr;
            System.out.println("Day"+day +"wage is:"+ wage);
            totalWage +=wage;

        }
        System.out.println("Total wage for a month is " + totalWage);



    }

}
