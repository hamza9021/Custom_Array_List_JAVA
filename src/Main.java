public class Main {
    public static void main(String[] args) {
       CustomArrayList<Integer> list = new CustomArrayList<>();
       list.add(12);
       list.add(90);
       list.add(90);
       System.out.println(list.get(2));

    }
}
