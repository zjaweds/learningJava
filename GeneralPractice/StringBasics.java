class BasicsOfStrings{
    public static void main(String [] a){
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("This string is: "+alphabet);
        System.out.println("Length of the string is: "+alphabet.length());
        System.out.println("The character at index 4 is: "+alphabet.charAt(4));
        System.out.println("The index of the character J is: "+alphabet.indexOf('J'));
        System.out.println("Alphabets in lowercase are: "+alphabet.toLowerCase());
        System.out.println("But the original string is intact. See "+alphabet);
        System.out.println("Substring: "+alphabet.substring(2,7));
        System.out.println("Substring: "+alphabet.substring(2));
    }
}