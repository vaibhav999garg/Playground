#include <bits/stdc++.h>
using namespace std;

class graph{
  int V, E;
  vector<vector<int>> adj_list;
  
  public:
  graph(int v,int e){
    V = v;
    E = e;
    for(int i=0;i<V;i++){
      vector<int> vec;
      adj_list.push_back(vec);
    }
  }
  
  void display(){
    cout<<"Adjacency List:\n";
    for(int i=0;i<V;i++){
      cout<<i<<"--->";
      for(auto j=0;j<adj_list[i].size();j++){
        cout<<adj_list[i][j]<<" ";
      }
      cout<<"\n";
    }
  }
  
  void add_edges(){
    for(int i=0;i<E;i++){
      cout<<"Enter the Start node and End node of edge "<<i+1<<"\n";
      int sn,en;
      cin>>sn>>en;
      adj_list[sn].push_back(en);
      adj_list[en].push_back(sn);
    }
  }
  
};

int main() {
  int v,e;
  cout<<"Enter the number of vertices:\n";
  cin>>v;
  cout<<"Enter the number of edges:\n";
  cin>>e;
  graph g(v,e);
  g.add_edges();
  g.display();
  
  return 0;
}