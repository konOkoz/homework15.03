public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate("Monday","September", 2000);
        MyDate date2 = new MyDate("Monday","September",2000);
        MyDate date3 = new MyDate("Friday","October",2010);
        MyDate date4 = new MyDate("Wednesday","June",2020);

        System.out.println(date1.equals(date2));
        System.out.println(date3.equals(date4));
        /*OUT with old equals and hashCode methods
        false
        false
         */
        System.out.println(date1.equals(date2));
        System.out.println(date3.equals(date4));
        /*OUT with new equals and hashCode methods
        true
        false
         */
        date1.setDay("Friday");
        date1.setMonth("October");
        date1.setYear(2010);
        System.out.println(date1.equals(date2));
        System.out.println(date1.equals(date3));
        /* OUT after changes
        false
        true
         */



    }
}