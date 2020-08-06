#include<iostream>
using namespace std;

int rsum(int n){
  int sum=0;
  while(n){
	sum += n%10;
    n/=10;
  }
  if(sum<10) return sum;
  else return rsum(sum);
}

int main(){
  int n;
  cin>>n;
  
  cout<<rsum(n);
  
  return 0;
}