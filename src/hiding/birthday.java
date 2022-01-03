package hiding;

class birth {
    public int day;
    private int month;
    int year; // 같은 패키지내에 access 가능

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("날짜오류");
            }
        }
        else
            this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
public class birthday {
    public static void main(String[] args) {
        birth day = new birth();

        day.setMonth(2);
        day.setDay(3);
        day.setYear(2022);

    }
}
