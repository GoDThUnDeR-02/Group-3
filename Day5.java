public class Day5 {
    /**
     * @param args
     */
    public static void main(String[] args){
    String str = "Mercedes";

    System.out.println(str.substring(3,5 ));

    

    String stringBits(String str) {
        String s="";
        for(int i = 0; i < str.length(); i++){
          if(i%2 == 0){
          s = s + str.charAt(i);
          //s += str.charAt(i);
          }
        }
        return s;
      }
    

    public String stringTimes(String str, int n) {
        String s ="";
        for(int i = 0; i < n; i++){
          s = str + s;
        }
        return s;
      }

    }
}
