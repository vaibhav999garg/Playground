#include<iostream>
using namespace std;

long long int power(int b, int p){
  long long int ans=1;
  for(int i=0;i<p;i++) ans *= b;
  return ans;
}

int main()
{
  long long int b,p;
  cin>>b>>p;
  cout<<power(b,p);
  
  return 0;
}