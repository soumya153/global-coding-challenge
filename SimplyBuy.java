class SimplyBuy
{
public static void main(String args[])
{
int finalA,months=10,answer;
int no_of_payments=14;
int initial_debt=1000,interestP=5;
int Debt_after_interest,debt_after_repayment;
for(months=1;months<=10;months++)
{
for(finalA=0;finalA<50;finalA++)
{
debt_after_interest=initial_debt+0.05*(initial_debt);
debt_after_repayment=Debt_after_interest-0.1*(initial_debt);
finalA=debt_after_interest-debt_after_repayment;
}
}
answer=no_of_payments*0.1*(initial_debt)+finalA+100;
System.out.println("answer:"+answer);
}
}



