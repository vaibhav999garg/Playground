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
      if((*root)->left) add(&((*root)->left),x);
      else{
        node *temp = new node(x);
        (*root)->left = temp;
      }
    }
    else{
      if((*root)->right) add(&((*root)->right),x);
      else{
        node *temp = new node(x);
        (*root)->right = temp;
      }
    }
  }
}

int height(node *root){
  if(root == NULL) return 0;
  if(root->left == NULL && root->right == NULL) return 1;
  if(root->left == NULL) return 1+height(root->right);
  if(root->right == NULL) return 1+height(root->left);
  return 1+max(height(root->left), height(root->right));
}

int main(){
  node *root = NULL;
  while(true){
    int x;
    cin>>x;
    if(x>=0) add(&root, x);
    else break;
  }
  
  cout<<"Height of the tree is "<<height(root);
  
  return 0;
}