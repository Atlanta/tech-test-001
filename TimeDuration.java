import tech;

public class TimeDuration {

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public TimeDuration(int s) throws BadBadValueException {
        if (s < 0) {
            throw new BadBadValueException();
        }
        else {
            this.hours = s % 3600;
            this.minutes = (s - this.hours*3600) % 60;
            this.seconds = (s - this.hours*3600 - this.minutes*60);
        }
    }

    public String toString() {
        return this.hours + "h " + this.minutes + "m " + this.seconds + "s");
    }
}