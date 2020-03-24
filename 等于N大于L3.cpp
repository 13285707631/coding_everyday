#include<iostream>
using namespace std;
int main()
{
    int L,a,i;
    long N;
    cin>>N>>L;
    for(i=L;i<=100;i++)
    {
        if((2*N-i*i+i)%(2*i)==0&&(2*N-i*i+i)/(2*i)<N&&(2*N-i*i+i)/(2*i)>0||(2*N-i*i+i)/(2*i)==0){
            a=(2*N-i*i+i)/(2*i);
            for(int j=0;j<i;j++)
            {
                if(j==i-1)
                    cout<<a+j;
                else
                    cout<<a+j<<" ";
            }
            break;
        }
    }
    if(i==101)
    {
        cout<<"No";
    }

}
