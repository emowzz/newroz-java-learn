public class Lamp {
    private String style;
    private boolean battery;
    private int globRanking;

    public Lamp(String style, boolean battery, int globRanking) {
        this.style = style;
        this.battery = battery;
        this.globRanking = globRanking;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRanking() {
        return globRanking;
    }
}
