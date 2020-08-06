#include<bits/stdc++.h>
using namespace std;

string expr(string s){
  int i=0,len=s.length();
  stack<char> sym;
  string res = "";
  reverse(s.begin(), s.end());;
  for(int i=0;i<len;i++){
    if(s[i] == '(') s[i] = ')';
    else if(s[i] == ')') s[i] = '(';
  }
  
  while(i<len){
    if(s[i] == '('){
      sym.push(s[i]);
    }
    else if(s[i] == ')'){
      while(sym.top() != '('){
        char x = sym.top();
        res += x;
        sym.pop();
      }
      sym.pop();
    }
    else if(s[i] <=57 && s[i] >=48){
      res += s[i];
    }
    else{
      if(s[i] == '/' || s[i] == '*'){
        while(!sym.empty() && sym.top() != '(' && sym.top() != '+' && sym.top() != '-'){
          char x = sym.top();
          res += x;
          sym.pop();
        }
        sym.push(s[i]);
      }
      else{
        while(!sym.empty() && sym.top() != '('){
          char x = sym.top();
          res += x;
          sym.pop();
        }
        sym.push(s[i]);
      }
    }
    i++;
    //cout<<res<<" ";
  }
  while(!sym.empty()){
    res += sym.top();
    sym.pop();
  }
  reverse(res.begin(), res.end());
  //cout<<"\n";
  return res;
}

int main(){
  string s;
  cin>>s;
  cout<<expr(s);
  return 0;
}