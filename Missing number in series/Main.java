#include<iostream>
using namespace std;

int bin(int arr[], int start, int end, int a, int d){
  if(arr[start] != a+start*d) return a+start*d;
  
  int mid = (start+end)/2;
  if(arr[mid] == a+mid*d) return bin(arr, mid+1, end, a, d);
  else{
    if(arr[mid-1] == a+(mid-1)*d) return a+mid*d;
    return bin(arr,start+1, mid-1, a, d);
  }
}

int main(){
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++) cin>>arr[i];
  
  int a = arr[0];
  int d = (arr[n-1]-a) / n;
  cout<<bin(arr, 1, n-2, a, d)<<"\n";
  
  return 0;
}