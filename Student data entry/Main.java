#include <bits/stdc++.h>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   student s;
  cin.getline(s.name,sizeof(s.name));
  cin>>s.roll>>s.marks;
  cout<<"\nStudent Details\nName: "<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks;
  
  return 0;
}