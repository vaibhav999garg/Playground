#include<iostream>
using namespace std;

struct node{
  int data,l,r;
  struct node *left, *right;
  
  node(int x){
    data = x;
    l=0;
    r=0;
    left = NULL;
    right = NULL;
  }
};

void push(node **root, int value){
  if(*root == NULL){
    node *temp = new node(value);
    *root = temp;
  }
  else{
    if(value > (*root)->data){
      if((*root)->right != NULL)
      	push(&((*root)->right), value);
      else{
        node *temp = new node(value);
        (*root)->right = temp;
      }
      ((*root)->r)++;
    }
    else{
      if((*root)->left != NULL)
      	push(&((*root)->left), value);
      else{
        node *temp = new node(value);
        (*root)->left = temp;
      }
      ((*root)->l)++;
    }
  }
}

int find_k(node *root, int k){
  //cout<<root->l<<" "<<root->r<<" "<<k<<"\n";
  if(root->l == k-1) return root->data;
  if(root->l > k-1) return find_k(root->left, k);
  else return find_k(root->right, k- root->l - 1);
}

int main(){
  node *root=NULL;
  while(true){
    int x;
    cin>>x;
    if(x>=0) push(&root, x);
    else break;
  }
  int k;
  cout<<"Enter the kth value:\n";
  cin>>k;
  cout<<"Smallest kth value "<<find_k(root, k);
  
  return 0;
}