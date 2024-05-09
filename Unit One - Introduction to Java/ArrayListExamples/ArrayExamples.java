public class ArrayExamples {
    
    public static void main(String[] args){
        exampleOne();
        //exampleTwo();
        //exampleThree();
        //exampleFour();
        //exampleFive();
    }

        public static void exampleOne(){
            boolean[] arr = new boolean[5];
            for(boolean el:arr)
                System.out.println(el);
        }
                    
        

        public static void exampleTwo(){
            int[] marks = new int[10];
            for(int i=0; i<marks.length; i++){
                marks[i] = (int)(Math.random()*41)+60;
            }
            for(int el:marks){
                System.out.println(el);
            }
        }

        public static void exampleThree(){
            int[] marks = new int[10];
            for(int mark:marks){
                mark = (int)(Math.random()*41)+60;
            }
            for(int el:marks){
                System.out.println(el);
            }
        }

        public static void exampleFour(){
            int[] arr = {5,3,2,5,7,-1};

            for(int el:arr){
                System.out.println(el);
            }
        }

        public static void exampleFive(){
            String[] words = {"Hello", "hi", "tada"};

            for(String str:words){
                System.out.println(str.length());
            }
        }
    }

