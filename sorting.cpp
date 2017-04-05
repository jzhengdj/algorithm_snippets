



#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <bitset>
#include <cstdio>
#include <vector>
#include <cstdlib>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
using namespace std;

void insertionSort2(vector <int>  ar) {
  

}

//insertion: from the second element to the last, insert into the correct location inside the array before.

void insertionSort(int ar_size, int * ar){
  for(int i = 1; i < ar_size; i++){
    int x = ar[i];
    for(int j = i; j >= 0; j--){
      if (j == 0 || ar[j-1] < x) {ar[j]=x; break;}
      else ar[j] = ar[j-1];
    }
  }
}



