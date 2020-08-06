#include<iostream>
using namespace std;

bool findUnassigned(int sudoku[9][9], int &x, int &y){
  for(x=0;x<9;x++){
    for(y=0;y<9;y++){
      if(sudoku[x][y] == 0) return true;
    }
  }
  return false;
}

bool safeRow(int sudoku[9][9], int row, int num){
  for(int i=0;i<9;i++){
    if(sudoku[row][i] == num) return false;
  }
  return true;
}

bool safeCol(int sudoku[9][9], int col, int num){
  for(int i=0;i<9;i++){
    if(sudoku[i][col] == num) return false;
  }
  return true;
}

bool safeBox(int sudoku[9][9], int row, int col, int num){
  for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
      if(sudoku[i+row][j+col] == num) return false;
    }
  }
  return true;
}

bool isSafe(int sudoku[9][9], int row, int col, int num){
  return safeRow(sudoku, row, num) && safeCol(sudoku, col, num) && safeBox(sudoku, 3*(row/3), 3*(col/3), num);
}

bool solveSudoku(int sudoku[9][9]){
  int row,col;
  if(!findUnassigned(sudoku, row, col)) return true;
  
  for(int i=1;i<=9;i++){
    if(isSafe(sudoku, row, col, i)){
      sudoku[row][col] = i;
      
      if(solveSudoku(sudoku)) return true;
      
      sudoku[row][col] = 0;
    }
  }
  
  return false;
}

int main(){
  int sudoku[9][9] = {0};
  for(int i=0;i<9;i++){
    for(int j=0;j<9;j++){
      cin>>sudoku[i][j];
    }
  }
  
  if(solveSudoku(sudoku)){
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
        cout<<sudoku[i][j];
      }
      cout<<"\n";
    }
  }
  else cout<<"No";
  return 0;
}