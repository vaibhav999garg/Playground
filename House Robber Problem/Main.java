#include<bits/stdc++.h>
using namespace std;

int main(){
  int n;
  cin>>n;
  int a[n], sum1=0,sum2=0;
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  
  if(n==1){
    cout<<a[0];
    exit(0);
  }
  else if(n==2){
    cout<<(a[1]>a[0]?a[1]:a[0]);
    exit(0);
  }
  else{
    sum1=a[0];
    sum2=0;
    for(int i=1;i<n;i++){
      int x=sum1;
      sum1 = sum2+a[i];
      sum2 = max(x,sum2);
    }
  }
  
  if(sum1>=sum2) cout<<sum1;
  else cout<<sum2;
  
  return 0;
}