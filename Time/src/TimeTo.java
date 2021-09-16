public class TimeTo {
    private int input, hour, minutes, seconds;

    public TimeTo(){

    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }


    public void toTimers(){
        int hours = this.input/3600;
        int minutes = this.input/60;
        int seconds = this.input%60;

        setHour(hours);
        setMinutes(minutes);
        setSeconds(seconds);

    }

    public void printData(){
        System.out.printf("%dh%dm%ds\n", getHour(), getMinutes(), getSeconds());
    }
}


