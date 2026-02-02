public class forloops {
    public static void main (String[] args){
        for (int steps = 1000; steps<=5000; steps+= 1000){
            System.out.println("completed" + steps + "steps");
        }
        int j = 0;
        while (j<1){
            System.out.println("hello world");
            j = j + 1;

        }
        int k = 1;
        while (k <=5){
            System.out.println("this is loop number" + k);
            k++;
        }

        for (int i = 1; i < 1000000000; i = i * 10){
            System.out.println(i); 
        }

        int sum = 0;
        int i = 1;
        while(i <= 10){
            sum = sum + i;
            i++;
            System.out.println(sum);
        }

        int n = 4567899;
        int res = 0;
        while(n > 0){
            res = res + n % 10;
            n = n / 10;

            System.out.println(res);
        }

        //factorial !6 = 6.5.4.3.2.1
        int f = 6;
        int result = 1;
        while (f > 0){
            result = result * f;
            f--;
            System.out.println(result);
        }
        
            


        
        
    }
}







// initialisation
// while(condition)
// update

//for(initoalisation; condition ; update)
