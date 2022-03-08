package HWfor372022;

public class pet {
    
    public String name;
    public int age;
    public String location;
    public String type;

    public void whereIs() {
        System.out.println("Looking for your pet.....");
    }

    public void isIt(String name, int age, String location, String type) {
        System.out.printf("Your %s age %s in %s is a %s", this.name, this.age, this.location, this.type);
    }

    //Get/set method
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return this.type;
    }

    public static void main(String[] args) {
        //Use this to test code.
        pet mydog = new pet();
        //mydog.isIt(mydog.name, mydog.age, mydog.location, mydog.type);
    }

}


