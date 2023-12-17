class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}

public class Get_Set {
    public static void main(String[] args) {
        MyEmployee Kashish = new MyEmployee();
        //Kashish.id = 45;
        //Kashish.name = "Code With Kashish"; --> Throws error due to private access modifier
        Kashish.setName("Code With Kashish");
        System.out.println(Kashish.getName());
    }
}
