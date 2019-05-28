package hardware;

public class Laptop extends Computer {
    private String Screensize;
    private float Weight;

    public String getScreensize() {
        return Screensize;
    }

    public void setScreensize(String screensize) {
        Screensize = screensize;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(float weight) {
        Weight = weight;
    }
}
