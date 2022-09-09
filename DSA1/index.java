public class index{
    public static void main(String[] args){
        String str="Hello";
        char[] charArr=str.toCharArray();
        for(int i=charArr.length-1;i>=0;i--){
            System.out.println(charArr[i]);
        }
    }
}