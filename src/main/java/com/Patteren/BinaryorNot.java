package com.Patteren;

public class BinaryorNot {
	public boolean isBinaryNumber(int binary)
    {
        boolean status = true;
        while(true) 
        {
            if(binary == 0) 
            {
                break;
            }
            else 
            {
                int tmp = binary%10;
                if(tmp > 1) 
                {
                    status = false;
                    break;
                }
                binary = binary/10;
            }
        }
        return status;
    }
    public static void main(String a[]) 
    {
    	BinaryorNot mbc = new BinaryorNot();
        System.out.println("Is 1000 binary? :"+mbc.isBinaryNumber(1000));
        System.out.println("Is 1030 binary? :"+mbc.isBinaryNumber(1030));
    }
}
