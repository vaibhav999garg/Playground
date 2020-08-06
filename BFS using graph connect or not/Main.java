#include<bits/stdc++.h>
#define pb push_back
using namespace std;

class graph{
  int V,E;
  vector<vector<int>> adj_list;
  vector<vector<int>> adj_list_opp;
  
  public:
  graph(int v,int e){
    V = v;
    E = e;
    for(int i=0;i<V;i++){
      vector<int> vec,ves;
      adj_list.pb(vec);
      adj_list_opp.pb(ves);
    }
  }
  
  void addEdge(int u,int v){
    adj_list[u].pb(v);
    adj_list_opp[v].pb(u);
  }
  
  bool isConnected(){
    if(V==1 || V==0) return true;
    
    vector<bool> visited(V,false);
    queue<int> q;
    q.push(0);
    while(!q.empty()){
      int x = q.front();
      q.pop();
      if(visited[x]) continue;
      visited[x] = true;
      for(int i=0;i<adj_list[x].size();i++){
        if(visited[adj_list[x][i]] == false){
          q.push(adj_list[x][i]);
        }
      }
    }
    
    for(int i=0;i<V;i++){
      if(visited[i] == false) return false;
      visited[i] = false;
    }
    
    q.push(0);
    while(!q.empty()){
      int x = q.front();
      q.pop();
      if(visited[x]) continue;
      visited[x] = true;
      for(int i=0;i<adj_list_opp[x].size();i++){
        if(visited[adj_list_opp[x][i]] == false){
          q.push(adj_list_opp[x][i]);
        }
      }
    }
    
    for(int i=0;i<V;i++){
      if(visited[i] == false) return false;
    }
    
    return true;
    
  }
  
};

int main(){
  int v,e;
  cin>>v>>e;
  graph g(v,e);
  for(int i=0;i<e;i++){
    int u,v;
    cin>>u>>v;
    g.addEdge(u,v);
  }
  
  if(g.isConnected()) cout<<"Yes";
  else cout<<"No";
  
  return 0;
}