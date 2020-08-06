#include<iostream>
#define ll long long
using namespace std;

ll int SumNumbersDivisible(ll int m,ll int n){
  if(n<15) return 0;
  ll int sum=0;
  
  //ll int add = 15*( ((n-1)/15) * (((n-1)/15) +1) / 2 );
  //ll int sub = 15*( (m/15) * ((m/15) +1) / 2 );
  //sum=add-sub;
  
  //for(int i=m+1;i<n;i++){
  //  if(i%15==0) sum += i;
  //}
  
  int i = m + 15 - m%15;
  if(m%15==0) i=m;
  for(;i<n;i+=15) sum+=i;
  
  return sum;
}

int main(){
  ll int m,n;
  cin>>m>>n;
  cout<<SumNumbersDivisible(m,n);
  
  return 0;
}