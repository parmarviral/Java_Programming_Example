package Cryptography_algorithm;
import java.io.*;
class tran
{
    char arr[][],encrypt[][],decrypt[][],keya[],keytemp[];
    public void creatematrixE(String s,String key,int row,int column)
    {
        arr=new char[row][column];
        int k=0;
        keya=key.toCharArray();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(k<s.length())
                {
                    arr[i][j]=s.charAt(k);
                    k++;
                }
                else
                {
                    arr[i][j]=' ';
                }
            }
        }
    }
    public void createkey(String key,int column)
    {
        keytemp=key.toCharArray();
        for(int i=0;i<column-1;i++)
        {
            for(int j=i+1;j<column;j++)
            {
                if(keytemp[i]>keytemp[j])
                {
                    char temp=keytemp[i];
                    keytemp[i]=keytemp[j];
                    keytemp[j]=temp;
                }
            }
            }
    }
    public void creatematrixD(String s,String key,int row,int column)
    {
        arr=new char[row][column];
        int k=0;
        keya=key.toCharArray();
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
            {
                if(k<s.length())
                {
                    arr[j][i]=s.charAt(k);
                    k++;
                }
                else
                {
                    arr[j][i]=' ';
                }
            }
        }
    }
    public void encrypt(int row,int column)
    {
        encrypt=new char[row][column];
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(keya[i]==keytemp[j])
                {
                    for(int k=0;k<row;k++)
                    {
                        encrypt[k][j]=arr[k][i];
                    }
                    keytemp[j]='?';
                    break;
                }
            }
        }
    }
    public void decrypt(int row,int column)
    {
        decrypt=new char[row][column];
        for(int i=0;i<column;i++)
            {
        for(int j=0;j<column;j++)
        {
            if(keya[j]==keytemp[i])
            {
                for(int k=0;k<row;k++)
                {
                    decrypt[k][j]=arr[k][i];
                }
                keya[j]='?';
                break;
            }
        }
    }
    }
    public void resultE(int row,int column,char arr[][])
    {
        System.out.println("Result:");
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(arr[j][i]);
            }
        }
    }
    public void resultD(int row,int column,char arr[][])
    {
        System.out.println("Result:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]);
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        int row,column,choice;
        tran obj=new tran();
        BufferedReader in=new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Menu:\n1) Encryption\n2) Decryption");
        choice=Integer.parseInt(in.readLine());
        System.out.println("Enter the string:");
        String s=in.readLine();
        System.out.println("Enter the key:");
        String key=in.readLine();
        row=s.length()/key.length();
        if(s.length()%key.length()!=0)
            row++;
        column=key.length();
        switch(choice)
        {
            case 1: obj.creatematrixE(s,key,row,column);
                obj.createkey(key,column);
                obj.encrypt(row,column);
                obj.resultE(row,column,obj.encrypt);
                break;
            case 2: obj.creatematrixD(s,key,row,column);
                obj.createkey(key,column);
                obj.decrypt(row,column);
                obj.resultD(row,column,obj.decrypt);
                break;
        }
    }
}