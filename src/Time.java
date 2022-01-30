public class Time {
    // Attributes
    private int seconds,minutes,hours;

    // Constructor
    public Time(int seconds, int minutes, int hours){
        /**
         * @param seconds integer
         * @param minutes integer
         * @param hours integer
         */
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;

    }

    public Time(int t){
        this.seconds = t;
        this.minutes = t;
        this.hours = t;
    }


    public String getTime(){
        return this.seconds + "-" + this.minutes + "-" + this.hours;
    }

    public void setSeconds(int s){
        this.seconds = s;
    }

    public void setMinutes(int m){
        this.minutes = m;
    }

    public void hours(int h){
        this.hours = h;
    }

    public int getSeconds(){
        return this.seconds;
            }

    public int getMinutes(){
        return this.minutes;
    }
    //Returns Hours
    public int getHours(){
        return this.hours;
    }

}
