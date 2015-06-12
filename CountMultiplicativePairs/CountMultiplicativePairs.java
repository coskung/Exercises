package Codility;
/**
 * @author hcg
 */
public class CountMultiplicativePairs {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int n=A.length;
        if(n==0 || n==1)
            return 0;
        if(B.length<=1)
            return 0;
        
        int count=0;
        float[] C = new float[n];
        for(int i=0;i<n;i++){
            C[i]=A[i]+((float)B[i]/1000000);
            //System.out.println(C[i]);
            }
        for(int i=0;i<n-1;i++){
            if(C[i]>=2.0 && C[i+1]>=2.0){
                count+=((n-1-i)*(n-i))/2;
                //System.out.println(C[i]+"---"+count);
                i=n;
            }    
            else{
                for(int j=i+1;j<n;j++){
                    //System.out.println(C[i]+"---"+C[j]+"--"+(C[i]*C[j]));
                    //System.out.println(C[i].multiply(C[j]));
                    //System.out.println(C[i].add(C[j]));
                    if((C[i]*C[j])>=(C[i]+(C[j]))){
                        count++;
                        //System.out.println(C[i]+"---"+C[j]);
                        }
                    }
                }
    }

    if(count>1000000000)
        return 1000000000;

    return count;    
    }
}
