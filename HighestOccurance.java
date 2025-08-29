package javaPrograms;

public class HighestOccurance {

	public static void main(String[] args) {
		String name="persistent";

        String s[]=name.split("");
        int count=0;
        String maxChar="";

        for(int i=0; i<s.length; i++) {

            int cc=1;
            for(int j=i+1; j<s.length; j++) {
                if(s[i].compareTo(s[j])==0) {
                    cc++;
                }
            }

            if(!maxChar.contains(s[i])) {
                if(cc>count) {
                    count=cc;
                    maxChar=s[i];
                }else if(cc==count) {
                    maxChar=maxChar+" & "+s[i];
                }
            }
        }
        System.out.println("highest occ:{"+maxChar+"}  "+count+" times");

	}

}
