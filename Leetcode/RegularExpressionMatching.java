public class RegularExpressionMatching {
    public boolean isMatch(String s, String a){
        int sl = s.length();
        int al = a.length();
        if(sl != al){
            return false;
        }
        for(int i=0; i<sl; i++){
            if(s.charAt(i) != a.charAt(i) && a.charAt(i) != '.'){
                return false;
            }

        }
        return true;
    }
}
