#include <iostream>
using namespace std;

int main()
{
	for(int i=999;i>=900;i--)
	{
		for(int j=i;j>=900;j--)
		{
			int final=i*j;
			int a=final/100000;
			int b=(final-a*100000)/10000;
			int c=(final-a*100000-b*10000)/1000;
			int d=(final-a*100000-b*10000-c*1000)/100;
			int e=(final-a*100000-b*10000-c*1000-d*100)/10;
			int f=final-a*100000-b*10000-c*1000-d*100-e*10;

			if(a == f && b == e && c == d)
			{
				cout<<a<<b<<c<<d<<e<<f<<endl;
				break;
			}
		}
	}
	//cout<<"Didn't find anything"<<endl;
	return 0;
}