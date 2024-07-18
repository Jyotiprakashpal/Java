class student2{
    public String name;
    public int age;
    public String city;
    student2(String name,int age,String city)//constructer => same as the class name
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    student2(){
        name = "jyoti";
        age = 21;
        city = "Bhubaneswar";
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
public class pr3 {
    public static void main(String[] args) {
        student2 std1= new student2();
        System.out.println(std1.getName());
        System.out.println(std1.getAge());
        System.out.println(std1.getCity());

        student2 std2 = new student2();
        System.out.println(std2.getName());
        System.out.println(std2.getAge());
        System.out.println(std2.getCity());
    }
}
