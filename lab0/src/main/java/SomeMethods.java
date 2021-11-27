import java.awt.*;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

public class SomeMethods {

    public int MyIntegerTask(int a,int b){
        assert (a>b && b>=0);
        return a/b;
    }

    public boolean MyBoolean(int a, int b){
        return b == 0 || b < -2;
    }

    /**
     * x - positive count
     * y - negative count
     */
    public Point MyIf(int a, int b, int c){
        int pos=0;
        if(a>=0) pos++;
        if(b>=0) pos++;
        if(c>=0) pos++;
        return new Point(pos, 3-pos);
    }
    public float MyCase(float a, float b, int n){
        assert (b!=0);
        switch (n){
            case 1:
                return a+b;
            case 2:
                return a-b;
            case 3:
                return a*b;
            case 4:
                return a/b;
            default:
                throw new IllegalArgumentException("Unknown n");
        }
    }
    public String MyFor(float price){
        StringBuilder builder = new StringBuilder();
        for(int i = 1;i<10;i++){
            builder.append((float)i/10*price+" ");
        }
        return builder.toString();
    }
    public int MyWhile(int n){
        assert (n>0);
        int k =0;
        while (n>1){
            n=(int)Math.sqrt(n);
            k++;
        }
        return k;
    }
    private float P(float[] args){
        return args[0]/args[1];
    }
    public String MyMinMax(float[][] N){
        int pos = 0;
        float max = P(N[0]);
        for (int i = 0; i<N.length;i++){
            float temp = P(N[i]);
            if(temp>max){
                pos=i;
                max = temp;
            }
        }
        return max+";"+pos;
    }
    public int[] MyArray(int n){
        assert (n>2);
        int[] resArr = new int[n];
        resArr[0] = 1;
        resArr[1] = 2;
        for(int i = 2;i<n;i++){
            resArr[i] = resArr[i-1] + resArr[i-2];
        }
        return resArr;
    }
    public float[][] MyMatrix(int m, int n,float d, float[] mas){
        assert (m>=0 && n>=0);
        float[][] res = new float[m][n];
        res[0] = mas;
        for (int i = 1;i<m;i++){
            for(int j = 0;j<n;j++){
                res[i][j] = res[i-1][j]+d;
            }
        }
        return res;
    }


}
