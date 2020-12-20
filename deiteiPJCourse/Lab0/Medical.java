package deiteiPJCourse.Lab0;

public class Medical {
    private String name;
    private String lastName;
    private int yearOfBirth;
    private int maxHeartRate = 220;
    private int weight;
    private int height;
    private String gender;



    public Medical(String n, String l, int y,int w,int h,String g){
       this.name = n;
       this.lastName = l;
       this.yearOfBirth = y;
       this.weight = w;
       this.height = h;
       this.gender =g;

           }

           public void getStuff(){
        System.out.println("Имя пациента " + this.name + " Фамилия пациента" + this.lastName+" день рождения пациента: "
                +this.yearOfBirth + " рост пациента  " +this.height+ " вес пациента " +this.weight + " гендер "
                +this.gender + "макс.сердечный ритм потенциальный " +this.maxHeartRate );

           }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMaxHeartRate(int maxHeartRate) {
        this.maxHeartRate = maxHeartRate;
    }

    public int getMaxHeartRate() {
        return maxHeartRate;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }



}
