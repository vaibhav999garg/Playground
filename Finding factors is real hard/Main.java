#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  cout<<"1 ";
  if(n==1){
    exit(0);
  }
  if(n%2==1){
    for(int i=3;i<=n;i+=2){
      if(n%i==0) cout<<i<<" ";
    }
    exit(0);
  }
  for(int i=2;i<=n;i++){
    if(n%i==0) cout<<i<<" ";
  }
  
  return 0;
}