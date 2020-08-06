#include<iostream>
using namespace std;
int main(){
  int amount;
  cin>>amount;
  
  int coin[] = {1,2,5,10,20,50,100,500,1000};
  int j=8;
  while(amount){
    for(int i=0; i < amount/coin[j]; i++){
      cout<<coin[j]<<"  ";
    }
    amount -= coin[j]*(amount/coin[j]);
    j--;
  }
  
  return 0;
}