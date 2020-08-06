#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++) cin>>a[i];
  int alex;
  cin>>alex;
  int flag=0;
  for(int i=0;i<n;i++){
    if(a[i] == alex){
      flag =1;
      break;
    }
  }
  if(flag) cout<<"She passed her exam";
  else cout<<"She failed";
  
  return 0;
}