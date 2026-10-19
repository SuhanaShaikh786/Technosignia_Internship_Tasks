class Demo{
    public static void main(String args[]){
        int[] num={10,20,15,21,80,11};
        int min = num[0];

        for(int i=1;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Smallest Number:"+min);
    }
}