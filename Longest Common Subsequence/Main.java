#include<iostream>
using namespace std;

int solve(string a, string b){
  int l1 = a.length();
  int l2 = b.length();
  
  int ans[l1+1][l2+1];
  for(int i=0;i<l1+1;i++) ans[i][0] = 0;
  for(int i=0;i<l2+1;i++) ans[0][i] = 0;
  
  for(int i=1;i<=l1;i++){
    for(int j=1;j<=l2;j++){
      if(a[i-1] == b[j-1]) ans[i][j] = ans[i-1][j-1]+1;
      else ans[i][j] = max(ans[i-1][j-1], max(ans[i-1][j], ans[i][j-1]));
    }
  }
  
  return ans[l1][l2];
}

int main(){
  string a,b;
  cin>>a>>b;
  
  cout<<solve(a,b);
  return 0;
}