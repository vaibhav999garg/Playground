#include<bits/stdc++.h>
#define pb push_back
using namespace std;

vector<int> lon(string s, int start, int end,vector<int> index){
  if(start==end){
    index.pb(start);
    return index;
  }
  if(start>end) return index;
  if(s[start] == s[end]){
    index.pb(start);
    index.pb(end);
    vector<int> a;
    a = lon(s,start+1,end-1,a);
    index.insert(index.end(), a.begin(),a.end());
    return index;
  }
  
    vector<int> a,b;
    a = lon(s,start+1,end,a);
    b = lon(s,start,end-1,b);
    if(a.size() >= b.size())
    	index.insert(index.end(), a.begin(), a.end());
    else
    	index.insert(index.end(), b.begin(), b.end());
    return index;
  
}

int main(){
  string s;
  cin>>s;
  int l = s.length();
  vector<int> index;
  index=lon(s,0,l-1, index);
  //cout<<index.size();
  sort(index.begin(), index.end());
  for(int i=0;i<index.size();i++){
    cout<<s[index[i]];
  }
  
  return 0;
}