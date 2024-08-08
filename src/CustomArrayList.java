import java.util.Arrays;

public class CustomArrayList<T extends Number> {      //IF WE WANNA USE WILD CARD MEANS MORE TYPE CHECKING ----> extends Number

    private static int DEFAULT_SIZE = 10;
    private int size = 0;
   private Object[] data;

   CustomArrayList(){
       this.data = new Object[DEFAULT_SIZE];
   }

   public void add(T value){
       if(isFull()){
           resize();
       }
       data[size++] = value;
   }

   public T remove(){
    T removed = (T) data[size--];
    return removed;
   }

   public T get(int index){
       return (T)(data[index]);
   }

   public int size(){
       return size;
   }

   public void set(int index,T val){
       data[index] = val;
   }


    private void resize() {
       Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
       return data.length==DEFAULT_SIZE;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + data.length +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
