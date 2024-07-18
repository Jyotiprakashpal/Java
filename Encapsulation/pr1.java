class dog{
    private String name;
    private int cost;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
public class pr1 {
    public static void main(String[] args) {
        dog d = new dog();
        d.setName("kalu");
        System.out.println(d.getName());
        d.setCost(2000);
        int cost = d.getCost();
        System.out.println(cost);
    }
}
