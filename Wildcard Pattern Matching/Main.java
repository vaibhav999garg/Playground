#include <bits/stdc++.h>
using namespace std;

int main(){
  string s,p;
  cin>>s>>p;
  
  int l=s.length(), l1 = p.length();
  int i=0,j=0,k=0;
  //finding * or ?
  for(k=0;k<l1;k++){
    if(!(p[k] <=122 && p[k] >=97) && !(p[k] <=90 && p[k] >=65)){
      break;
    }
  }
  
  for(i=0, j=0;i<l && j<k;i++, j++){
    if(s[i] != p[j]){
      cout<<"false";
      exit(0);
    }
  }
  int now = i+1;
  
  if(j != k){
    cout<<"false";
    exit(0);
  }
  
  for(i=l-1,j=l1-1; i>=now, j>=k+1;i--,j--){
    if(s[i] != p[j]){
      cout<<"false";
      exit(0);
    }
  }
  
  cout<<"true";
  
  return 0;
}