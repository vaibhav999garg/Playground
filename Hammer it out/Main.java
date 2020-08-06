#include<bits/stdc++.h>
using namespace std;

int main(){
  int n;
  cin>>n;
  
  int esum=0,osum=0,i=0;
  while(n){
    if(i%2 == 0) esum +=n%10;
    else osum +=n%10;
    n/=10;
    i++;
  }
  cout<<abs(osum-esum);
  
  return 0;
}