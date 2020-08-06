#include<bits/stdc++.h>
using namespace std;

void dis(stack<int> s){
  while(!s.empty()){
    cout<<s.top()<<" ";
    s.pop();
  }
  cout<<"\n";
}

int main(){
  string s;
  cin>>s;
  
  stack<int> brkt;
  brkt.push(-1);
  int len=s.length(),maxlen=0;
  for(int i=0;i<len;i++){
    if(s[i] == '(') brkt.push(i);
    else{
      brkt.pop();
      if(brkt.empty()){
        brkt.push(i);
      }
      else
        maxlen = max(maxlen, i-brkt.top());
    }
    
  }
  cout<<maxlen;
  
  return 0;
}