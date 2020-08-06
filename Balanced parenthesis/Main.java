#include<bits/stdc++.h>
using namespace std;

bool balanced(string s){
  stack<char> stk;
  int i=0,len=s.length();
  while(i<len){
    stk.push(s[i]);
    if(s[i] == ')'){
      stk.pop();
      if(stk.empty()) return false;
      if(stk.top() == '(') stk.pop();
      else return false;
    }
    else if(s[i] == '}'){
      stk.pop();
      if(stk.empty()) return false;
      if(stk.top() == '{') stk.pop();
      else return false;
    }
    else if(s[i] == ']'){
      stk.pop();
      if(stk.empty()) return false;
      if(stk.top() == '[') stk.pop();
      else return false;
    }
    i++;
  }
  if(!stk.empty()) return false;
  else return true;
}

int main(){
  string s;
  cin>>s;
  if(balanced(s)) cout<<"Balanced";
  else cout<<"Not Balanced";
  return 0;
}