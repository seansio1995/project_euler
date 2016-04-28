/*
this one should be 
O(n) 
*/
#include <iostream>
using namespace std;

long long factorial(int n)
{
	if (n == 1)
	{
		return 1;
	}
	if(n > 1)
	{
		return n*factorial(n-1);
	}
}


int main()
{
	long long  target=factorial(20);
	//cout<<target<<endl;
	for (int i=100;i<target;i++)
	{
		if(i%20==0 && i%19==0 && i%18==0 && i%17==0 && i%16==0 && i%15==0 && i%14==0 && i%13==0 && i%11==0 )
		{
			cout<<"The number is "<<i<<endl;
			break;
		}
	}
	return 0;
}