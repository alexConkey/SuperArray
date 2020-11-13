public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(int initialCapacity){
    if (initialCapacity<0){
      throw new IllegalArgumentException("initialCapacity " + initialCapacity + " cannot be negative");
    }
    data = new String[initialCapacity];
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
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " must be greater than or equal to 0 and less than or equal to size")
    }
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
    String str = "[";
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
  public void add(int index, String element){
    if (data.length <= size+1){
      resize();
    }
    int afterIndex = 0;
    String[] tempData = new String[size+10];
    for(int i = 0; i < size+1; i++){
      if(i == index){
        afterIndex = 1;
        tempData[i] = element;
        tempData[i+1]= data[i];
      }else{
        tempData[i+afterIndex] = data[i];
      }
    }
    data = tempData;
    size++;
  }
  public String remove(int index){
    String removed = data[index];
    int afterIndex = 0;
    String[] tempData = new String[size+10];
    for(int i = 0; i < size-1; i++){
      if(i == index){
        afterIndex = 1;
        tempData[i] = data[i+1];
      }else{
        tempData[i] = data[i+afterIndex];
      }
    }
    data = tempData;
    size--;
    return removed;
  }
  public int indexOf(String s){
    for(int i = 0; i < size; i++){
      if(s.equals(data[i])){
        return i;
      }
    }
    return -1;
  }
  public String[] toArray(){
    String[] tempData = new String[size];
    for (int i = 0; i < size; i++){
      tempData[i] = data[i];
    }
    return tempData;
  }
  public int lastIndexOf(String value){
    for (int i = size-1; i >= 0; i--){
      if(value.equals(data[i])){
        return i;
      }
    }
    return -1;
  }
  public boolean equals(SuperArray other){
    if (size == other.size()){
      for (int i = 0; i<size; i++){
        if (data[i] != other.get(i)){
          return false;
        }
      }
      return true;
    }
    return false;
  }
}
