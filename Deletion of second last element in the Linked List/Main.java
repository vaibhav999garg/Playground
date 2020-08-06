#include<bits/stdc++.h>
using namespace std;
int main(){
  list<int> ll;
  int x;
  do{
    cin>>x;
    if(x>=0){
      ll.push_back(x);
    }
  }while(x>=0);
  
  if(ll.size() < 2){
    cout<<"Deletion of second last element is not possible";
  }
  else{
    list<int>::iterator itr=ll.begin();
    advance(itr,ll.size()-2);
    ll.erase(itr);
    for(auto x:ll){
      cout<<x<<" ";
    }
  }
}