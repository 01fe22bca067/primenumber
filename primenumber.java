import java.util.*;

public class primenumber{

    static List<Integer> generatePrimes(int N) {
        
        boolean[] prime = new boolean[N+1];
        Arrays.fill(prime, true);
        
        List<Integer> primes = new ArrayList<>();
        
        for(int p = 2; p*p <= N; p++) {
            
            if(prime[p]) {
                
                
                for(int i = p*p; i <= N; i += p)
                    prime[i] = false;
            }
        }
        for(int p = 2; p <= N; p++) {
            if(prime[p])
                primes.add(p);
        }
        
        return primes;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        List<Integer> primes = generatePrimes(N);
        
        System.out.println("Prime numbers between 1 and " + N + " are:");
        for(int prime : primes) {
            System.out.print(prime + " ");
        }
        scanner.close();
    }
}



