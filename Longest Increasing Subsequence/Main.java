#include <bits/stdc++.h>
using namespace std;

int solve(int a[], int n){
  int ans[n];
  for(int i=0;i<n;i++){
    ans[i] = 1;
    for(int j=0;j<i;j++){
      if(a[j] <= a[i] && ans[i] < ans[j]+1)
        ans[i] = ans[j]+1;
    }
  }
  return *max_element(ans,ans+n);
}

int main() {
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++) cin>>a[i];
  
  cout<<solve(a,n);
  
  return 0;
}