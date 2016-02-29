package testp1;

public class TestObj {

    public static void main(String[] args){

        identity id1 = new identity();
        id1.identification("Sita",10);
    }
}



class identity{

    int id;
    String name;

    public void identification(String x, int y){
        this.name = x;
        this.id = y;
        System.out.println("ID is "+name+" "+id);
    }


}