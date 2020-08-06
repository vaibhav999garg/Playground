#include<bits/stdc++.h>
using namespace std;

bool redun(string s){
  stack<char> stk;
  int i=0, len=s.length();
  int flag=0;
  while(i<len){
    stk.push(s[i]);
    if(s[i] == ')'){
        stk.pop();
        if(stk.top() == '(') return true;
        while(stk.top() != '('){
          if(!(stk.top() <= 122 && stk.top() >=97))
            flag=1;
          stk.pop();
        }
        if(flag==0) return true;
        stk.pop();
    }
    i++;
  }
  return false;
}

int main(){
  string s;
  cin>>s;
  if(redun(s)) cout<<"Yes";
  else cout<<"No";
  
  return 0;
}