import java.util.Scanner;


class LongestPalindromeFinder {
    static void printSubStr(String str, int low, int high){
        System.out.println(str.substring(low, high + 1));
    }
    static int longestPalSubstr(String str){
        int n = str.length();
        boolean table[][] = new boolean[n][n];
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is: ");
        printSubStr(str, start,start + maxLength - 1);
        return maxLength;    
    }
    static boolean isValid(String str){
        String validInput="ACTG";
        int noOfchars=0;
        int n = str.length();
        for (int l = 0; l < n; ++l){
            for(int m=0; m<4;++m){
                if(str.charAt(l)==validInput.charAt(m)){
                    noOfchars++;
                }  
            }
            if(noOfchars==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isValid(str)){
            System.out.println("Length is: " + longestPalSubstr(str));
        }
        else{
            System.out.println("Invalid input!");
        }
    }
}
 