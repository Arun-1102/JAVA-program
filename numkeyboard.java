import java.util.*;
class numkeyboard{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
String a = s.nextLine();
a = a.toUpperCase();
int result=0;
for(int i=0;i<a.length();i++){
char c = a.charAt(i);
switch(c){
case 'A':
case 'D':
case 'G':
case 'J':
case 'M':
case 'P':
case 'T':
case 'W':
result+=1;
break;
case 'Q':
case 'X':
case 'U':
case 'N':
case 'B':
case 'H':
case 'E':
case 'K':
result+=2;
break;
case 'C':
case 'F':
case 'I':
case 'L':
case 'R':
case 'V':
case 'Y':
case 'O':
result+=3;
break;
case 'S':
case 'Z':
result+=4;
break;
default:
result+=0;
break;
}
}
System.out.print(result);
}
}