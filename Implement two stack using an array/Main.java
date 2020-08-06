#include<iostream>
using namespace std;

void push(int arr[], int &top1, int &top2, int ch, int value){
  if(ch==1){
    arr[++top1] = value;
  }
  else{
    arr[--top2] = value;
  }
}

void display(int arr[], int top1, int top2, int ch){
  if(ch==1){
    for(int i=top1;i>=0;i--) cout<<arr[i]<<" ";
  }
  else{
    for(int i=top2;i<1000;i++) cout<<arr[i]<<" ";
  }
  cout<<"\n";
}

int main(){
  int arr[1000];
  int top1=-1, top2 = 1000;
  int n1,n2;
  cin>>n1;
  for(int i=0;i<n1;i++){
    int x;
    cin>>x;
    push(arr, top1, top2, 1, x);
  }
  cout<<"Stack 1 Elements:\n";
  display(arr,top1,top2,1);
  cin>>n2;
  for(int i=0;i<n2;i++){
    int x;
    cin>>x;
    push(arr, top1, top2, 2, x);
  }
  cout<<"Stack 2 Elements:\n";
  display(arr,top1,top2,2);
  int del1,del2;
  cin>>del1>>del2;
  if(del1 > top1+1){
    cout<<"Stack underflow. pop from stack 1 failed\n";
  }
  if(del2 > 1000-top2){
    cout<<"Stack underflow. pop from stack 2 failed\n";
  }
  top1 = top1 - del1;
  top2 = top2 + del2;
  if(top1<-1) top1=-1;
  if(top2>1000) top2 = 1000;
  cout<<"Stack 1 Elements:\n";
  display(arr,top1,top2,1);
  cout<<"Stack 2 Elements:\n";
  display(arr,top1,top2,2);
  
  return 0;
}