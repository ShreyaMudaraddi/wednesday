class Char
{
public static void main(String[]args)
{
char [] arr=new char[4];
arr[0]='A';
arr[1]='B';
arr[2]='C';
arr[3]='D';
System.out.println("index\t values");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}