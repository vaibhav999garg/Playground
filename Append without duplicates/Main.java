#include<bits/stdc++.h>
using namespace std;
int main(){
  list<int> ll;
  int x;
  do{
    cin>>x;
    if(x>=0){
      if(find(ll.begin(), ll.end(), x) == ll.end())
      	ll.push_back(x);
    }
  }while(x>=0);
  
  for(auto x:ll){
    cout<<x<<"\n";
  }
  if(ll.empty()) cout<<"List is empty";
}