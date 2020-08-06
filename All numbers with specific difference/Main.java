#include<iostream>
using namespace std;

int sum(int n){
  int s=0;
  while(n){
    s+=n%10;
    n/=10;
  }
  return s;
}

int bin(int start, int end, int diff){
  if(start - sum(start) >= diff) return start;
  
  int mid = (start+end)/2;
  if(mid - sum(start) >= diff) return bin(start+1, mid, diff);
  else return bin(mid+1, end, diff);
}

int main(){
  int t=1;
  //cin>>t;
  while(t--){
    int n,d;
    cin>>n>>d;
    if(n-sum(n) < d){
      cout<<"0\n";
      continue;
    }
    int min = bin(10, n, d);
    cout<<n-min+1<<"\n";
  }
  
  return 0;
}