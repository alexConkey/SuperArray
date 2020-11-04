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
    if (data.length <= size){
      resize();
    }
    data[size] = element;
    size++;
    return true;
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
    String[] tempData = new String[size+10];
    for (int i = 0; i < size; i++){
      tempData[i] = data[i];
    }
    data = tempData;
  }
  public boolean isEmpty(){
    return (size==0);
  }
  public void clear(){
    data = new String[10];
    size = 0;
  }

  public String toString(){
    str = "[";
    for (int i = 0; 0 < size-1; i++){
      str += data[i] + ", ";
    }
    str += data[size-1] + "]";
    return str;
  }
  public boolean contains(String s){
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)){
        return true;
      }
    }
    return false;
  }
}
