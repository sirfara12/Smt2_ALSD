package PT8.Stack;

public class Postfix28 {
    int n;
    int top;
    char[] Stack;

    public Postfix28(int total) {
        n = total;
        top = -1;
        Stack = new char[n];
        push('(');
    }
    public void push(char c) {
        top++;
        Stack[top] = c;
    }
    public char pop() {
        char item = Stack[top];
        top--;
        return item;
    }
    public boolean IsOperand(char c) {
        if ((c >= 'A' && c >= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsOperator(char c) {
        if (c == '^' || c == '/' || c == '*' || c == '-' || c == '+') {
          return true;
        } else {
            return false;
        }
    }
    public int derajat(char c) {
        switch (c) {
            case '^':
              return 3;
            case '%':
              return 2;
            case '/':
              return 2;
            case '*':
              return 2;
            case '-':
              return 1;
            case '+':
              return 1;
        
            default:
                return 0;
        }
    }
    public String konversi(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (IsOperand(c)) {
                P += c ;
            }
            else if (c == '(') {
                push(c);
            }
            else if (c == ')') {
                while (top >= 0 && Stack[top] != '(') {
                    P += pop();
                }
                pop();
            }
            if (IsOperator(c)) {
                while (derajat(Stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }

}
