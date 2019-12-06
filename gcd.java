class gcd{
    public static int find_gcd(int a, int b){
        if(b==0){
            return a;
        }

        return find_gcd(b, a%b);
        
    }
    public static void main(String args[]){
        int a = 729;
        int b = 63;
        System.out.println(find_gcd(a, b));

        int arr[] = new int[]{2, 4, 6, 8, 16 };

        int result = arr[0];
        for(int i=1;i<arr.length;i++){
            result = find_gcd(arr[i], result);
            if(result == 1){
                break;
            }
        }
        System.out.println(result);
    }
}