#include <iostream>
using namespace std;

void swap(char &a, char &b){
  char temp = a;
  a = b;
  b = temp;
}

int main() {
  string s;
  cin>>s;
  int l=s.length();
  int low=0,high=l-1;
  while(low<high){
    while(low < l-1 && s[low] == '1') low++;
    while(high >0 && s[high] == '0') high--;
    if(low<high){
      swap(s[low], s[high]);
      low++;
      high--;
    }
  }
  cout<<s;
  return 0;
}