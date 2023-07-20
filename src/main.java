public class main {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("Ароза упала на лапу азора"));
        System.out.println(checkPalindrom("кабан упал и лапу набок"));
        System.out.println(checkPalindrom("шабаш"));
        System.out.println(checkPalindrom("ABcbA"));

    }
    private static boolean checkPalindrom (String word){
        char [] chars = word.toLowerCase().toCharArray();
        int left = 0;
        int right = chars.length -1;
        while (left<right){
            if (chars[left]!=chars[right]) {
                return false;
            }
            do{
                left++;
            }while (left<right&&chars[left]==' ');
            do {
                --right;
            }while (right>left&&chars[right]==' ');
        }
        return true;
    }
}