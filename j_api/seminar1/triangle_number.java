package j_api.seminar1;

public class triangle_number {
    public static void main(String[] args){

        System.out.println(countNTriangle(5));

    }

    public static int countNTriangle(int n){
        int simple = 0;

        for(int i = 1; i <= n; i++){
            simple += i;
        }

        return simple;
    }
}
