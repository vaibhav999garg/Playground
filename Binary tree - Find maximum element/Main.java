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

void push(node **root, int x){
  if(*root == NULL){
    node *temp = new node(x);
    *root = temp;
  }
  else{
    if((*root)->data < x){
      if((*root)->right == NULL){
        node *temp = new node(x);
        (*root)->right = temp;
      }
      else{
        push(&((*root)->right), x);
      }
    }
    else{
      if((*root)->left == NULL){
        node *temp = new node(x);
        (*root)->left = temp;
      }
      else{
        push(&((*root)->left), x);
      }
    }
  }
}

int maxele(node *root){
  if(root == NULL) return 0;
  while(root->right != NULL){
    root = root->right;
  }
  return root->data;
}

int main(){
  node *root = NULL;
  while(true){
    int x;
    cin>>x;
    if(x>=0) push(&root, x);
    else break;
  }
  cout<<"Maximum element is "<<maxele(root);
  
  return 0;
}