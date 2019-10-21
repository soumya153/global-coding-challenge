class Program2
{
public static void main(String args[])
{
int i=0,sum=0;
int trader[5]={2,10,9,10,10},risk[5]={9,9,8,10,10},bonus[5]={9,9,8,10,10};
for(risk[i]=0;risk[i]<=trader[i];i++)
{
sum+=bonus[i];
}
System.out.println("biggest total bonus:"+sum);
}
