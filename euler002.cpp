/*
I don't know why this method
only works for fib0 but not
fib1, fib1 should have less time complexity
though
*/

#include <iostream>
#include <cmath>
using namespace std;

int fib0(int n)
{
	if (n==1)
	{
		return 1;
	}

	if (n==2)
	{
		return 2;
	}

	if(n>2)
	{
		return fib0(n-1)+fib0(n-2);
	}
}

int fib1(int n)
{
	return (pow(1+sqrt(5),n)-pow(1-sqrt(5),n))/(sqrt(5)*pow(2,n));
}


int main()
{
	int n=33;
	int res=fib0(n);
	while(res<=4000000)
	{
		n++;
		res=fib0(n);
	}
	cout<<n<<endl;
	int sum=0;
	for (int i=1;i<n;i++)
	{
		int tmp=fib0(i);
		if(tmp%2==0)
		{
			sum+=tmp;
		}
		
	}
	cout<<"The sum is "<<sum<<endl;
	return 0;
}