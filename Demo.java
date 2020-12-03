public class Demo{
  public static void removeDuplicates(SuperArray s){
    int[] arr = new int[s.size()];
    int removals = 0;
    for (int i = 0; i < s.size(); i++){
      if (s.indexOf(s.get(i)) != i){
        arr[removals] = i;
        removals++;
      }
    }
    int c = 0;
    for (int i = 0; i < removals; i++){
      s.remove(arr[i]-c);
      c++;
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray finalSA = new SuperArray(1);
    for(int i = 0; i<a.size(); i++){
      if (b.contains(a.get(i))){
        finalSA.add(a.get(i));
      }
    }
    return finalSA;
  }
  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray finalSA = new SuperArray(1);
    if (a.size()>b.size()){
      for(int i = 0; i<b.size(); i++){
        finalSA.add(a.get(i));
        finalSA.add(b.get(i));
      }
      for(int i = b.size(); i<a.size(); i++){
        finalSA.add(a.get(i));
      }
    }else{
      for(int i = 0; i<a.size(); i++){
        finalSA.add(a.get(i));
        finalSA.add(b.get(i));
      }
      for(int i = a.size(); i<b.size(); i++){
        finalSA.add(b.get(i));
      }
    }
    return finalSA;
  }


  public static void main(String[]args){
    SuperArray words = new SuperArray(1);
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }
}
