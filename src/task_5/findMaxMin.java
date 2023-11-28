package task_5;

public class findMaxMin {
    int a;
    int b;
    int c;

    public findMaxMin(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int findMax(){
        if(a>b && a>c){
            return a;
        } else if (b>a && b>c) {
            return b;
        } else if (c>a && c>b) {
            return c;
        }
        return 0;
    }

    public int findMin(){
        if(a<b && a<c){
            return a;
        } else if (b<a && b<c) {
            return b;
        } else if (c<a && c<b) {
            return c;
        }
        return 0;
    }
    public int multiplyMaxMin(){
         return findMax()*findMin();
    }
}
