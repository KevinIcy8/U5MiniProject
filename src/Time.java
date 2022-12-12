public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int h, int m, int s){
        hour = h;
        min = m;
        sec = s;
    }

    public void tick(){
        sec++;
        if(sec>=60){
            min++;
            sec = 0;
        }
        if(min>=60){
            hour++;
            min = 0;
        }
        if(hour>=24){
            hour = 0;
        }
    }

    public void add(Time timeAdded){
        
        System.out.println(timeAdded);
    }

    public String toString(){
        String printHour = String.valueOf(hour);
        String printMin = String.valueOf(min);
        String printSec = String.valueOf(sec);
        if(hour<10){
            printHour = "0" + printHour;
        }
        if(min<10){
            printMin = "0" + printMin;
        }
        if(sec<10){
            printSec = "0" + printSec;
        }
        return printHour + ":" + printMin + ":" + printSec;
    }

}
