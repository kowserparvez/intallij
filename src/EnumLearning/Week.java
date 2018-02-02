package EnumLearning;

public class Week {
    Day day;
    public Week(Day day){

        this.day=day;
    }
    public void taskToDO(){
        switch(day){
            case MONDAY:
            System.out.println("Java");
            break;
            case TUESDAY:
            System.out.println("Selenium");
            break;
            case WEDNESDAY:
            System.out.println("SQL");
            break;
            case THURSDAY:
            System.out.println("ALM");
            break;
            case FRIDAY:
            System.out.println("CNSS");
            break;
            case SATURDAY:
            System.out.println("Montoring");
            break;
            case SUNDAY:
            System.out.println("Tutoring");
            break;
            default:
            System.out.println("Study");
            break;

        }
    }
}
