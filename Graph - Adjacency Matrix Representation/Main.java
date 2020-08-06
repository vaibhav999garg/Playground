#include <iostream>
using namespace std;

class graph{
  int V, E;
  bool directed;
  int **adj_mat;
  
  public:
  graph(int v,int e,string dir){
    V = v;
    E = e;
    if(dir == "yes") directed = true;
    else directed = false;
    adj_mat = new int*[V];
    for(int i=0;i<V;i++){
      adj_mat[i] = new int[V];
    }
  }
  
  void display(){
    cout<<"Adjacency Matrix Representation:\n";
    for(int i=0;i<V;i++){
      for(int j=0;j<V;j++){
        cout<<adj_mat[i][j]<<" ";
      }
      cout<<"\n";
    }
  }
  
  void add_edges(){
    for(int i=0;i<E;i++){
      cout<<"Enter the start node, end node and weight of edge no "<<i+1<<"\n";
      int sn,en,w;
      cin>>sn>>en>>w;
      adj_mat[sn-1][en-1] = w;
      if(directed == false){
        adj_mat[en-1][sn-1] = w;
      }
    }
  }
  
};

int main() {
  int v,e;
  cout<<"Please enter the number of nodes in the graph\n";
  cin>>v;
  cout<<"Please enter the number of edges in the graph\n";
  cin>>e;
  string dir;
  cout<<"Is the graph directed\n";
  cin>>dir;
  graph g(v,e,dir);
  g.display();
  g.add_edges();
  g.display();
  
  return 0;
}