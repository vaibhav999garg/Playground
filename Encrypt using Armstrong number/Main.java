#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int dig=0;
  int sum=0,num=n;
  while(num){
  	dig++;
    num/=10;
  }
  num=n;
  while(num){
  	sum+=power(num%10,dig);
    num/=10;
  }
  if(sum==n) return 1;
  return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}