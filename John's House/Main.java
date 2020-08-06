#include <bits/stdc++.h>
using namespace std;

int f(int n, int fib[]){
  if(fib[n]) return fib[n];
  int k=n/2;
  if(n%2==0)
  	fib[n] = (f(k,fib) + 2*f(k-1,fib))*f(k,fib);
  else{
    k++;
    fib[n] = f(k,fib)*f(k,fib) + f(k-1,fib)*f(k-1,fib);
  }
  //cout<<fib[n]<<" ";
  return fib[n];
}

int main() {
  int n;
  cin>>n;
  if(n==1) cout<<0;
  else if(n==2) cout<<7;
  else{
    int fib[101]={0,1,1,2,3,5,8,13};
    int next=12;
    while(log10(f(next,fib)) + 1 < n){
      next++;
    }
    cout<<next;
  }
  
  return 0;
}