#include<bits/stdc++.h>
using namespace std;

struct node{
  int data;
  struct node*next;
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

void reverse(node **head, int k){
  if(*head == NULL || (*head)->next == NULL) return;
  node *curr = *head;
  node *prev = NULL;
  stack<node*> st;
  while(curr){
    int count=0;
    while(count<k && curr){
      st.push(curr);
      curr = curr->next;
      count++;
    }
    
    while(!st.empty()){
      if(prev == NULL){
        prev = st.top();
        st.pop();
        *head = prev;
        prev->next = NULL;
      }
      else{
        prev->next = st.top();
        st.pop();
        prev = prev->next;
        prev->next = NULL;
      }
    }
  }
}

void print(node *head){
  while(head){
    cout<<head->data<<"\n";
    head = head->next;
  }
}

int main(){
  node *head = NULL, *last = NULL;
  int x,len=0;
  do{
    cin>>x;
    if(x>=0){
      push_ll(&head,&last,x);
      len++;
    }
  }while(x>=0);
  int k;
  cin>>k;
  reverse(&head, k);
  print(head);
  
  return 0;
}