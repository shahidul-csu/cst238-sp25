package wk05_mon;

public class StackRunner {
    public static void main(String[] args){
//        String test = "HelloCST238";
        Stack aStack = new Stack(100);
//        Stack anotherStack = new Stack(50000);
        String parenTest1 = "(())()()";
        String parenTest2 = "(())()()(";
        String parenTest3 = "(())()())";
        System.out.println("Is " + parenTest1 + " balanced? " + isBalanced(parenTest1));
        System.out.println("Is " + parenTest2 + " balanced? " + isBalanced(parenTest2));
        System.out.println("Is " + parenTest3 + " balanced? " + isBalanced(parenTest3));

//        for(int i = 0; i < test.length(); i++){
//            aStack.push(test.charAt(i));
//        }
//
//        while(!aStack.isEmpty()){
//            System.out.print(aStack.top() + " ");
////            System.out.print(aStack.top() + " ");
//            aStack.pop();
//        }
//        System.out.println();
    }

    public static boolean isBalanced(String parens){
        Stack aStack = new Stack(parens.length());
        for(int i = 0; i < parens.length(); i++){
            if(parens.charAt(i) == '('){
                aStack.push(parens.charAt(i));
            } else if (parens.charAt(i) == ')') {
                if(aStack.isEmpty()){
                    return false;
                } else{
                    aStack.pop();
                }
            }
//            System.out.println(aStack);
        }
//        System.out.println(aStack);
        return aStack.isEmpty();
    }
}
