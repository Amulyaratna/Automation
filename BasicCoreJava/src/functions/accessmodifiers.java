package functions;

import java.nio.channels.AcceptPendingException;

public class accessmodifiers {
public void publicfun()
{
	System.out.println("public from accessModifiers");
}
private void privatefun()
{
	System.out.println("private from accessModifiers");
}
protected void protectedfun()
{
	System.out.println("protected from accessModifiers");
}
void noAccessModfun()

{
	System.out.println("noAccessMod from AccessModifiers");
	
}public static void main(String[] args) {
	accessmodifiers obj=new accessmodifiers();
	obj.privatefun();
	obj.publicfun();
	obj.noAccessModfun();
	obj.protectedfun();
	
			
}
}
