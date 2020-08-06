#include<bits/stdc++.h>
using namespace std;

struct node{
  int data;
  struct node *left, *right;
  node(int x){
    data = x;
    left = NULL;
    right = NULL;
  }
};

node* push_in_tree(node *root, int x){
  if(root == NULL){
    node *temp = new node(x);
    return temp;
  }
  else{
    if(x <= root->data) root->left = push_in_tree(root->left, x);
    else root->right = push_in_tree(root->right, x);
  }
  return root;
}

void width(node *root, int *min, int *max, int now){
  if(!root) return;
  
  if(now < *min) *min = now;
  if(now > *max) *max = now;
  
  width(root->left, min, max, now-1);
  width(root->right, min, max, now+1);
}

int main(){
  node *root=NULL;
  while(true){
    int x;
    cin>>x;
    if(x!= -1) root = push_in_tree(root,x);
    else break;
  }
  int min=0,max=0;
  width(root, &min,&max,0);
  if(root == NULL) 
    cout<<"Tree is empty.";
  else
    cout<<max - min;
  
  return 0;
}