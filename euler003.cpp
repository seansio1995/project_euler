/*
In this method
we tend to make a list of all factors
of certain number. And then we find
the max from this list which is the largest
prime factor

two condition, prime factor >1
exhaust the same factor till not applicable
*/

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;



int main()
{
	long long  n;
	vector<long long> arr;
	cout<<"Enter the number n:"<<endl;
	cin>>n;
	long long d=2;
	while(n>1)
	{
		while(n%d==0)
		{
			arr.push_back(d);
			n/=d;
		}
		d+=1;
	}

	long long max=*max_element(arr.begin(),arr.end());
	cout<<"The largest prime factor is "<<max<<endl;
	return 0;
}