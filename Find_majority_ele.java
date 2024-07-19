# include <stdio.h>
void Find_majority_ele(int no_ele,long long int arr[])
{ 
    int index,flag[10000]={0},ctr,compare;
    for(index=0;index<no_ele;index++)
{
ctr=1;
if(flag[index]==0)
{
for(compare=index+1;compare<no_ele;compare++)
{
if(arr[index]==arr[compare])
{
ctr++;
flag[compare]=1;
}
}
if(ctr>=(no_ele/2))
break;
}
}
if(ctr >= (no_ele/2))
printf("The majority element is : %lld", arr[index]);
else
printf("No majority element found in the array");
}
int main()
{
int index,no_ele;
scanf("%d",&no_ele);
long long int arr[no_ele];
for(index=0;index<no_ele;index++)
scanf("%lld",&arr[index]);
Find_majority_ele(no_ele,arr);
return 0;
}


