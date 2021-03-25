
package doublevector;

public class MyMain {

    
    
        public static DoubleVector subVectors(DoubleVector a,DoubleVector b)
    	{
        	DoubleVector vector3=new DoubleVector(20);
        	for(int i=0;i<a.vectorsize();i++)
        	{
           		vector3.getvector()[i]=a.getvector()[i]-b.getvector()[i];
        	}
        	return vector3;
    	}

	public static void main(String[] args) 
	{
		// 1. Define Vectors
      		DoubleVector v1=new DoubleVector(20);
      		DoubleVector v2=new DoubleVector(20);
      		DoubleVector v3=new DoubleVector(20);

      		boolean c1=false,c2=false;

		// 2. Setting Values 
		double[] VectorDouble1={111.1,100.2,37.4,355};
      		double[] VectorDouble2={101,221,133,344};

      		for(int i=0; i<VectorDouble1.length;i++)
      		{
        		c1= v1.SetValue(i, VectorDouble1[i]);
          		c2= v2.SetValue(i, VectorDouble2[i]);
      		}
       		if(c1==true && c2==true)
		{
          		System.out.println("Values has been setted repective vector successfully!!!");
		}

		// 3. Subtraction of vector2 from vector1 & storing the result in vector3 using the static method subVectors.
       		v3=subVectors(v1,v2);
		
		// 4. Subtraction of vector2 from vector1 and storing the result in vector1 using the method Sub from the class VectorDouble.
       		v1.Sub(v2.getvector());

		// 5. Printing all the three vectors using the Print() method in the class VectorDouble.
       		v1.Print();
       		v2.Print();
       		v2.Print();

} 
    }
    

