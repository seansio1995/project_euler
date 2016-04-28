#include <iostream>
using namespace std;

int main()
{
	int sum=0;
	int square=0;
	for(int i=1;i<=100;i++)
	{
		sum+=i;
	}
	int sumSquare=sum*sum;

	for(int i=1;i<=100;i++)
	{
		square+=i*i;
	}

	int diff=sumSquare-square;
	cout<<"The difference is "<<diff<<endl;
	return 0;
}