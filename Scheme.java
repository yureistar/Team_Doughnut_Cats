/*****************************************************
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
      *
      * STACK OF CHOICE: ALStack by Dorothy Ng
      * b/c ...

1. Use a function similar to allMatched to determine the parts of each operation, 
with opening brackets starting the operation, and closing brackets ending the operation.

2. The characters inside the brackets are separated using whitespace,
and we will have a function to parse the code and determine which characters are useful,
and where each character separates from the next.

3. Once inside an opening bracket,
we will store the prefix operator to be used once we determine the operands.

4. After storing the operator, we will store the operands,
and rearrange the sequence so that the function can be performed in valid Java syntax.
      ******************************************************/
      
public class Scheme {

    /****************************************************** 
     * precond:  Assumes expr is a valid Scheme (prefix) expression,
     *           with whitespace separating all operators, parens, and 
     *           integer operands.
     * postcond: Returns the simplified value of the expression, as a String
     * eg,
     *           evaluate( "( + 4 3 )" ) -> 7
     *         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
     ******************************************************/
    public static String evaluate( String expr ) 
    {
    }//end evaluate()


    /****************************************************** 
     * precond:  Assumes top of input stack is a number.
     * postcond: Performs op on nums until closing paren is seen thru peek().
     *           Returns the result of operating on sequence of operands.
     *           Ops: + is 1, - is 2, * is 3
     ******************************************************/
    public static String unload( int op, Stack<String> numbers ) 
    {
    }//end unload()


    /*
    //optional check-to-see-if-its-a-number helper fxn:
    public static boolean isNumber( String s ) {
        try {
	    Integer.parseInt(s);
	        return true;
		}
        catch( NumberFormatException e ) {
	    return false;
	    }
    }
    */


    //main method for testing
    public static void main( String[] args ) {

	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	  String zoo1 = "( + 4 3 )";
	  System.out.println(zoo1);
	  System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
	  //...7

	  String zoo2 = "( + 4 ( * 2 5 ) 3 )";
	  System.out.println(zoo2);
	  System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
	  //...17

	  String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
	  System.out.println(zoo3);
	  System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
	  //...29

	  String zoo4 = "( - 1 2 3 )";
	  System.out.println(zoo4);
	  System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
	  //...-4
          ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    }//main

}//end class Scheme
