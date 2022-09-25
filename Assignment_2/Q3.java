public class Q3 {
    public static void main(String args[]){
        //Variable for index of month
        int monthIndex = 7;
        switch(monthIndex){
            case 1: System.out.println("Name of the month is: January");
            System.out.println("No. of days in this month: 31");
            break;

            case 2: System.out.println("Name of the month is: February");
            //considering non leap year
            System.out.println("No. of days in this month: 28");
            break;

            case 3: System.out.println("Name of the month is: March");
            System.out.println("No. of days in this month: 31");
            break;

            case 4: System.out.println("Name of the month is: April");
            System.out.println("No. of days in this month: 30");
            break;

            case 5: System.out.println("Name of the month is: May");
            System.out.println("No. of days in this month: 31");
            break;

            case 6: System.out.println("Name of the month is: June");
            System.out.println("No. of days in this month: 30");
            break;

            case 7: System.out.println("Name of the month is: July");
            System.out.println("No. of days in this month: 31");
            break;

            case 8: System.out.println("Name of the month is: August");
            System.out.println("No. of days in this month: 31");
            break;

            case 9: System.out.println("Name of the month is: September");
            System.out.println("No. of days in this month: 30");
            break;

            case 10: System.out.println("Name of the month is: October");
            System.out.println("No. of days in this month: 31");
            break;

            case 11: System.out.println("Name of the month is: November");
            System.out.println("No. of days in this month: 30");
            break;

            case 12: System.out.println("Name of the month is: December");
            System.out.println("No. of days in this month: 31");
            break;

            default: System.out.println("Please enter valid index of the month - Range 1 to 12");
            break;

        }
    }
    
}
