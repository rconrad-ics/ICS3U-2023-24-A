package Loops;

public class ECOOContest {
    public static void main(String[] args) {
        frame2010(3,4,1,2);
        
    }

    
    private static void frame2010(int M, int N, int P, int Q) {
        for(int i=0; i<Q; i++){
            for(int j=0; j<2*P+2*Q+N; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        for(int i=0; i<P; i++){
            // frame + matting + frame
            for(int j=0; j<Q;j++){
                System.out.print("#");
            }
            for(int j=0; j<N+2*P;j++){
                System.out.print("+");
            }
            for(int j=0; j<Q;j++){
                System.out.print("#");
            }
            System.out.println();
        }

        for(int i=0; i<M;i++){
             for(int j=0; j<Q;j++){
                System.out.print("#");
            }
            for(int j=0; j<P;j++){
                System.out.print("+");
            }
            for(int j=0; j<N;j++){
                System.out.print(".");
            }
            for(int j=0; j<P;j++){
                System.out.print("+");
            }
            for(int j=0; j<Q;j++){
                System.out.print("#");
            }
            System.out.println();
        }

        for(int i=0; i<P; i++){
            // frame + matting + frame
            for(int j=0; j<Q;j++){
                System.out.print("#");
            }
            for(int j=0; j<N+2*P;j++){
                System.out.print("+");
            }
            for(int j=0; j<Q;j++){
                System.out.print("#");
            }
            System.out.println();
        }


        for(int i=0; i<Q; i++){
            for(int j=0; j<2*P+2*Q+N; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
