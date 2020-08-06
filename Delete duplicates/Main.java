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
  
  cout<<"Linked list before removal of duplicates\n";
  for(auto x:ll) cout<<x<<"\n";
  cout<<"Linked list after removal of duplicates\n";
  if(ll.size() >1){
  	list<int>::iterator itr=ll.begin();
  	unordered_map<int,int> umap;
  	umap.insert(pair<int,int>(*itr,1));
  	advance(itr,1);
  	for(itr;itr!=ll.end();itr++){
	  if(umap.find(*itr) == umap.end()){
        umap.insert(pair<int,int>(*itr,1));
      }
      else{
        ll.erase(itr);
        itr--;
      }
  	}
  }
  for(auto x:ll) cout<<x<<"\n";
  return 0;
}