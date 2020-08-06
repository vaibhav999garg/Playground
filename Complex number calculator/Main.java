#include <iostream>
using namespace std;

int main() {
  int ch;
  cin>>ch;
  int a,b,x,y;
  cin>>a>>b>>x>>y;
  if(ch==1){
    if(b+y==0) cout<<a+x;
    else if(b+y >0)
      cout<<a+x<<"+"<<b+y<<"i";
    else
      cout<<a+x<<"-"<<abs(b+y)<<"i";
  }
  else if(ch==2){
    if(b-y==0) cout<<a-x;
    else if(b-y >0)
      cout<<a-x<<"+"<<b-y<<"i";
    else
      cout<<a-x<<"-"<<abs(b-y)<<"i";
  }
  else if(ch==3){
    int r = a*x - b*y;
    //int im = b*x + a*y;
    int im = (a+b)*y;
    if(im==0) cout<<r;
    else if(im >0)
      cout<<r<<"+"<<im<<"i";
    else
      cout<<r<<"-"<<abs(im)<<"i";
  }
  else{
  	cout<<"Invalid choice";
  }
  return 0;
}