import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Calender {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year: ");
        int y = s.nextInt();
        System.out.println("enter the month");
        int m = s.nextInt();
        if(m>12){ //if we print invalid month u get these type of condition
            System.out.println("invalid month");
            for(int i=1;i<=2;i++){
                System.out.println("enter month again: ");
                m=s.nextInt();
                if(m<13)
                    break;
                if(i==2){
                    System.out.println("too many attempts");
                    

                }
            }

        }
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; //taking weeks
        String[] month={"","January","February","March","April","May","June","July","August","September","October","November","December"}; //months

        int[] dayinmonth={0,31,28,31,30,31,30,31,31,30,31,30,31}; //giving how many days in a month
        int max=0;
        if(m==2){ //if we get leap year this statement works
            if(y%4==0&&y%400==0){
                max=29;
            }
        }
        else
            max=dayinmonth[m];
        LocalDate  ld=LocalDate.of(y,m,01);
        System.out.println("ld "+ld);
        java.time.DayOfWeek dow=ld.getDayOfWeek();//give that particular day in a week
        System.out.println("dow"+dow);
        int n= dow.getValue(); //gives that day number
        System.out.println("n"+n);
        System.out.println(month[m]+" "+y);
        System.out.println("sun "+"mon "+"tue "+"wed "+"thu "+"fri "+"sat ");
        if(n!=7) {
            for (int i = 1; i <= n; i++) {
                System.out.print("    ");
            }
        }

        for(int i=1;i<=max;i++)
        {

            if(i<=9){
                System.out.print(0+""+i+"  ");
            }
            else
                System.out.print(i+"  ");
            if((i+n)%7==0)
                System.out.println();
        }
    }
}