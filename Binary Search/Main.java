#include<iostream>
using namespace std;

int bin(int a[], int start, int end, int x){
  if(a[start] == x) return start;
  if(a[end] == x) return end;
  if(end-start <=1) return -1;
  int mid = (end+start)/2;
  if(a[mid] == x) return mid;
  else if(a[mid] > x) return bin(a,start+1, mid-1, x);
  else return bin(a, mid+1, end-1, x);
}

int main(){
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++) cin>>a[i];
  int x;
  cin>>x;
  int ans = bin(a,0,n-1,x);
  if(ans==-1){
    cout<<"Not found";
  }
  else cout<<ans;
  
  return 0;
}