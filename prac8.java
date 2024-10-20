import java.util.*;
public class prac8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and column of first matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
         int a[][]=new int[n][m];
        System.out.println("enter the values of first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter data = ");
                a[i][j]=sc.nextInt();
            }
            System.out.println();

        }
        System.out.println("enter the number of rows and column of second matrix");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int b[][]=new int[p][q];
        System.out.println("enter the values of second matrix");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.println("enter data = ");
                b[i][j] =sc.nextInt();
            }
            System.out.println();
        }
        matrixmulti(a,b,m,n,p,q);
    }
    public static void matrixmulti(int [][]a,int [][]b,int m,int n,int p,int q){
        int c[][]=new int[n][q];
        if(m !=p){
            System.out.println("multiplication not possible");
        }
        else{
            for(int i=0;i<n;i++){
                for(int  j=0;j<q;j++){
                    for (int k=0;k<m;k++){
                        c[i][j]+=a[i][j]*b[k][j];
                    }
                }
            }
        }
        System.out.println("resultant is");
        for(int i=0;i<n;i++){
            for(int j=0;j<q;j++){
                System.out.println(c[i][j]+ " ");

        }
        System.out.println();

    }
}
}
