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
      if(a==-1 || b==-1) break;
      adj_list[a].push_front(b);
      adj_list[b].push_front(a);
    }
    visited = new bool[V];
    for(int i=0;i<V;i++) visited[i] = false;
  }
  
  void bfs(){
    if(V<=0) return;
    queue<int> q;
    int flag=0;
    for(int i=0;i<V;i++){
      if(visited[i] == false){
        q.push(i);
        visited[i] = true;
        flag=1;
        break;
      }
    }
    if(flag==0) return;
    while(!q.empty()){
      int u=q.front();
      q.pop();
      cout<<" "<<u;
      
      for(int i=0;i<adj_list[u].size();i++){
        if(visited[adj_list[u].at(i)] == false){ 
          q.push(adj_list[u].at(i));
          visited[adj_list[u].at(i)] = true;
        }
      }
    }
  }
};

int main() {
  int v;
  cin>>v;
  if(v==0){
    cout<<"Graph doesn't exist";
    exit(0);
  }
  graph g(v);
  cout<<"BFS : ";
  queue<int> q;
  for(int i=0;i<v;i++) g.bfs();
  
  return 0;
}