import java.io.*;
public class sentences
{
public static void main(String[] args)
{
int word=0,digits=0,vowels=0;
String s,w;
String words[];
try
{
FileReader fr=new FileReader("file.txt");
BufferedReader br=new BufferedReader(fr);
while((s=br.readLine())!=null)
{
words=s.split(" ");
word+=words.length;
for(int i=0;i<words.length;i++)
{
w=words[i];
for(int j=0;j<w.length();j++)
{
char ch=w.charAt(j);
if(Character.isDigit(ch))
digits++;
if(ch=='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u')
vowels++;
}

}

}
}
catch(Exception e)
{
}
System.out.println("No of digits is "+digits);
System.out.println("No of words is "+word);
System.out.println("No of vowels is "+vowels);
}
}

