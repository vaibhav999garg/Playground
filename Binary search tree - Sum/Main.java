#include<bits/stdc++.h>
#define ll long long
using namespace std;

struct node{
  ll int data;
  struct node *left, *right;
  node(ll int x){
    data = x;
    left = NULL;
    right = NULL;
  }
};

node* push_in_tree(node *root, queue<ll int> q){
  if(q.empty()) return root;
  root = new node(q.front());
  q.pop();
  queue<node*> nodes;
  nodes.push(root);
  while(!q.empty()){
    if(q.size() >=2){
      node *temp = nodes.front();
      nodes.pop();
      temp->left = new node(q.front());
      q.pop();
      temp->right = new node(q.front());
      q.pop();
      nodes.push(temp->left);
      nodes.push(temp->right);
    }
    else{
      node *temp = nodes.front();
      nodes.pop();
      temp->left = new node(q.front());
      q.pop();
    }
  }
  
  return root;
}

ll int sum(node *root){
  if(root == NULL) return 0;
  return root->data + sum(root->left) + sum(root->right);
}

int main(){
  node *root=NULL;
  queue<ll int> v;
  while(true){
    ll int x;
    cin>>x;
    if(x!=-1) v.push(x);
    else break;
  }
  root = push_in_tree(root,v);
  cout<<"Sum of all nodes are "<<sum(root);
  
  return 0;
}