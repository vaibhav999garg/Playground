#include<iostream>
using namespace std;

struct node{
  int data;
  struct node *left,*right;
  
  node(int x){
    data = x;
    left = NULL;
    right = NULL;
  }
};

void push(node **root,int value){
  node *temp = new node(value);
  if(*root == NULL){
    *root = temp;
  }
  else{
    if((*root)->data > value) push(&((*root)->right), value);
    else push(&((*root)->left), value);
  }
}

int sumOfLeaf(node *root){
  if(root == NULL) return 0;
  if(root->left == NULL && root->right == NULL) return root->data;
  else return sumOfLeaf(root->left) + sumOfLeaf(root->right);
}

int main(){
  struct node *root = NULL;
  int x;
  do{
    cin>>x;
    if(x>=0){
      push(&root,x);
    }
  }while(x>=0);
  cout<<"Sum of all leaf nodes are "<<sumOfLeaf(root);
  
  return 0;
}