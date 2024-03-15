
  #include <iostream>

using namespace std;

int main()
{
double Salary,ElectricityCost,MerchandiseCost,StoreRent;
cout<<"Enter the full employee salary:";
cin>>Salary;
cout<<"Enter the electricity cost:";
cin>>ElectricityCost;
cout<<"Enter the total cost of merchandise:";
cin>>MerchandiseCost;
cout<<"Enter the rent:";
cin>>StoreRent;

double Expenses= Salary+ElectricityCost+MerchandiseCost+StoreRent;
double NetProfit=MerchandiseCost*0.10;
double NewNetProfit=NetProfit/0.85;
double MarkUp=(NewNetProfit+Expenses)/MerchandiseCost;
 cout<<"Merchandise marked up so that Linda gets the desired profit is "<<MarkUp;
    return 0;
}


