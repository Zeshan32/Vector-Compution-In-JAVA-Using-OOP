
package doublevector;

public class DoubleVector {
    private double[] data;


//Default Constructor
    public  DoubleVector()
    {
        data=new double[20];
    }


//Parametrized Constructor
    public DoubleVector(int size)
    {
         if(size>=1 || size<=20)
         {
             data = new double[size];
         }
            System.out.println("Size shoud be in range 1 to 20");
    }


//Setter
    public boolean SetValue(int index,double value)
    {
       if(index<0||index>=data.length)
           return false;
       else
       {
           data[index]=value;
           return true;
       }     
    }
   public  double[] getvector()
   {
     return this.data;
   }
   public int vectorsize()
   {
      return this.data.length;
   }
//Getter
    public double GetValue(int index)
    {
         if(index<0 || index>=data.length)
             return 0;            
         else
             return data[index];    
    }


//CopyMethod
    public boolean Copy(double[] data)
    {
        if(this.data.length==data.length)
        {
		this.data=data;   
        	return true;
	}
        else 
             return false;   
    }


//Sub Method
    public void Sub(double[] data)
    {
        for(int i=0;i<data.length;i++)
        {
                    data[i]=this.data[i]-data[i];
	}
    }

//Print Method
    public void Print()
    {
      for(int i=0;i<data.length;i++)
      {                      
          if(i==0)
              System.out.print("["+data[i]+",");
          else if(i==(data.length)-1)
              System.out.println(data[i]+"]\n");
          else 
          	System.out.print(data[i]+",");
      }
    }  
    
}
