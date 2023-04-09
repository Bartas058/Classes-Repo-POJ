class MyDate {
    private int month;
    private int day;
    private int year;
    
    public MyDate(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        this.month = month;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
        this.day = day;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        if (year < 1990 || year > 2050) {
            throw new IllegalArgumentException("Year must be between 1990 and 2050");
        }
        this.year = year;
    }
    
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", month, day, year);
    }

    public static void main(String[] args) {
        MyDate date1 = new MyDate(3, 31, 2000);
        // MyDate date2 = new MyDate(1, 1, 1989);

        date1.displayDate();
        // date2.displayDate();
    }
}