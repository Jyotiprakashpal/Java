class student1{
    public String name;
    public int age;
    public String city;
    //public void setData(String name,int age,String city)
    student1(String name,int age,String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
}
public class pr2 {
    public static void main(String[] args) {
        student1 std1 = new student1("jyoti", 21, "Bhubaneswar");
        //std1.setData("jyoti", 21, "Bhubaneswar");
        System.out.println(std1.getName());
        System.out.println(std1.getAge());
        System.out.println(std1.getCity());
    }
}
