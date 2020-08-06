#include<bits/stdc++.h>
using namespace std;

struct job{
  int start,finish, index;
};

bool comp(job x, job y){
  if(x.finish == y.finish) return x.start<y.start;
  return x.finish < y.finish;
}

int main(){
  int n;
  cin>>n;
  job a[n];
  for(int i=0;i<n;i++) cin>>a[i].start;
  for(int i=0;i<n;i++) cin>>a[i].finish;
  for(int i=0;i<n;i++) a[i].index = i;
  sort(a, a+n, comp);
  
  if(n==0) exit(0);
  cout<<a[0].index<<" ";
  int index=0;
  for(int i=1;i<n;i++){
    if(a[i].start >= a[index].finish){
      cout<<a[i].index<<" ";
      index = i;
    }
  }
  
  return 0;
}