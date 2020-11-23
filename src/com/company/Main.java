import java.lang.*;

public class main {
    public static void main(String[] args) {
        person p=new person("Leha","Vladimirovich", "Pushkin");
        person e=new person("","","");
        System.out.println(p.toString());
        System.out.println(e.toString());
    }
}

class person {
    private String name;
    private String SecName;
    private String Family;



    public person(String name, String secName, String Family){
        this.name=name;
        this.SecName=secName;
        this.Family=Family;
    }

    @Override
    public String toString() {
        if (name==""&&SecName==""&&Family==""){
            return "there is no words";
        }
        return "person{" +
                "name='" + name + '\'' +
                ", SecName='" + SecName + '\'' +
                ", Family='" + Family + '\'' +
                '}';
    }
}