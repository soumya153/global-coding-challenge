class Program4
{
public static void main(String args[])
{
int i,j,sum1=0,sum2=0,sum=0;
int v[3]={6,10,12},c[3]={30,60,90};
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(v[i+1]>v[i])
sum1+=0;
if(c[j+1]>c[j])
sum2+=0;
}
}
sum=sum1+sum2;
System.out.println("sum is:"+sum);
}
