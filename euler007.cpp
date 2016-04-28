#include <iostream>
#include <cmath>
using namespace std;

// int main()
// {
// 	int count=0;
// 	bool isPrime=true;
// 	long long i;
// 	while(count<10001)
// 	{
// 		for(i=2;i<9223372036854775807;i++)
// 		{
// 			for(long long j=2;j<sqrt(i);j++)
// 			{
// 				if(i%j==0)
// 				{
// 					isPrime=false;
// 				}
// 			}
// 			if(isPrime==true)
// 			{
// 				count++;
// 			}

// 		}
// 	}
// 	cout<<"The 10001st prime number is "<<i<<endl;
// 	return 0;
// }

bool isPrime(int n)
{
	bool isPrime=true;
	if( n==2 || n==3)
	{
		isPrime=true;
	}
	if(n>3){
	for(int i=2;i<=sqrt(n);i++)
	{
		if(n%i==0)
		{
			isPrime=false;
		}
	}
}
	return isPrime;
}


int main()
{
	// int n;
	// cout<<"Enter a number:"<<endl;
	// cin>>n;
	// if(isPrime(n))
	// {
	// 	cout<<"It is a prime"<<endl;
	// }

	// else
	// {
	// 	cout<<"It's not a prime"<<endl;
	// }

	int count=1;
	int i=3;
	while(count<10001)
	{
		if(isPrime(i))
		{
			count++;
		}
		i+=2;
	}
	cout<<"The 10001st prime is "<<i-2<<endl;

	return 0;
}