package pattern;

public class prac16 {
    public void pattern1(){
        int rows=5;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;++j)
            {
                System.out.println("*");
            }
        }
    }
    

    public void pattern2(){
        int rows=5;
        for(int i=1;i<=rows;++i)
        {
            for(int j=1;j<=i;++j)
            {
                System.out.println(j+"");
            }
            System.out.println();
        }
    }
    public void pattern3(){
        int row=5;
        for(int i=row;i>=1;--i)
        {
            for(int j=1;j<=i;++j)
            {
                System.out.println();
            }
            System.out.println();
        }
    }
    public void pattern4(){
        int row=5;
        for(int i=row;i>=1;--i)
        {
            for(int j=1;j<=i;++j)
            {
                System.out.println(j+"");
            }
            System.out.println();
        }
    }
    public void pattern5()
    {
        int alphabet='A';
        int rows=5;
        for(int i=0;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.println((char)alphabet+"");
            }
            alphabet++;
            System.out.println();
        }
    }

}