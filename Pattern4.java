public class Pattern4 {
    // reverse pyramid star
    public static void main(String[] args) {
        int n=8;
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=n-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
