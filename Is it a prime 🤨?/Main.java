#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int n;
  cin>>n;
  string p="Prime",np="Not Prime";
  if(n<=1) cout<<np;
  else{
    int flag=1;
    for(int i=2;i<=sqrt(n);i++){
      if(n%i==0){
        cout<<np;
        flag=0;
        break;
      }
    }
    if(flag) cout<<p;
  }
  return 0;
}