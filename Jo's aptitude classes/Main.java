#include<iostream>
int hcf_(int a,int b){
	if(b==0) return a;
  	return (hcf_(b,a%b));
}

int main(){
    int a,b,c,ans;
    std::cin>>a>>b>>c>>ans;
    int x = hcf_(a,b);
  	int y = hcf_(x,c);
  	if(y==ans)  std::cout<<"Answer is correct.";
  	else std::cout<<"Answer is wrong.";
    return 0;
}