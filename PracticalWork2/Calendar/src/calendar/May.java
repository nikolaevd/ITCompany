
package calendar;

public class May {
    
    Day day;

    public void getInfoByDay(Day day) {

        switch (day) {
            case MONDAY: 
                System.out.println(Day.MONDAY.getNote());
                break;
            case TUESDAY: 
                System.out.println(Day.TUESDAY.getNote());
                break;
            case WEDNESDAY: 
                System.out.println(Day.WEDNESDAY.getNote());
                break;
            case THUESDAY:
                System.out.println(Day.THUESDAY.getNote());
                break;
            case FRIDAY: 
                System.out.println(Day.FRIDAY.getNote());
                break;
            case SATURDAY:
                System.out.println(Day.SATURDAY.getNote());
                break;
            case SUNDAY: 
                System.out.println(Day.SUNDAY.getNote());
                break;
            default: 
                break;
        }
    }
    
    public static void main(String[] args){
        May may = new May();
        may.getInfoByDay(Day.MONDAY);
        may.getInfoByDay(Day.FRIDAY);
        may.getInfoByDay(Day.SUNDAY);
    }
    
}   
