#include<bits/stdc++.h>
using namespace std;

struct node{
  int data;
  struct node *next,*prev;
};
typedef struct node node;

void insert_LL(node **head, node **last, int value){
  if(*head == NULL){
    *head = new node();
    (*head)->data = value;
    (*head)->next = NULL;
    (*head)->prev = NULL;
    *last = *head;
    return;
  }
  
  node *temp=new node();
  temp->data = value;
  temp->next = NULL;
  temp->prev = *last;
  (*last)->next = temp;
  *last = temp;
}

int nth_node(node *last, node *head, int n, int num){
  if(num/2 >= n){
    //traverse from last
    node *temp = last;
    for(int i=1;i<n;i++){
      temp = temp->prev;
    }
    return temp->data;
  }
  else{
    n = num - n + 1;
    node *temp = head;
    for(int i=1;i<n;i++){
      temp = temp->next;
    }
    return temp->data;
  }
}

int main(){
  node *head=NULL, *last=NULL;
  int num=0,x=0;
  do{
    cin>>x;
    if(x>=0){
      num++;
      insert_LL(&head,&last,x);
    }
  }while(x>=0);
  
  int n;
  cout<<"Enter the nth node:\n";
  cin>>n;
  if(head == NULL || num < n) cout<<"There is no nth node in the list";
  else
    cout<<nth_node(last, head, n, num)<<" is the nth node element in the list";
}