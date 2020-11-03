public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    data[size] = element;
    size++;
  }
  public String get(int index){
    return data[index];
  }
  public String set(int index, String element){
    String oldElement = data[index];
    data[index] = element;
    return oldElement;
  }
  private void resize(){
    tempData = new String[size+10];
    for (int i = 0; i < size; i++){
      tempData[i] = data[i];
    }
    data = tempData;
  }
}
