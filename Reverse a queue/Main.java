#include<bits/stdc++.h>
using namespace std;

void dis(queue<int> q){
  while(!q.empty()){
    cout<<q.front()<<" ";
    q.pop();
  }
  cout<<"\n";
}

int main(){
  queue<int> q;
  int x;
  do{
    cin>>x;
    if(x>=0) q.push(x);
  }while(x>=0);
  if(q.empty()){
    cout<<"Queue is empty";
    exit(0);
  }
  cout<<"Before reversing:\n";
  dis(q);
  
  stack<int> s;
  while(!q.empty()){
    s.push(q.front());
    q.pop();
  }
  while(!s.empty()){
    q.push(s.top());
    s.pop();
  }
  
  cout<<"After reversing:\n";
  dis(q);
  return 0;
}