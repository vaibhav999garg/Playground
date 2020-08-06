#include<bits/stdc++.h>
using namespace std;

struct node{
  int data;
  struct node* next;
};
typedef struct node node;

void push_ll(node **head, node **last, int value){
  node *newNode = new node();
  newNode->data = value;
  newNode->next = NULL;
  if(*head == NULL){
    *head = newNode;
  }
  else{
    (*last)->next = newNode;
  }
  *last = newNode;
}

void swap_nodes(node **head, node **with_next, node**pre){
  if(*with_next == NULL || (*with_next)->next == NULL) return ;
  
  node *temp = (*with_next)->next;
  (*with_next)->next = temp->next;
  temp->next = *with_next;
  
  if(*with_next == *head){
    *head = temp;
  }
  else{
    (*pre)->next = temp;
  }
}

void print(node *head){
  while(head){
    cout<<head->data<<"\n";
    head = head->next;
  }
}

int main(){
  node *head = NULL,*last = NULL;
  int x;
  do{
    cin>>x;
    if(x>=0) push_ll(&head, &last, x);
  }while(x>=0);
  
  if(head && head->next){
    swap_nodes(&head, &head, NULL);
    node *pre = head->next;
    node *temp = pre->next;
  	while(temp && temp->next){
      swap_nodes(&head, &temp, &pre);
      pre = (pre->next)->next;
      temp = pre->next;
    }
  }
  else if(head == NULL){
    cout<<"List is empty";
    exit(0);
  }
  print(head);
  return 0;
}