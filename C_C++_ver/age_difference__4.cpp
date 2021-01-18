#include <iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
    vector<int> v;
    int repeat;
    cin>>repeat;
    int temp;

    for(int i =0; i<repeat; i++){
        cin>>temp;
        v.push_back(temp);
    }
    sort(v.begin(),v.end());
    cout<<v.back()-v[0]<<"\n";
}