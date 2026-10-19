class Demo{
    public static void main(String args[]){
        int[] numbers={25,10,85,40,60};
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] > max){
                max=numbers[i];
            }
        }
        System.out.println("Largest="+max);
    }
}