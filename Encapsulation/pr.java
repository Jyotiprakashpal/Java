class Student{
    private int age;//instace variabele//Data member//
    private String name;//properties
    private String city;
    private boolean married;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public boolean ismarried(){
        return married;
    }  
}
public class pr{
    public static void main(String[] args) {
        Student st = new Student();
        /**st.age = 21;
        st.name="jyotipraksh";
        st.city="Bhubaneswar"; **/
        st.setAge(21);
        int age = st.getAge();
        System.out.println(age);

        st.setName("jyotiprakash");
        String name = st.getName();
        System.out.println(name);
    }
}