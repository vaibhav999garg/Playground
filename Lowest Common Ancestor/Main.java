#include<iostream>
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

void add(node **root, int x){
  if(*root == NULL){
    node *temp = new node(x);
    *root = temp;
  }
  else{
    if(x <= (*root)->data){
      if((*root)->left) add( &((*root)->left), x);
      else{
        node *temp = new node(x);
        (*root)->left = temp;
      }
    }
    else{
      if((*root)->right) add( &((*root)->right), x);
      else{
        node *temp = new node(x);
        (*root)->right = temp;
      }
    }
  }
}

bool search(node *root, int x){
  if(root == NULL) return false;
  if(root->data == x) return true;
  if(root->data > x) return search(root->left, x);
  else return search(root->right, x);
}

int lca(node *root, int m, int n){
  if(root == NULL) return -1;
  if(root->left == NULL || root->right == NULL) return -1;
  if(root->data == m){
    if(search(root, n)) return m;
    else return -1;
  }
  if(root->data == n){
    if(search(root, m)) return n;
    else return -1;
  }
  
  if(root->data < m){
    if(root->data < n){
      return lca(root->right, m, n);
    }
    else{
      if(search(root->right,m) && search(root->left, n)) return root->data;
      else return -1;
    }
  }
  else{
    if(root->data > n){
      return lca(root->left, m, n);
    }
    else{
      if(search(root->right,n) && search(root->left, m)) return root->data;
      else return -1;
    }
  }
}

int main(){
  node *root = NULL;
  int n;
  cin>>n;
  for(int i=0;i<n;i++){
    int x;
    cin>>x;
    add(&root, x);
  }
  int x,y;
  cin>>x>>y;
  cout<<lca(root, x,y);
  
  return 0;
}