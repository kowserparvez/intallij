package EnumMonth;

public class Year
{Month month;
public Year(Month month) {
    this.month = month;
 }

 public void birthdayMonth(){
    switch(month){
        case JANUARY:
            System.out.println("Mom");
            break;
        case FEBRUARY:
            System.out.println("Bhabi");
            break;
        case MARCH:
            System.out.println("Empty");
            break;
        case APRIL:
            System.out.println("Taheem");
            break;
        case MAY:
            System.out.println("Tamzid");
            break;
        case JUNE:
            System.out.println("Keyaan");
            break;
        case JULY:
            System.out.println("Aric");
            break;
        case AUGUST:
            System.out.println("Self");
            break;
        case SEPTEMBER:
            System.out.println("Empty again");
            break;
        case OCTOBER:
            System.out.println("Tina");
            break;
        case NOVEMBER:
            System.out.println("Empty 2nd");
            break;
        case DECEMBER:
            System.out.println("Abba");
            break;
            default:
                System.out.println("anyone");
                break;


    }
 }
}
