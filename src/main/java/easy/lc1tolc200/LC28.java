package easy.lc1tolc200;

public class LC28 {
    public int strStr(String haystack, String needle) {
      if(needle.equals("")){
          return 0;
      }
      return haystack.indexOf(needle);
    }
}
