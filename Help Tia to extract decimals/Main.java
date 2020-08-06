#include<iostream>
#include<string>
using namespace std;

int main() {
  std::string fnum;
  cin>>fnum;
  size_t index = fnum.find(".");
  if(index == string::npos) cout<<"Floating part is : ";
  else{
  string ans(fnum.begin()+index+1,fnum.end());
  cout<<"Floating part is : "<<ans<<"\n";
  }
  return 0;
}