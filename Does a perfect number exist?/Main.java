#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  string y="Yes",no="No";
  if(n==1) cout<<y;
  else{
    int sum=1;
    for(int i=2;i<n;i++){
      if(n%i==0) sum+=i;
      if(sum > n) break;
    }
    if(sum==n) cout<<y;
    else cout<<no;
  }
  
  return 0;
}