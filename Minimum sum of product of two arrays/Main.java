#include<iostream>
using namespace std;

int minSum(int a[], int b[], int n, int k){
  int tsum=0, maxdiff=0;
  for(int i=0;i<n;i++){
    int diff=0;
    int now = a[i]*b[i];
    tsum += now;
    
    if(now > 0 && a[i] < 0){
      diff = now - (a[i] + 2*k)*b[i];
    }
    else if(now > 0 && a[i] > 0){
      diff = now - (a[i] - 2*k)*b[i];
    }
    else if(now < 0 && a[i] < 0){
      diff = now - (a[i] - 2*k)*b[i];
    }
    else if(now < 0 && a[i] > 0){
      diff = now - (a[i] + 2*k)*b[i];
    }
    
    if(diff> maxdiff) maxdiff = diff;
  }
  return tsum - maxdiff;
}

int main(){
  int n;
  cin>>n;
  int a[n], b[n];
  for(int i=0;i<n;i++) cin>>a[i];
  for(int i=0;i<n;i++) cin>>b[i];
  int k;
  cin>>k;
  
  cout<<minSum(a,b,n,k);
  return 0;
}