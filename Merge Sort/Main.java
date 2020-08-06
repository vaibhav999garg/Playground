#include<bits/stdc++.h>
using namespace std;

void merge(int a[], int start, int mid, int end){
  int n1 = mid - start+1;
  int n2 = end-mid;
  int x[n1],y[n2];
  for(int i=start;i<=mid;i++){
    x[i-start] = a[i];
  }
  for(int i=mid+1;i<=end;i++){
    y[i-mid-1] = a[i];
  }
  int i=0,j=0,k=start;
  while(i<n1 && j<n2){
    if(x[i] <= y[j]){
      a[k] = x[i];
      i++;
    }
    else{
      a[k] = y[j];
      j++;
    }
    k++;
  }
  
  while(i<n1){
    a[k] = x[i];
    i++;
    k++;
  }
  while(j<n2){
    a[k] = y[j];
    j++;
    k++;
  }
}

void merge_sort(int a[], int start, int end){
  if(start<end){
    int mid = (start+end)/2;
    merge_sort(a,start,mid);
    merge_sort(a,mid+1,end);
    merge(a,start,mid,end);
  }
}

int main(){
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++) cin>>a[i];
  cout<<"Before Sort:\n";
  for(int i=0;i<n;i++) cout<<a[i]<<" ";
  cout<<"\n";
  cout<<"After Sort:\n";
  
  merge_sort(a,0,n-1);
  for(int i=0;i<n;i++) cout<<a[i]<<" ";
  return 0;
}