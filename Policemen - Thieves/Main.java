#include<bits/stdc++.h>
using namespace std;

int thieves_caught(char pos[], int n, int diff){
  int caught=0;
  queue<int> pi, ti;
  for(int i=0;i<n;i++){
    if(pos[i] == 'P') pi.push(i);
    else ti.push(i);
    
    while(!pi.empty() && !ti.empty()){
      if(abs(pi.front() - ti.front()) <= diff){
        caught++;
        pi.pop();
        ti.pop();
      }
      else{
        pi.pop();
      }
    }
  }
  return caught;
}

int main(){
  int n,ans=0;
  cin>>n;
  char pos[n], p=0;
  for(int i=0;i<n;i++){
    cin>>pos[i];
    if(pos[i] == 'P') p++;
  }
  if(p==0 || p==n){
    cout<<"Maximum thieves caught: "<<ans;
    exit(0);
  }
  int k;
  cin>>k;
  ans = thieves_caught(pos, n, k);
  
  cout<<"Maximum thieves caught: "<<ans;
  return 0;
}