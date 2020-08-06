#include<iostream>
using namespace std;

int fun(int n,int k){
  if(n==1) return 1;
  return (fun(n-1,k) + k-1)%n +1;
}

int main(){
  int n,k;
  cin>>n>>k;
  cout<<fun(n,k);
  
  return 0;
}