#include <bits/stdc++.h>
#define mp make_pair
using namespace std;

int paths(int **cells, int n, int x, int y, set<pair<int,int>> s){
  if(x<0 || x>=n || y<0 || y>=n) return 0;
  if(cells[x][y] == 1) return 0;
  if(x==n-1 && y==n-1) return 1;
  int n1 = s.size();
  s.insert(mp(x,y));
  int n2 = s.size();
  if(n1 == n2) return 0;
  //cout<<x<<" "<<y<<" \n";
  return paths(cells, n, x, y+1, s) + paths(cells, n, x, y-1, s) + paths(cells, n, x+1, y, s) + paths(cells, n, x-1, y, s);
}

int main() {
  int n;
  cin>>n;
  int **cells;
  cells = new int*[n];
  for(int i=0;i<n;i++){
    cells[i] = new int[n];
    for(int j=0;j<n;j++){
      cin>>cells[i][j];
    }
  }
  set<pair<int,int>> s;
  cout<<paths(cells, n, 0, 0, s);
  
  return 0;
}