#include<iostream>
using namespace std;

int main(){
  int n;
  cin>>n;
  int sum=0;
  int l=0;
  while(sum<n){
    l++;
    sum += 12*l*l;
  }
  cout<<l*8;
  
  return 0;
}