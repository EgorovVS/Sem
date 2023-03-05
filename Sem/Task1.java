package Sem;



//N четное>0, 2 символа
public class Task1 {
    public static void main(String[] args) {
        int N = 6;
        String str1 = "a";
        String str2 = "b";
        print(N,str1,str2);

//        System.out.println("ab".repeat(3));
    }
    public static void print(int length, String str1, String str2){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length/2; i++) {
            stringBuilder.append(str1).append(str2);
        }
        System.out.println(stringBuilder.toString());
    }
}
