#include<bits/stdc++.h>
using namespace std;

struct node{
  int data;
  struct node *next,*prev;
};
typedef struct node node;

void push_back(node **head, node **last, int value){
  node *newNode = new node();
  newNode->data = value;
  newNode->next = NULL;
  newNode->prev = *last;
  if(*head == NULL){
    *head = newNode;
  }
  else{
    (*last)->next = newNode;
  }
  *last = newNode;
}

void swapNodes(node **head, int p,int q){
  node *temp1 = *head, *temp2 = *head;
  while(temp1->data != p || temp2->data !=q){
    if(temp1->data != p)
      temp1 = temp1->next;
    if(temp2->data != q)
      temp2 = temp2->next;
  }
  int flag1=0,flag2=0;
  if(temp1 == *head){
    flag1=1;
  }
  if(temp2 == *head){
    flag2 = 1;
  }
  
  if(temp1->next != NULL && (temp1->next) == temp2){
    //cout<<"a";
    node *prev1 = temp1->prev;
    
    temp1->next = temp2->next;
    if(temp2->next != NULL)
    	(temp2->next)->prev = temp1;
    temp1->prev = temp2;
    temp2->next = temp1;
    if(prev1 != NULL)
    	prev1->next = temp2;
    temp2->prev = prev1;
  }
  else if(temp2->next != NULL && (temp2->next) == temp1){
    //cout<<"b";
    node *prev1 = temp2->prev;
    
    temp2->next = temp1->next;
    if(temp1->next != NULL)
    	(temp1->next)->prev = temp2;
    temp2->prev = temp1;
    temp1->next = temp2;
    if(prev1 != NULL)
    	prev1->next = temp1;
    temp1->prev = prev1;
  }
  else{
    //cout<<"c";
  	node *prev1 = temp1->prev;
  	node *next1 = temp1->next;
  	temp1->prev = temp2->prev;
  	temp1->next = temp2->next;
  	if((temp2->next) != NULL)
    	(temp2->next)->prev = temp1;
  	if((temp2->prev) != NULL)
    	(temp2->prev)->next = temp1;
  	temp2->next = next1;
  	temp2->prev = prev1;
  	if(prev1 != NULL)
    	prev1->next = temp2;
  	if(next1 != NULL)
    	next1->prev = temp2;
  }
  
  if(flag1)
    *head = temp2;
  if(flag2)
    *head = temp1;
}

void print(node *head, node *last){
  node *temp = head;
  while(temp != NULL){
    cout<<temp->data<<" ";
    temp = temp->next;
  }
}

int main(){
  int n;
  cin>>n;
  node *head=NULL,*last = NULL;
  for(int i=0;i<n;i++){
    int x;
    cin>>x;
    push_back(&head, &last,x);
  }
  int p,q;
  cin>>p>>q;
  swapNodes(&head, p, q);
  print(head,last);
  
  return 0;
}