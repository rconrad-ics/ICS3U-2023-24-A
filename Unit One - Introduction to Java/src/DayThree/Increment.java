package DayThree;

public class Increment {
    public static void main(String [] args){
       // for(int x = 1; x<10; x*=2){
       //     System.out.println(x);
       // }
/*
        System.out.println((double)2/4+3);
        System.out.println((double)(2/4)+3);
        System.out.println((double)(2/4+3));

        
        int a = 5;
        int b = 2;
        double c = 3.0;
        System.out.println (5+a/b*c-1);

        double firstDouble = 2.5;
        int firstInt = 30;
        int secondInt = 5;
        double secondDouble = firstInt-secondInt/firstDouble+2.5;
        System.out.println(secondDouble);

        int a = 3+2*3;
        int b = 4+3/2;
        int c = 7%4+3;
        double d = a+b+c;
        System.out.println(d);

        System.out.println(404/10*10+1);

        int n = 3;
        int result = 2*n;
        result = result +1;

        int result2 = n+1;
        result2 = result2*2;

        int result3 = (n+1)*2;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        int a = 5;
        int b = 3;
        int c = a;
        int d = b;
        c +=3;
        d--;
        double num = c;
        num /=d;
        System.out.println(num);
         
        int x = 5;
        int y = 6;
        boolean z = false;
        z = (x+y)/2;
        System.out.println(z);
        
        System.out.print("Hello System.out.println");
        System.out.print("!!!");
        
        int x = 5;
        int y = 3;
        int temp = x;

        y=x;
        temp =x;

        System.out.println(x);
        System.out.println(y);
        

        int x =7;
        int y =2;
        double a =7.0;
        double b = 2;
        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+b);
        System.out.println();
        System.out.println(x/y);
        System.out.println(a/b);
        System.out.println(x/b);
        System.out.println(y/x);
        System.out.println(x%y);

        int numberOfStudents = 15;
        System.out.println(numberOfStudents);
        numberOfStudents = numberOfStudents + 3;
        System.out.println(numberOfStudents);
        numberOfStudents += 3;
        System.out.println(numberOfStudents);
        numberOfStudents++;
        System.out.println(numberOfStudents);
        numberOfStudents--;
        System.out.println(numberOfStudents);
        numberOfStudents+=4;
        System.out.println(numberOfStudents);
        numberOfStudents/=3;
        System.out.println(numberOfStudents);
        numberOfStudents%=2;
        System.out.println(numberOfStudents);
        numberOfStudents++;
        System.out.println(numberOfStudents);
        numberOfStudents*=4;
        System.out.println(numberOfStudents);
        numberOfStudents--;
        System.out.println(numberOfStudents);
        */
        int num = 8534;
        int ones = (num/1000);
        int x = num-1000*ones;
        System.out.println(ones);
        int tens = (x/100);
        int y = x-100*tens;
        System.out.println(tens);
        int huns = (y/10);
        System.out.println(huns);
        int thou = (y-10*huns);
        System.out.println(thou);
        int sum = ones+tens+huns+thou;
        System.out.print(sum);
/*
        int l =10;
        int w = 3;
        int a = l*w;
        System.out.print("area is"+a+"sq units");
        */
    }
}
