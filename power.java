import java.lang.*;
public class Power{
public static void main(String args[])
{
int a,n,power=1,i;
System.out.println(System.in);
Scanner obj=new Scanner();
a=obj.nextInt();
n=obj.nextInt();
if(a>=1&&n==0)
{
power=1;
}
else if(a==0&&n>=1)
{
power=0;
}
else
{
for(i=1;i<=n;i++)
{
power=a*power;
}
}
System.out.println("pwr of no is"+power);
}}
