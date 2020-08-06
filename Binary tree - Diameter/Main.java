#include<bits/stdc++.h>
using namespace std;

struct node{
  int data;
  node *left, *right;
  node(int x){
    data = x;
    left = NULL;
    right = NULL;
  }
};

node* push_(queue<int> v){
  node *root = NULL;
  if(v.size()) root = new node(v.front());
  v.pop();
  queue<node*> nodes;
  nodes.push(root);
  while(!v.empty()){
    if(v.size() >=2){
      (nodes.front())->left = new node(v.front());
      v.pop();
      (nodes.front())->right = new node(v.front());
      v.pop();
      nodes.push((nodes.front())->left);
      nodes.push((nodes.front())->right);
      nodes.pop();
    }
    else{
      (nodes.front())->left = new node(v.front());
      v.pop();
    }
  }
  
  return root;
}

int h(node *root){
  if(root == NULL) return 0;
  if(root->left == NULL) return 1;
  int x =  1+h(root->left);
  //cout<<x<<"\n";
  return x;
}

int dia(node *root){
  if(root == NULL) return 0;
  if(root->left == NULL && root->right == NULL) return 1;
  if(root->left == NULL || root->right == NULL) return 2;
  return h(root->left) + 1 + h(root->right);
}

int main(){
  node *root = NULL;
  queue<int> v;
  while(true){
    int x;
    cin>>x;
    if(x>=0) v.push(x);
    else break;
  }
  root = push_(v);
  cout<<"Diameter of the given binary tree is "<<dia(root);
  
  return 0;
}