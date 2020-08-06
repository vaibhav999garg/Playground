#include<iostream>
#include<cmath>
using namespace std;

bool isA(int n){
  int num=n,sum=0,dig=0;
  while(num){
    dig++;
    num/=10;
  }
  num=n;
  while(num){
    sum += pow(num%10, dig);
    num/=10;
  }
  if(sum==n) return true;
  return false;
}

int main(){
  int n;
  cin>>n;
  if(isA(n)) cout<<"Yes";
  else cout<<"No";
  
  return 0;
}