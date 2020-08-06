#include <bits/stdc++.h>
using namespace std;

int main(){
	char str[100], rev[100];     
	int count = 0, end, i;    
	cin.getline(str, sizeof(str));
  	for(int i=strlen(str)-1;i>=0;i--){
      	rev[strlen(str) - 1 - i] = str[i];
    }
  
std::cout<<rev;
}