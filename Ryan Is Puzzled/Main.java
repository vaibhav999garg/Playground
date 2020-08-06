#include<iostream>
using namespace std;

void swap(int &a, int &b){
  int temp = a;
  a = b;
  b = temp;
}

int main(){
  int r,c;
  cin>>r>>c;
  int n = r>c?r:c;
  int a[n][n];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
      if(i==j) continue;
      swap(a[i][j] , a[j][i]);
    }
  }
  for(int i=0;i<c;i++){
    for(int j=0;j<r;j++){
      cout<<a[i][j]<<" ";
    }
    cout<<"\n";
  }
    
  return 0;
}