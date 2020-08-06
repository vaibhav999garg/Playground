#include <bits/stdc++.h>
using namespace std;

int no_of_ways(int n, int *ways){
  //cout<<n<<" ";
  if(n<0) return 0;
  if(n==0) return 1;
  if(ways[n]) return ways[n];
  
  ways[n] = no_of_ways(n-1, ways) + no_of_ways(n-2, ways);
  return ways[n];
}

int main() {
  int n;
  cin>>n;
  int ways[n+1];
  memset(ways, 0, sizeof(ways));
  cout<<no_of_ways(n, ways);
  return 0;
}