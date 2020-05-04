public class MyListTest {
    public static void main(String[] args) throws Exception {
       MyList<String> hereIsMyList= new MyList<>();
       hereIsMyList.ensureCap(10);
        System.out.println(hereIsMyList.getSize());
       hereIsMyList.add("Dinh Phu");
        hereIsMyList.add("Hai Phong");
        hereIsMyList.add("28.5");
        hereIsMyList.add("IT");
        System.out.println(hereIsMyList.get(3));
        System.out.println(hereIsMyList.getDEFAULT_CAPACITY());

    }
}


