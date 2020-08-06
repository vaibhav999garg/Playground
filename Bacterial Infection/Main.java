#include <iostream>
using namespace std;

int main(){
  int m,n;
  cin>>m>>n;
  int x,y;
  cin>>x>>y;
  x++;
  y++;
  if(x>((m+1)/2)) x = m-x;
  if(y>((n+1)/2)) y = n-y;
  //cout<<x<<" "<<y<<" ";
  cout<<m+n-x-y;
  
  return 0;
}