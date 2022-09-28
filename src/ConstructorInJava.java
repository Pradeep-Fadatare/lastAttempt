public class ConstructorInJava {

    String name;
    int roll_no;

    ConstructorInJava(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }

    public static void main(String[] args) {
        ConstructorInJava constructorInJava = new ConstructorInJava("pradeep",11);
        ConstructorInJava constructorInJava1 = new ConstructorInJava("pramod",12);
        System.out.println(constructorInJava.name);
        System.out.println(constructorInJava.roll_no);

    }
}
