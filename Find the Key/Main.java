#include<iostream>
#include<cmath>
using namespace std;

int main(){
  int a,b,c;
  cin>>a>>b>>c;
  
  int ans=0;
  for(int i=0;i<4;i++){
    if(i%2==0){
      int max = (a/(int)pow(10,i))%10;
      if(max < (b/(int)pow(10,i))%10) max = (b/(int)pow(10,i))%10;
      if(max < (c/(int)pow(10,i))%10) max = (c/(int)pow(10,i))%10;
      ans += max*pow(10,i);
  	}
    else{
      int max = (a/(int)pow(10,i))%10;
      if(max > (b/(int)pow(10,i))%10) max = (b/(int)pow(10,i))%10;
      if(max > (c/(int)pow(10,i))%10) max = (c/(int)pow(10,i))%10;
      ans += max*pow(10,i);
  	}
  }
  cout<<ans;
  return 0;
}