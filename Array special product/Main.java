#include<bits/stdc++.h>
using namespace std;

int main(){
  int n;
  cin>>n;
  if(n==0) exit(0);
  int a[n];
  for(int i=0;i<n;i++) cin>>a[i];
  
  int ans[n];
  memset(ans, 1, sizeof(ans));
  int temp=1;
  for(int i=0;i<n;i++){
    ans[i] = temp;
    temp*=a[i];
  }
  temp=1;
  for(int i=n-1;i>=0;i--){
    ans[i] *= temp;
    temp *= a[i];
  }
  for(int i=0;i<n;i++){
    cout<<ans[i]<<"\n";
  }
  
  return 0;
}