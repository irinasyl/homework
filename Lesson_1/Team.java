package Lesson_1;

public class Team {
    private String name;
    private int distance1;
    private int distance2;

    public Team (String name, int distance1, int distance2) {
        this.name = name;
        this.distance1 = distance1;
        this.distance2 = distance2;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance1() {
        return distance1;
    }

    public void setDistance1 (int distance1) {
        this.distance1 = distance1;
    }

    public int getDistance2() {
        return distance2;
    }

    public void setDistance2(int distance2) {
        this.distance2 = distance2;
    }
}

