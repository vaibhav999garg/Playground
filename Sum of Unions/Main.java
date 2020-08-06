#include<bits/stdc++.h>
#define ll long long
#define fast ios::sync_with_stdio(0),cin.tie(0),cout.tie(0)
using namespace std;
int main(){
  fast;
  ll int m,n;
  cin>>m>>n;
  ll int a[m][n];
  for(ll int i=0;i<m;i++){
    for(ll int j=0;j<n;j++){
      cin>>a[i][j];
    }
  }
  ll int x,y;
  cin>>x>>y;
  ll int sum=0;
  for(ll int i=0;i<n;i++) sum+=a[x][i];
  for(ll int i=0;i<m;i++){
    if(i==x) continue;
    sum+=a[i][y];
  }
  cout<<sum;
  
  return 0;
}