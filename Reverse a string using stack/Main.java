#include<bits/stdc++.h>
using namespace std;

string rev(string s){
  stack<char> stk;
  int len = s.length();
  for(int i=0;i<len;i++){
    stk.push(s[i]);
  }
  for(int i=0;i<len;i++){
    s[i] = stk.top();
    stk.pop();
  }
  return s;
}

int main(){
  string s;
  cin>>s;
  cout<<rev(s);
  
  return 0;
}