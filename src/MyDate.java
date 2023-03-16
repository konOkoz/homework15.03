import java.util.Objects;

public class MyDate {
    /*
    Создать класс MyDate с полями day,month,year, конструктором,геттерами и сеттерами.
Создать несколько одинаковых обьектов этого класса и проверить их на равенство.
Затем переопределить методы equals и hashCode и вновь проверить обьекты на равенство.
     */
    private String day;
    private String month;
    private int year;

    MyDate(String day, String month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(String day){
        this.day=day;
    }
    public void setMonth(String month){
        this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }

    public boolean equals(Object o){
        if (this ==o){
            return true;
        }
        if(!(o instanceof MyDate)){
            return false;
        }
      MyDate date = (MyDate) o;
        return day.equals(date.getDay()) && month.equals(date.getMonth()) && year == date.getYear();
    }
    public int hashCode(){
        return Objects.hash(day, month, year);
    }



}
