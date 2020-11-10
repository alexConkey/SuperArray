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
    for (int i = 0; i < removals; i++){
      s.remove(i);
    }
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
