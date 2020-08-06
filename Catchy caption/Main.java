#include <cstring>
#include <iostream>
using namespace std;
int main(){
  string s;
  getline(cin,s);
  if(s.length() > 100){
    cout<<"Caption not eligible for the contest";
    exit(0);
  }
  int spaces=0;
  for(int i=0;i<s.length();i++){
    if(s[i] == ' ' && i != s.length()-1) spaces++;
  }
  if(spaces > 9){
    cout<<"Caption not eligible for the contest";
  }
  else{
    cout<<"Caption eligible for the contest";
  }
  
  
  return 0; 
}