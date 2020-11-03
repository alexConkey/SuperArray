public class Tester {
  public static void main(String[] args) {
    SuperArray mySuperArray = new SuperArray();
    System.out.println(mySuperArray.size());
    for (int i = 0; i < 15; i++){
      mySuperArray.add("Hi"+Integer.toString(i));
    }
    System.out.println(mySuperArray.get(12));
    mySuperArray.set(12, "Not Hi");
    System.out.println(mySuperArray.get(12));
  }
}
