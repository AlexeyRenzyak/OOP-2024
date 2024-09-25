package Practice;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Wrong time format");
        }
        else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Wrong time format");
        }
        else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    public String toUniversal(){
        String hs = Integer.toString(hour);
        String ms = Integer.toString(minute);
        String ss = Integer.toString(second);
        if (hour < 10){
            hs = "0" + hs;
        }
        if (minute < 10){
            ms = "0" + ms;
        }
        if (second < 10){
            ss = "0" + ss;
        }
        return hs + ":" + ms + ":" + ss;
    }
    public String toStandard() {
        String result = "";
        String hs = Integer.toString(hour);
        String phs = Integer.toString(hour-12);
        String ms = Integer.toString(minute);
        String ss = Integer.toString(second);
        if (hour < 10){
            hs = "0" + hs;
        }
        if ((hour - 12)<10){
            phs = "0" + phs;
        }
        if (minute < 10){
            ms = "0" + ms;
        }
        if (second < 10){
            ss = "0" + ss;
        }
        if (hour == 0) {
            result += "12" + ":" + ms + ":" + ss + " AM";
        }
        else if (hour == 12) {
            result += "12"+":"+ms+":"+ss+" PM";
        }
        else {
            if (hour > 12){
                result += phs+":"+ms+":"+ss+" PM";
            }
            else {
                result += hs+":"+ms+":"+ss+" AM";
            }
        }
        return result;
    }
    public void addTime(Time addtime){
        second += addtime.second;
        if (second >= 60){
            second -= 60;
            minute += 1;
        }
        minute += addtime.minute;
        if (minute >= 60){
            minute -= 60;
            hour += 1;
        }
        hour += addtime.hour;
        if (hour >= 24){
            hour -= 24;
        }
    }
}
