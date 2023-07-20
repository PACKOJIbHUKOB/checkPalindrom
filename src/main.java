public class main {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("А роза упала на лапу азора"));
        System.out.println(checkPalindrom("кабан упал и лапу набок"));
        System.out.println(checkPalindrom("шабаш"));
        System.out.println(checkPalindrom("ABcbA"));
    }
    private static boolean checkPalindrom (String word){
        char [] chars = word.replace(" ","").toLowerCase().toCharArray();
        int left = 0;
        int right = chars.length -1;
        while (left<right){
            if (chars[left]!=chars[right]) {
                return false;
            }
            left++;
            --right;
        }
        return true;
    }
}