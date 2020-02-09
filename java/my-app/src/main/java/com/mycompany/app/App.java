package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( final String[] args)
    {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}
