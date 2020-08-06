#include <bits/stdc++.h>
using namespace std;

class graph{
  int V;
  vector<deque<int>> adj_list;
  bool *visited;
  
  public:
  graph(int v){
    V = v;
    for(int i=0;i<V;i++){
      deque<int> vec;
      adj_list.push_back(vec);
    }
    while(true){
      int a,b;
      cin>>a>>b;
      if(a==-1 || b==-1 || a>=V || b>=V) break;
      adj_list[a].push_front(b);
      adj_list[b].push_front(a);
    }
    visited = new bool[V];
    for(int i=0;i<V;i++) visited[i] = false;
  }
  
  void dfs(int u){
    if(visited[u]) return;
    visited[u] = true;
    cout<<" "<<u;
    for(int i=0;i<adj_list[u].size();i++){
      if(visited[adj_list[u].at(i)] == false){
        dfs(adj_list[u].at(i));
      }
    }
  }
};

int main() {
  int v;
  cin>>v;
  graph g(v);
  cout<<"DFS :";
  for(int i=0;i<v;i++) g.dfs(i);
  
  return 0;
}