#include <bits/stdc++.h>
using namespace std;

bool isprime(int n){
  if(n<2) return false;
  if(n==2) return true;
  if(n%2==0) return false;
  for(int i=3;i<=sqrt(n);i+=2){
    if(n%i==0) return false;
  }
  return true;
}

int main() {
  int a,b;
  cin>>a>>b;
  int gcd = __gcd(a,b);
  if(gcd == 1) cout<<"-1";
  else{
    int max=0;
    if(gcd%2==0){
      max=2;
      gcd/=2;
    }
    for(int i=3;i<=sqrt(gcd);i+=2){
      while(gcd%i==0){
        max=i;
        gcd/=i;
      }
    }
    if(isprime(gcd)) cout<<gcd;
    else cout<<max;
  }
  
  return 0;
}