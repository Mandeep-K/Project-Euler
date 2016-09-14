

package employee;


public class ProjectEuler9 {
    public static void main(String[] args)
    {
        System.out.println(specPyth(1000));
    }
 static int specPyth(int num)
{
    for (int a = 1; a < num/3; a++)
        for (int b = a + 1; b < num/2; b++)
        {
            int c = num - a - b;
            if (a * a + b * b == c * c)
                return a * b * c; //ans = 31875000 
        }

    return -1;
}
   
    }

