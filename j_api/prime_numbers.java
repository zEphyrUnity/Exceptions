package j_api;

public class prime_numbers {
    public static void main(String[] args){
        printPrimeNums();
    }

    public static void printPrimeNums(){
        int thousand = 1000;
        boolean isPrime;

        for(int i = 1; i <= thousand; i++){
            isPrime = true;
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
