package HWfor372022;

public class phone {
    private String name;
    private int year;
    private String model;

    public void myPhone() {   
    }

    public void myPhone(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void myPhone(String name, int year, String model) {
        this.name = name;
        this.year = year;
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public boolean isAvailable() {
        return true;
    }

    public String isRinging() {
        return "Ring..Ring..Ring";
    }

    public static void main(String[] args) {
        //Use this to test code.
        phone nokia = new phone();
        //System.out.println(nokia.isRinging());
    }
}
