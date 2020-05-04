import java.util.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) throws Exception {
        MyArrayList<String> myArrayList=new MyArrayList<>();
        System.out.println(myArrayList.getDEFAULT_SIZE());
        myArrayList.add(0,"Dinh Phu");
        myArrayList.add("hai phong");
        myArrayList.add("28.5");
        myArrayList.add("IT");

        myArrayList.add(2,"Viet Nam");

        myArrayList.remove(2);

        for (int i =0 ; i< myArrayList.getDEFAULT_SIZE()-1;i++){
            System.out.println(myArrayList.get(i));
        }


        System.out.println(myArrayList.getDEFAULT_SIZE());
    }
}
