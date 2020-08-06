#include<iostream>
using namespace std;

int min(int a,int b,int c){
  int ans=a;
  if(b<ans) ans = b;
  if(c<ans) ans = c;
  return ans;
}

int operations(string a, string b){
  int l1 = a.length();
  int l2 = b.length();
  
  int ans[l1 + 1][l2 + 1];
  for(int i=0;i<l1+1;i++) ans[i][0]=i;
  for(int i=0;i<l2+1;i++) ans[0][i]=i;
  
  for(int i=1;i<=l1;i++){
    for(int j=1;j<=l2;j++){
      if(a[i-1] == b[j-1]) ans[i][j] = ans[i-1][j-1];
      else{
        ans[i][j] = 1 + min(ans[i-1][j-1], ans[i][j-1], ans[i-1][j]);
      }
    }
  }
  
  //for(int i=0;i<=l1;i++){
    //for(int j=0;j<=l2;j++){
      //cout<<ans[i][j]<<" ";
    //}
    //cout<<"\n";
  //}
  
  return ans[l1][l2];
}

int main(){
  string a,b;
  cin>>a>>b;  
  cout<<operations(a,b);
  
  return 0;
}