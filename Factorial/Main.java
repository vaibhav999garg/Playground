#include<iostream>
using namespace std;

long long int fact(int n){
  if(n<2) return 1;
  return n*fact(n-1);
}

int main(){
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
  return 0;
}