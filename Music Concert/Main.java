#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int a[n];
  int men=0,women=0;
  for(int i=0;i<n;i++){
    cin>>a[i];
    if(a[i]%2==1) men++;
    else women++;
  }
  cout<<men<<"\n"<<women;
  
  return 0;
}