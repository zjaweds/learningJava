class Password {
	static String getAlphaNumericString(){
        int n;
        int min =8;
        int max = 16;
        n=(int)(Math.random()*(max - min + 1) + min);
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz" + "[!@#$%^&*()_-+=~|/]";
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int index = (int)(AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}
	public static void main(String[] args){
		System.out.println(Password.getAlphaNumericString());
	}
}