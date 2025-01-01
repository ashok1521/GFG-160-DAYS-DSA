class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
    int l1=Integer.MIN_VALUE;
    int l2=Integer.MIN_VALUE;
    for(int num:arr)
    {
        if(num>l1)
        {
             l2=l1;
            l1=num;
           
        }
        else if(num>l2&&num!=l1)
        {
            l2=num;
        }
    }
    return (l2==Integer.MIN_VALUE)?-1:l2;
        
    }
}
