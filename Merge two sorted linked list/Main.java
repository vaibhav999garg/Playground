#include<bits/stdc++.h>
using namespace std;

list<int> merge_ll(list<int> l1, list<int> l2){
  list<int> l3;
  while(!l1.empty() && !l2.empty()){
    if(l1.front() <= l2.front()){
      l3.push_back(l1.front());
      l1.pop_front();
    }
    else{
      l3.push_back(l2.front());
      l2.pop_front();
    }
  }
  while(!l1.empty()){
    l3.push_back(l1.front());
    l1.pop_front();
  }
  while(!l2.empty()){
    l3.push_back(l2.front());
    l2.pop_front();
  }
  return l3;
}

int main(){
  int n1,n2;
  list<int> l1,l2;
  cin>>n1;
  for(int i=0;i<n1;i++){
    int x;
    cin>>x;
    l1.push_back(x);
  }
  cin>>n2;
  for(int i=0;i<n2;i++){
    int x;
    cin>>x;
    l2.push_back(x);
  }
  list<int> ans;
  ans = merge_ll(l1,l2);
  for(auto x:ans) cout<<x<<"->";
  cout<<"NULL";
  
  return 0;
}