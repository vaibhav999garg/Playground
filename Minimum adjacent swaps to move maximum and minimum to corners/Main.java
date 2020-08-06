#include<iostream>
using namespace std;

int main(){
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++) cin>>a[i];
  
  int maxele=a[0],maxi=0,minele=a[n-1],mini=n-1;
  for(int i=1;i<n;i++){
    if(maxele < a[i]){
      maxele = a[i];
      maxi=i;
    }
    if(minele > a[i]){
      minele = a[i];
      mini=i;
    }
  }
  int ans=maxi+n-1-mini;
  cout<<ans;
  
  return 0;
}