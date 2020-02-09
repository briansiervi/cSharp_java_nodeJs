package com.mycompany.app;
import java.util.Collection;
import java.util.ArrayList;

/**
 * Friend
 */
public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
        // throw new UnsupportedOperationException("Waiting to be implemented.");
        boolean connected = false;
        Collection<Friend> nextFriend = friend.friends;

        for (Friend friend2 : nextFriend) {
            if (friend2.email.equals(this.getEmail())) {
                connected = true;
            }else if(!friend2.friends.isEmpty()){
                nextFriend = friend2.friends;
            }
        }

        return connected;
    }

    // public static void main(String[] args) {
    //     Friend a = new Friend("A");
    //     Friend b = new Friend("B");
    //     Friend c = new Friend("C");

    //     a.addFriendship(b);
    //     b.addFriendship(c);

    //     System.out.println(a.canBeConnected(c));
    // }
}